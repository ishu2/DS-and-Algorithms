package BinaryTree;

import java.util.Scanner;

public class FindSumOfAllLeftLeaves {

static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
		{
			return null;
		}
		Node<Integer> root=new Node<>(data);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	static int sum=0; 
	
	public static void sumOfLeftLeaves(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		if(root.left==null && root.right==null)
		{
			return;
		}
		if(root.left!=null && root.left.left==null && root.left.right==null)
		{
			sum+=root.left.data;
		}
		sumOfLeftLeaves(root.left);
		sumOfLeftLeaves(root.right);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		sumOfLeftLeaves(root);
		System.out.println(sum);
	}
	
}
