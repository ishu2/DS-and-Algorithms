package BinaryTree;

import java.util.Scanner;

public class FindMaximumValueInTree {
	
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
	
	public static int findMax(Node<Integer> root)
	{
		if(root==null)
		{
			return -1;
		}
		return Math.max(Math.max(findMax(root.left),findMax(root.right)),root.data);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		int max=findMax(root);
		System.out.println("Maximum value = "+max);
	}

}
