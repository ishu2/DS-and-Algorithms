package BinaryTree;

import java.util.Scanner;

public class Check_If_2_TreesAreIdentical {
	
	public static Node<Integer> constructTree()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter rootdata");
		int rootdata=s.nextInt();
		if(rootdata==-1)
		{
			return null;
		}
		Node<Integer> root=new Node<Integer>(rootdata);
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
	
	public static boolean checkIdentical(Node<Integer> root1,Node<Integer> root2)
	{
		if(root1==null && root2==null)
		{
			return true;
		}
		if((root1==null && root2!=null) || (root2==null && root1!=null))
		{
			return  false;
		}
		int h1=height(root1);
		int h2=height(root2);
		if(h1!=h2)
		{
			return false;
		}
		if(h1==h2 && root1.data!=root2.data)
		{
			return false;
		}
		boolean res=checkIdentical(root1.left,root2.left);
		if(!(res))
		{
			return false;
		}
		res=checkIdentical(root1.right,root2.right);
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println("Create 1st tree :");
		Node<Integer> root1=constructTree();
		System.out.println("Create 2nd tree :");
	    Node<Integer> root2=constructTree();
	    boolean res=checkIdentical(root1,root2);
	    if(res)
	    {
	    	System.out.println("Both trees are identical..");
	    }
	    else
	    {
	    	System.out.println("Trees are not identical..");
	    }
	}

}
