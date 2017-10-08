package BinaryTree;

import java.util.Scanner;

public class ConvertTreeToCircularDoublyLinkedList {
	

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
	
	public static Node<Integer> constructList(Node<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		Node<Integer> l=constructList(root.left);
		Node<Integer> r=constructList(root.right);
		root.left=root.right=root;
		Node<Integer> res=concatenateList(concatenateList(l,root),r);
		return res;
	}
	
	public static Node<Integer> concatenateList(Node<Integer> l1,Node<Integer> l2)
	{
		if(l1==null && l2==null)
		{
			return null;
		}
		if(l1==null)
		{
			return l2;
		}
		if(l2==null)
		{
			return l1;
		}
		Node<Integer> temp=l2.left;
			l1.left.right=l2;
			l2.left=l1.left;
			l1.left=temp;
			temp.right=l1;
			return l1;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
	    Node<Integer> res=constructList(root);
	    Node<Integer> temp=res.left;
	    while(res!=temp)
	    {
	    	System.out.println(res.data);
	    	res=res.right;
	    }
	    System.out.println(res.data);
	}

}
