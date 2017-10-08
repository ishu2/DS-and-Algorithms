package BinaryTree;

import java.util.Scanner;

public class DeepestLeftLeafInTree {
	
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
	
	static int deepestLeafLevel=0;
	static int result=-1;
	
	public static void findDeepestLeftLeaf(Node<Integer> root,boolean isLeft,int level )
	{
		if(root==null)
		{
			return;
		}
		if(root.left==null && root.right==null && isLeft)
		{
			if(level>deepestLeafLevel)
			{
				deepestLeafLevel=level;
				result=root.data;
			}
		}
		findDeepestLeftLeaf(root.left,true,level+1);
		findDeepestLeftLeaf(root.right,false,level+1);
	}
	
    public static void main(String[] args) {
		Node<Integer> root=constructTree();
		findDeepestLeftLeaf(root,false,0);
		System.out.println("Deepest left leaf = "+result);
	}
	
}
