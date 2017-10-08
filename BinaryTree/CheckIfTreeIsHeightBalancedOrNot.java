package BinaryTree;

import java.util.Scanner;

public class CheckIfTreeIsHeightBalancedOrNot {

	public static Node<Integer> constructTree()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rootdata :");
		int rootdata=s.nextInt();
		if(rootdata==-1)
		{
			return null;
		}
		Node<Integer> root=new Node<>(rootdata);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	public static int height(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int h1=height(root.left);
		int h2=height(root.right);
		return Math.max(h1, h2)+1;
	}
	
	public static boolean checkBalanced(Node<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		int lHeight=height(root.left);
		int rHeight=height(root.right);
		if(!(lHeight==rHeight || lHeight-1==rHeight || rHeight-1==lHeight))
		{
			return false;
		}
		boolean res=checkBalanced(root.left);
		if(!(res))
		{
			return false;
		}
		res=checkBalanced(root.right);
		return res;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		int result=height(root);
		System.out.println("Height of tree = "+result);
		boolean res=checkBalanced(root);
		if(res)
		{
			System.out.println("BALANCED");
		}
		else
		{
			System.out.println("NOT BALANCED");
		}
	}
	
}
