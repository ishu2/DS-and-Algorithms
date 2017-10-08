package Stack;

import java.util.Scanner;
import java.util.Stack;

import BinaryTree.Node;

public class PostOrderTraversalWithoutUsingRecursion {
	
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
	
	public static void postorderTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Stack s1=new Stack();
		Stack s2=new Stack();
		s1.push(root);
		while(!(s1.isEmpty()))
		{
			Node<Integer> curr=(Node<Integer>)s1.pop();
			if(curr.left!=null)
			{
				s1.push(curr.left);
			}
			if(curr.right!=null)
			{
				s1.push(curr.right);
			}
			s2.push(curr);
		}
		System.out.println("Postorder traversal :-");
		while(!(s2.isEmpty()))
		{
			Node<Integer> res=(Node<Integer>)s2.pop();
			System.out.println(res.data);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node<Integer> root=constructTree();
	    postorderTraversal(root);
	}

}
