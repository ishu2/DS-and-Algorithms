package BinaryTree;

import java.util.Scanner;

public class ModifyTreeSuchThatEveryNodesConatinsSumOfAllNodesInLeftSubtree {
	
static Scanner s=new Scanner(System.in); 
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
		{
			return  null;
		}
		Node<Integer> root=new Node<Integer>(data);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	public static int modifyTree(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int l=modifyTree(root.left);
		root.data+=l;
		int r=modifyTree(root.right);
		return root.data+r;
	}
	
	public static void printTree(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		printTree(root.left);
		System.out.println(root.data);
		printTree(root.right);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		modifyTree(root);
		printTree(root);
	}

}
