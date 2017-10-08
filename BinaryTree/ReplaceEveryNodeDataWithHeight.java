package BinaryTree;

import java.util.Scanner;

public class ReplaceEveryNodeDataWithHeight {

	public static void main(String[] args) {
		Node<Integer> root=constructTree();
	    modify(root,0);
	    print(root);
	}
	
	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
			return null;
		Node<Integer> root=new Node<>(data);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	public static void print(Node<Integer> root)
	{
		if(root==null)
			return;
		System.out.println(root.data);
		print(root.left);
		print(root.right);
	}
	
	public static void modify(Node<Integer> root,int h)
	{
		if(root==null)
			return;
		root.data=h;
		modify(root.left,h+1);
		modify(root.right,h+1);
	}
	
}
