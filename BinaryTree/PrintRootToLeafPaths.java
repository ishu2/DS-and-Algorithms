package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

public class PrintRootToLeafPaths {
	

	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
		{
			return null;
		}
		Node<Integer> root=new Node<>(data);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	public static void printPaths(Node<Integer> root,Stack<Integer> stack)
	{
		if(root==null)
		{
			return;
		}
		stack.push(root.data);
		printPaths(root.left,stack);
		printPaths(root.right,stack);
		if(root.left==null && root.right==null)
		{
		  printStack(stack);
		}
		stack.pop();
	}
	
	public static void printStack(Stack<Integer> s1)
	{
		Stack<Integer> s2=new Stack<>();
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		while(!s2.isEmpty())
		{
			int elt=s2.pop();
			System.out.print(elt+" --> ");
			s1.push(elt);
		}
		System.out.println("NULL");
	}
	
	public static void main(String[] args) {
	Node<Integer> root=constructTree();
	Stack<Integer> stack=new Stack<>();
	printPaths(root,stack);
	}

}
