package BinaryTree;

import java.util.Scanner;

public class FindProfession_EngineerOrDoctor {
	
	public static Node<Integer> constructTree()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rootdata :");
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
	
	public static void printTree(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	
	public static void main(String[] args) {
		//Node<Integer> root=constructTree();
		//printTree(root);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter level :");
		int level=s.nextInt();
		System.out.println("Enter position :");
		int pos=s.nextInt();
		int n=pos-1;
		int one=0;
		while(n!=0)
		{
			if((n&1)==1)
			{
				one++;
			}
			n=n>>1;
		}
		if(one%2==0)
		{
			System.out.println("Engineer");
		}
		else
		{
			System.out.println("Doctor");
		}
	}

}
