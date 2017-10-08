package BinaryTree;

import java.util.Scanner;

public class CheckIf2TreesAreIdenticalWithoutUsingRecursion {

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
	
	public static boolean checkIdentical(Node<Integer> root1,Node<Integer> root2) throws queueUnderflow
	{
		if(root1==null && root2==null)
		{
			return true;
		}
		if(root1==null || root2==null)
		{
			return false;
		}
		boolean res=true;
		Queue<Node<Integer>> q1=new Queue<>();
		Queue<Node<Integer>> q2=new Queue<>();
		q1.enque(root1);
		q2.enque(root2);
		int c=1;
		int max1=0;
		int max2=0;
		while(!(q1.isEmpty() && q2.isEmpty()))
		{
			while(c>0)
			{
			  Node<Integer> elt1=q1.deque();
			  Node<Integer> elt2=q2.deque();
			  if(elt1.data!=elt2.data)
			  {
				return false;
			  }
			  if(elt1.left!=null)
			  {
				q1.enque(elt1.left);
				max1++;
			  }
			  if(elt1.right!=null)
			  {
				  q1.enque(elt1.right);
				  max1++;
			  }
			  if(elt2.left!=null)
			  {
				  q2.enque(elt2.left);
				  max2++;
			  }
			  if(elt2.right!=null)
			  {
				  q2.enque(elt2.right);
				  max2++;
			  }
			  c--;
			}
			if(max1==max2)
			{
	    	  c=max1;
			}
			else
			{
				return false;
			}
			max1=0;
			max2=0;
		}
		return true;
	}
	
	public static void main(String[] args) throws queueUnderflow {
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
