package BinaryTree;

import java.util.Scanner;

public class CheckWhetherTreeIsFullBinaryTree {

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
	
	public static boolean isFullTree(Node<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		if((root.left!=null && root.right==null) || (root.left==null && root.right!=null))
		{
			return false;
		}
		return isFullTree(root.left)&&isFullTree(root.right);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		boolean res=isFullTree(root);
		System.out.println(res);
	}
	
}
