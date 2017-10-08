package BinaryTree;

import java.util.Scanner;

public class DoubleTree {
		
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
	
	public static void createDoubleTree(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		createDoubleTree(root.left);
		Node<Integer> n=new Node<>(root.data);
		n.left=root.left;
		root.left=n;
		createDoubleTree(root.right);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		createDoubleTree(root);
		printTree(root);
	}

}
