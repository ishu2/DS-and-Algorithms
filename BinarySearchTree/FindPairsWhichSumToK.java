package BinarySearchTree;

import java.util.Scanner;

public class FindPairsWhichSumToK {
	
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
	
	public static Node<Integer> convertToList(Node<Integer> root)
	{
		if(root==null)
			return null;
		Node<Integer> l=convertToList(root.left);
		Node<Integer> r=convertToList(root.right);
		root.left=root.right=null;
		Node<Integer> res=concatenate(concatenate(l,root),r);
	    return res;
	}
	
	public static Node<Integer> concatenate(Node<Integer> l,Node<Integer> r)
	{
		if(l==null && r==null)
			return null;
		if(l==null)
			return r;
		if(r==null)
			return l;
		Node<Integer> temp=l;
		while(l.right!=null)
			l=l.right;
		l.right=r;
		r.left=l;
		return temp;
	}
	
	public static void printTree(Node<Integer> root)
	{
		if(root==null)
			return;
		while(root!=null)
		{
			System.out.println(root.data);
			root=root.right;
		}
	}
	
	public static void findPairSum(Node<Integer> head,int k)
	{
		Node<Integer> temp=head;
		while(head.right!=null)
			head=head.right;
		while(temp!=head)
		{
			if(temp.data+head.data==k)
			{
				System.out.println(temp.data+" "+head.data);
				temp=temp.right;
				head=head.left;
			}
			else if(temp.data+head.data<k)
				temp=temp.right;
			else
				head=head.left;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		Node<Integer> res=convertToList(root);
		printTree(res);
		System.out.println("Enter k:");
		int k=s.nextInt();
		findPairSum(res,k);
	}

}
