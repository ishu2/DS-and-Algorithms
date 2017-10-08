package BinaryTree;

import java.util.Scanner;

public class FindSumOfDiagonals {
	
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
	
	public static void printDiagonalSums(Node<Integer> root) throws queueUnderflow
	{
		if(root==null)
		{
			System.out.println("No diagonal exists !!");
			return;
		}
		Queue<Node<Integer>> q=new Queue<>();
		q.enque(root);
		q.enque(null);
		int sum=0;
		while(!(q.isEmpty()))
		{
			Node<Integer> elt=q.deque();
			if(elt==null)
			{
				System.out.println(sum);
				sum=0;
				q.enque(null);
				elt=q.deque();
				if(elt==null)
				{
					break;
				}
			}
			while(elt!=null)
			{
				if(elt.left!=null)
				{
					q.enque(elt.left);
				}
				sum=sum+elt.data;
				elt=elt.right;
			}
		}
	}
	
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		printDiagonalSums(root);
	}

}
