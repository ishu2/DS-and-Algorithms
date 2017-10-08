package BinaryTree;

import java.util.Scanner;

public class CheckIfTwoTreesAreIdentical {
	
	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree()
	{
	  System.out.println("Enter root data");
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
	
	public static boolean checkIdentical(Node<Integer> root1,Node<Integer> root2)
	{
		if(root1==null && root2==null)
		{
			return true;
		}
		if(root1==null || root2==null)
		{
			return false;
		}
		if(root1.data!=root2.data)
		{
			return false;
		}
		boolean res1=checkIdentical(root1.left,root2.left);
		if(!res1)
		{
			return false;
		}
		res1=checkIdentical(root1.right,root2.right);
		return res1;
	}
	
	public static void main(String[] args) {
		System.out.println("Create 1st tree :");
		Node<Integer> root1=constructTree();
		System.out.println("Create 2nd tree :");
		Node<Integer> root2=constructTree();
		boolean res=checkIdentical(root1,root2);
		if(res)
		{
			System.out.println("Both trees are identical.");
		}
		else
		{
			System.out.println("Trees are not identical.");
		}
	}

}
