package BinaryTree;

import java.util.Scanner;

public class ConvertTreeToSumTree {
	
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
	
	public static void printTree(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	
	public static int sumTree(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			int sum=root.data;
			root.data=0;
			return sum;
		}
		int l=sumTree(root.left);
		int r=sumTree(root.right);
		int sum=root.data+l+r;
		root.data=l+r;
		return sum;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		sumTree(root);
		printTree(root);
	}

}
