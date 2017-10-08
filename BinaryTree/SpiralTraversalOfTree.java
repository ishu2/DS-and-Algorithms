package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

public class SpiralTraversalOfTree {
	
	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree()
	{
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
	
	public static void spiralOrderTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Stack odd=new Stack();
		Stack even=new Stack();
		even.push(root);
		while(!(odd.isEmpty()) || !(even.isEmpty()))
		{
			if(!(odd.isEmpty()))
			{
				while(!(odd.isEmpty()))
				{
				Node<Integer> elt=(Node<Integer>) odd.pop();
				if(elt.left!=null)
				{
				   even.push(elt.left);
				}
				if(elt.right!=null)
				{
				   even.push(elt.right);
				}
				System.out.print(elt.data+" ");
				}
			}
			else
			{
				while(!(even.isEmpty()))
				{
					Node<Integer> elt=(Node<Integer>) even.pop();
				    if(elt.right!=null)
				    {
					   odd.push(elt.right);
				    }
				    if(elt.left!=null)
				    {
					   odd.push(elt.left);
				    }
					System.out.print(elt.data+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	Node<Integer> root=constructTree();	
	spiralOrderTraversal(root);
	}

}
