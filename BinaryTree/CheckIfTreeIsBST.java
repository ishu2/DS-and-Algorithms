package BinaryTree;

import java.util.Scanner;

public class CheckIfTreeIsBST {
	
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
	
	public static int largest(Node<Integer> root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		if(root.right==null)
		{
			return root.data;
		}
		return largest(root.right);
	}
	
	public static int smallest(Node<Integer> root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		if(root.left==null)
		{
			return root.data;
		}
		return smallest(root.left);
	}
	
	public static boolean isBST(Node<Integer> root)
	{
		if(root==null || (root.left==null && root.right==null))
		{
			return true;
		}
		int leftLargest=largest(root.left);
		if(leftLargest>root.data)
		{
			return  false;
		}
		int rightSmallest=smallest(root.right);
		if(rightSmallest<root.data)
		{
			return  false;
		}
		boolean res=isBST(root.left);
		if(!(res))
		{
			return false;
		}
		res=isBST(root.right);
		return res;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
	    boolean res=isBST(root);
	    if(res)
	    {
	    	System.out.println("YES , tree is BST.");
	    }
	    else
	    {
	    	System.out.println("NO , tree is not BST.");
	    }
	}

}
