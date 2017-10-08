package BinaryTree;

import java.util.Scanner;

public class CountNumerOfNodes {
	

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
	
	public static int countNodes(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int lCount=countNodes(root.left);
		int rCount=countNodes(root.right);
		return lCount+rCount+1;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		int res=countNodes(root);
		System.out.println("no. of nodes in tree are :-");
		System.out.println(res);
	}

}
