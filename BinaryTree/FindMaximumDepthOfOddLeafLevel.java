package BinaryTree;

import java.util.Scanner;

public class FindMaximumDepthOfOddLeafLevel {

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
	
	public static int maxOddLevelDepth(Node<Integer> root,int level)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null && (level&1)!=0)
		{
			return level;
		}
		return Math.max(maxOddLevelDepth(root.left,level+1),maxOddLevelDepth(root.right,level+1));
	}
	
	public static void main(String[] args) {
	Node<Integer> root=constructTree();
	int res=maxOddLevelDepth(root,1);
	System.out.println("Maximum level = "+res);
	}
	
}
