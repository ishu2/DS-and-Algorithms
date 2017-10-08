package BinarySearchTree;

import java.util.Scanner;

public class KthSmallestElementInBST {
	
	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
			return null;
		Node<Integer> root=new Node<>(data);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	static int n=0;
	
	public static void printKthSmallest(Node<Integer> root,int k)
	{
		if(root==null)
		{
			return;
		}
		if(root.left==null && root.right==null)
		{
			n+=1;
			if(n==k)
				System.out.println(root.data);
			return;
		}
		printKthSmallest(root.left,k);
		n+=1;
		if(n==k)
		{
			System.out.println(root.data);
			return;
		}
		printKthSmallest(root.right,k);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		System.out.println("Enter k :");
		int k=s.nextInt();
		printKthSmallest(root,k);
	}

}
