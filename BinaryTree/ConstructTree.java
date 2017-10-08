package BinaryTree;

import java.util.Scanner;

public class ConstructTree {
	
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
	
	public static void preOrderTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public static void inOrderTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	
	public static void postOrderTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		System.out.println("** PRE ORDER TRAVERSAL **");
		preOrderTraversal(root);
		System.out.println("** IN ORDER TRAVERSAL **");
		inOrderTraversal(root);
		System.out.println("** POST ORDER TRAVERSAL **");
		postOrderTraversal(root);
	}

}
