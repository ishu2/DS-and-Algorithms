package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

public class PrintRootToLeafPathOfAllLeafNodes {
	
	static Scanner s=new Scanner(System.in);
	static Stack<Integer> stack=new Stack<>();
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter rootdata :");
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
	
	public static void printRootToLeafPaths(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		stack.push(root.data);
		printRootToLeafPaths(root.left);
		printRootToLeafPaths(root.right);
		printPath(stack);
	}
	
	public static void printPath(Stack stack)
	{
		Stack<Integer> s1=new Stack<>();
		while(!(stack.isEmpty()))
		{
			s1.push((Integer) stack.pop());
		}
		while(s1.size()!=1)
		{
			int elt=s1.pop();
			System.out.print(elt+" --> ");
			stack.push(elt);
		}
		System.out.println(s1.pop());
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		Stack<Integer> s1=new Stack<>();
	    printRootToLeafPaths(root);
	}

}
