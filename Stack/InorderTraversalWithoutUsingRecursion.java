package Stack;
import java.util.Scanner;
import java.util.Stack;

import BinaryTree.Node;

public class InorderTraversalWithoutUsingRecursion {
	
	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter rootdata ;");
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
	
	public static void inorderTraversalWithoutUsingRecursion(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Stack s=new Stack();
		s.push(root);
		root=root.left;
		while(!(s.isEmpty()))
		{
				while(root!=null)
				{
					s.push(root);
					root=root.left;
				}
				if(!(s.isEmpty()))
				{
			      root=(Node<Integer>) s.pop();
				  System.out.println(root.data);
				  root=root.right;
				}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node<Integer> root=constructTree();
		inorderTraversalWithoutUsingRecursion(root);
	}

}
