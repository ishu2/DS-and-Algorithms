package BinaryTree;

import java.util.Scanner;

public class CheckWhetherTreeIsCompleteBinaryTreeOrNot {
	
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
	
	public static boolean check(Node<Integer> root,int index,int count)
	{
		if(root==null)
		{
			return true;
		}
		if(index>=count)
		{
			return false;
		}
		return check(root.left,2*index+1,count) && check(root.right,2*index+2,count);
	}
	
	public static int countNodes(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		return countNodes(root.left)+countNodes(root.right)+1;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		int count=countNodes(root);
		boolean res=check(root,0,count);
		System.out.println(res);
	}

}
