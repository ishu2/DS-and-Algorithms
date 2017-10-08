package BinaryTree;

import java.util.Scanner;

public class SumOfAllLeftLeaves {
	
	public static int sumOfLeftLeafNodes(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return root.data;
		}
		if(root.left==null && root.right!=null)
		{
			return sumOfLeftLeafNodes(root.right);
		}
		if(root.right==null && root.left!=null && root.left.left==null && root.left.right==null)
		{
			return root.left.data;
		}
		else if(root.right!=null)
		{
			if(root.left!=null && root.left.left==null && root.left.right==null)
			{
				return root.left.data+sumOfLeftLeafNodes(root.right);
			}
		}
		return sumOfLeftLeafNodes(root.left)+sumOfLeftLeafNodes(root.right);
	}
	
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
	
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		int sum=sumOfLeftLeafNodes(root);
		System.out.println(sum);
	}

}
