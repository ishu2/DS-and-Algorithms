package BinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class PostorderSucessor {
	
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
	
	public static int findPostOrderSuccessor(Node<Integer> root,int M)
	{
		ArrayList<Integer> list=func(root);
		int res=-1;
		for(Integer i:list)
		{
		    int k=res;
		    res=i;
		    if(k==M)
		    break;
		}
		return res;
	}
	
	public static ArrayList<Integer> func(Node<Integer> root)
	{
	    ArrayList<Integer> res=new ArrayList<>();
	    if(root==null)
	    return res;
	    res=func(root.left);
	    res=func(root.right);
	    res.add(root.data);
	    return res;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		System.out.println("Enter M");
		int M=s.nextInt();
		System.out.println(findPostOrderSuccessor(root,M));
	}

}
