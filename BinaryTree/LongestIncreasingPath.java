package BinaryTree;

import java.util.Scanner;

public class LongestIncreasingPath {
	
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
	
	static int res=1;
	
	public static int longestIncreasingPath(Node<Integer> root) {
		int count=1;
		func(root,root.left,count);
		count=1;
		func(root,root.right,count);
		return res;
	}
	
	public static void func(Node<Integer> parent,Node<Integer> child,int count)
	{
	    if(child==null)
	    return;
	    if(child.data>parent.data)
	    {
	        count+=1;
	        res=Math.max(res,count);
	    }
	    else
	    {
	        count=1;
	    }
	    func(child,child.left,count);
	    func(child,child.right,count);
	}
	
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		System.out.println(longestIncreasingPath(root));
	}

}
