package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

public class PrintAncestorsOfAGivenNode {

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
	
	public static boolean printAncestorsOfK(Node<Integer> root,int k)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==k)
		{
			return true;
		}
		if(printAncestorsOfK(root.left,k) || printAncestorsOfK(root.right,k))
		{
			System.out.println(root.data);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
	Node<Integer> root=constructTree();
	System.out.println("Enter node whose ancestors you want to find:");
	int k=s.nextInt();
	printAncestorsOfK(root,k);
	}
	
}
