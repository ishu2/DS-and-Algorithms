package BinaryTree;

import java.util.Scanner;

public class SumOfAllLeaves {
	
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
	
	public static int sumOfLeaves(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return root.data;
		}
		return sumOfLeaves(root.left)+sumOfLeaves(root.right);
	}

	public static void main(String[] args) {
		Node<Integer> root=constructTree();
	    int res=sumOfLeaves(root);
	    System.out.println("Sum = "+res);
	}
	
}
