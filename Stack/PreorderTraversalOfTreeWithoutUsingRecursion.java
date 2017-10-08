package Stack;
import java.util.Scanner;
import java.util.Stack;

import BinaryTree.Node;

public class PreorderTraversalOfTreeWithoutUsingRecursion {

	public static Node<Integer> constructTree()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter data :");
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
	
	public static void preorderTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Stack s=new Stack();
		s.push(root);
		while(!(s.isEmpty()))
		{
	        Node<Integer> curr=(Node<Integer>) s.pop();
	        System.out.println(curr.data);
	        if(curr.right!=null)
	        {
	        	s.push(curr.right);
	        }
	        if(curr.left!=null)
	        {
	        	s.push(curr.left);
	        }
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		preorderTraversal(root);
	}
	
}
