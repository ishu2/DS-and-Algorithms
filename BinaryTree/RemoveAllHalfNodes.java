//  Half nodes are the nodes which have only one child.

package BinaryTree;

import java.util.Scanner;

public class RemoveAllHalfNodes {

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
	
	public static void printTree(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	
	public static Node<Integer> removeHalfNodes(Node<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		root.left=removeHalfNodes(root.left);
		root.right=removeHalfNodes(root.right);
		if(root.left==null && root.right==null)
		{
			return root;
		}
		else if(root.left==null)
		{
			Node<Integer> res=root.right;
			return res;
		}
		else if(root.right==null)
		{
			Node<Integer> res=root.left;
	        return res;
		}
		return root;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
	    Node<Integer> res=removeHalfNodes(root);
	    printTree(res);
	}
	
}
