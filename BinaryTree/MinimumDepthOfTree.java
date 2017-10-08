package BinaryTree;

import java.util.Scanner;

public class MinimumDepthOfTree {
	
	public static Node<Integer> constructTree()
	{
		Scanner s=new Scanner(System.in);
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
	
	public static int minimumHeight(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int lHeight=minimumHeight(root.left);
		int rHeight=minimumHeight(root.right);
		return Math.min(lHeight, rHeight)+1;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		int h=minimumHeight(root);
		System.out.println("Height of tree is : "+h);
	}

}
