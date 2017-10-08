package BinaryTree;

import java.util.Scanner;

public class CheckIfTreeIsHeightBalanced {
	
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
	
	public static boolean isHeightBalanced(Node<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		int h1=height(root.left);
		int h2=height(root.right);
		if(!(Math.abs(h1-h2)>1))
		{
			return isHeightBalanced(root.left)&&isHeightBalanced(root.right);
		}
		return false;
	}
	
	public static int height(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		return Math.max(height(root.left), height(root.right))+1;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		boolean res=isHeightBalanced(root);
		System.out.println(res);
	}

}
