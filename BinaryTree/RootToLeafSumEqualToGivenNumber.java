package BinaryTree;

import java.util.Scanner;

public class RootToLeafSumEqualToGivenNumber {

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
	
	public static boolean checkSum(Node<Integer> root,int n,int sum)
	{
		if(root==null)
		{
			return false;
		}
		if(root.left==null && root.right==null)
		{
			if(n==sum+root.data)
			{
				return true;
			}
			return false;
		}
		return checkSum(root.left,n,sum+root.data)||checkSum(root.right,n,sum+root.data);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
	    System.out.println("Enter sum :");
	    int num=s.nextInt();
	    boolean res=checkSum(root,num,0);
	    System.out.println(res);
	}
	
}
