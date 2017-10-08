package BinaryTree;

import java.util.Scanner;

public class FoldableBinaryTree {
	
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
	
	public static boolean checkFoldable(Node<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		return isFoldable(root.left,root.right);
	}
	
	public static boolean isFoldable(Node<Integer> l,Node<Integer> r)
	{
		if(l==null && r==null)
		{
			return true;
		}
		if((l==null && r!=null) || (r==null && l!=null))
		{
			return false;
		}
		return isFoldable(l.left,r.right)&&isFoldable(l.right,r.left);
	}
	
	public static void main(String[] args)
	{
		Node<Integer> root=constructTree();
		boolean res=checkFoldable(root);
		System.out.println(res);
	}

}
