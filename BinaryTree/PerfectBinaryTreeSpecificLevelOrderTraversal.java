package BinaryTree;

import java.util.Scanner;

public class PerfectBinaryTreeSpecificLevelOrderTraversal {
	
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
	
	public static void printSpecificLevelOrder(Node<Integer> root) throws queueUnderflow
	{
		if(root==null)
		{
			return;
		}
		Queue<Node> q=new Queue<>();
		System.out.print(root.data+" ");
		q.enque(root.left);
		q.enque(root.right);
		while(!q.isEmpty())
		{
			Node<Integer> first=q.deque();
			Node<Integer> second=q.deque();
			System.out.print(first.data+" ");
			System.out.print(second.data+" ");
			if(!isLeaf(first) && !isLeaf(second))
			{
				q.enque(first.left);
				q.enque(second.right);
				q.enque(first.right);
				q.enque(second.left);
			}
		}
	}
	
	public static boolean isLeaf(Node<Integer> root)
	{
		if(root.left==null && root.right==null)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		printSpecificLevelOrder(root);
	}

}
