package BinaryTree;

import java.util.Scanner;

public class FindLCA {
	
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
	
	public static Node<Integer> findLCA(Node<Integer> root,int data1,int data2)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==data1 || root.data==data2)
		{
			return root;
		}
		Node<Integer> leftRes=findLCA(root.left,data1,data2);
		Node<Integer> rightRes=findLCA(root.right,data1,data2);
		if(leftRes!=null && rightRes!=null)
		{
			return root;
		}
		else if(leftRes==null && rightRes!=null)
		{
			return rightRes;
		}
		else
		{
			return leftRes;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node<Integer> root=constructTree();
		int data1=s.nextInt();
		int data2=s.nextInt();
		Node<Integer> res=findLCA(root,data1,data2);
		if(res!=null)
		{
		System.out.println("LCA of "+data1+ " and "+data2+" is "+res.data);
		}
		else
		{
			System.out.println("not exist");
		}
	}

}
