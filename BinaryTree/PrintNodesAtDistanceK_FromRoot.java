package BinaryTree;

import java.util.Scanner;

public class PrintNodesAtDistanceK_FromRoot {

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
	
	public static void printNodesAtDistanceK(Node<Integer> root,int k)
	{
		if(root==null)
		{
			return;
		}
		if(k==0)
		{
			System.out.print(root.data+" ");
			return;
		}
		printNodesAtDistanceK(root.left,k-1);
		printNodesAtDistanceK(root.right,k-1);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		System.out.println("Enter k :");
		int k=s.nextInt();
		printNodesAtDistanceK(root,k);
	}
	
}
