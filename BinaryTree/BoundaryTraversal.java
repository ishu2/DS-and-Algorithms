package BinaryTree;

import java.util.Scanner;

public class BoundaryTraversal {
	
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
	
	public static void boundaryTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return ;
		}
		System.out.println(root.data);
		leftTraversal(root.left);
		bottomTraversal(root.left);
		bottomTraversal(root.right);
		rightTraversal(root.right);
	}
	
	public static void leftTraversal(Node<Integer> root)
	{
		if(root==null || (root.left==null && root.right==null))
		{
			return;
		}
		if(root.left!=null)
		{
		  System.out.println(root.data);
		  leftTraversal(root.left);
		}
		else if(root.right!=null)
		{
			System.out.println(root.data);
			leftTraversal(root.right);
		}
	}
	
	public static void bottomTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		bottomTraversal(root.left);
		if(root.left==null && root.right==null)
		{
			System.out.println(root.data);
			return;
		}
		bottomTraversal(root.right);
	}
	
	public static void rightTraversal(Node<Integer> root)
	{
		if(root==null || (root.left==null && root.right==null))
		{
			return;
		}
		if(root.right!=null)
		{
			rightTraversal(root.right);
			System.out.println(root.data);
		}
		else if(root.left!=null)
		{
			rightTraversal(root.left);
			System.out.println(root.data);
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		boundaryTraversal(root);
	}

}
