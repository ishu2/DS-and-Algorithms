package BinaryTree;

import java.util.Scanner;

public class SymmetricTree {
	
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
	
	public static boolean isSymmetric(Node<Integer> root)
	{
		if(root==null || root.left==null && root.right==null)
		{
			return true;
		}
		return checkSymmetric(root.left,root.right);
	}
	
	public static boolean checkSymmetric(Node<Integer> l,Node<Integer> r)
	{
		if(l==null && r==null)
		{
			return true;
		}
		if((l==null && r!=null) || (r==null && l!=null))
		{
			return false;
		}
		if(l.data!=r.data)
		{
			return false;
		}
		return checkSymmetric(l.left,r.right) && checkSymmetric(l.right,r.left);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		boolean res=isSymmetric(root);
		System.out.println(res);
	}

}
