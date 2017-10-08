// Sum of all paths values

package BinaryTree;

import java.util.Scanner;

public class SumOfAllRootToLeafPathNodes {
	
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
	
	public static int sumOfRootToLeafPaths(Node<Integer> root,int sum)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return sum*10+root.data;
		}
		sum=sum*10+root.data;
		int lRes=sumOfRootToLeafPaths(root.left,sum);
		int rRes=sumOfRootToLeafPaths(root.right,sum);
		return lRes+rRes;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		int s=0;
		int res=sumOfRootToLeafPaths(root,s);
		System.out.println("Sum = "+res);
		
	}

}
