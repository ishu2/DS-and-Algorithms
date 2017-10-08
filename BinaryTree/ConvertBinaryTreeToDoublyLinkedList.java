package BinaryTree;

import java.util.Scanner;

public class ConvertBinaryTreeToDoublyLinkedList {
	
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
	
	public static Node<Integer> makeDoublyLinkedList(Node<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		Node<Integer> l=makeDoublyLinkedList(root.left);
		Node<Integer> r=makeDoublyLinkedList(root.right);
		root.left=root.right=null;
		return concatenateList(concatenateList(l,root),r);
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
		Node<Integer> temp=l1;
		while(l1.right!=null)
			l1=l1.right;
		l1.right=l2;
		l2.left=l1;
		return temp;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		Node<Integer> res=makeDoublyLinkedList(root);
		while(res!=null)
		{
			System.out.println(res.data);
			res=res.right;
		}
	}

}
