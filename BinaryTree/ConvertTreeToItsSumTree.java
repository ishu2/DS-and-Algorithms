// Every node is replaced by the sum of left and right subtree sum.

package BinaryTree;

import java.util.Scanner;

public class ConvertTreeToItsSumTree {
	
	public static Node<Integer> constructTree()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter rootdata");
		int rootdata=s.nextInt();
		if(rootdata==-1)
		{
			return null;
		}
		Node<Integer> root=new Node<Integer>(rootdata);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	
	public static Node<Integer> sumTree(Node<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		if(root.left==null && root.right==null)
		{
			root.data=0;
			return root;
		}
		root.data=leftAndRightSubtreeSum(root)-root.data;
		root.left=sumTree(root.left);
		root.right=sumTree(root.right);
		return root;
	}
	
	public static int leftAndRightSubtreeSum(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int lsum=0;
		int rsum=0;
		lsum=leftAndRightSubtreeSum(root.left);
		rsum=leftAndRightSubtreeSum(root.right);
		return lsum+rsum+root.data;
	}
	
	public static void preorderTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		Node<Integer> newRoot=sumTree(root);
		preorderTraversal(newRoot);
	}

}
