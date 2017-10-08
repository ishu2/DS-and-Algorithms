package BinaryTree;

import java.util.Scanner;

public class FindMaximumSumLeafToRootPath {
	
static Scanner s=new Scanner(System.in); 
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
		{
			return  null;
		}
		Node<Integer> root=new Node<Integer>(data);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	public static int maxSum(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return root.data;
		}
		int l=maxSum(root.left);
		int r=maxSum(root.right);
		return root.data+Math.max(l, r);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		int res=maxSum(root);
		System.out.println("Sum = "+res);
	}

}
