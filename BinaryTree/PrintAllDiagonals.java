package BinaryTree;

import java.util.Scanner;

public class PrintAllDiagonals {
	
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
	
	public static void printDiagonals(Node<Integer> root) throws queueUnderflow
	{
		if(root==null)
		{
			System.out.println("No diagonal exists !!");
			return;
		}
		Queue<Node<Integer>> q=new Queue<>();
		q.enque(root);
		q.enque(null);
		while(!(q.isEmpty()))
		{
			Node<Integer> elt=q.deque();
			if(elt==null)
			{
				q.enque(null);
				System.out.println();
				elt=q.deque();
				if(elt==null)
				{
					return;
				}
			}
			while(elt!=null)
			{
				System.out.print(elt.data+" --> ");
				if(elt.left!=null)
				{
					q.enque(elt.left);
				}
				elt=elt.right;
			}
		}
	}
	
	public static void main(String[] args) throws queueUnderflow {
	Node<Integer> root=constructTree();
	System.out.println("Diagonals of tree are :-");
	printDiagonals(root);
	}

}
