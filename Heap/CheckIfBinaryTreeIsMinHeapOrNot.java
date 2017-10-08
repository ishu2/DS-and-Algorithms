// My Approach : 1. check if it is complete BT or not.
//               2. Check if it follows either min heap property or max heap property.

package Heap;
import java.util.Scanner;

import BinaryTree.Node;

public class CheckIfBinaryTreeIsMinHeapOrNot {
	
	public static Node<Integer> constructTree()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter data");
		int rootdata=s.nextInt();
		if(rootdata==-1)
		{
			return null;
		}
		Node<Integer> root=new Node<>(rootdata);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	public static boolean checkMinHeapProperty(Node<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		if(root.left!=null && root.right!=null)
		{
		  if(!(root.data<=root.left.data) || !(root.data<=root.right.data))
		  {
			return false;
		  }
		}
		if(root.left!=null && !(root.data<=root.left.data))
		{
			return false;
		}
		if(root.right!=null &&!(root.data<root.right.data))
		{
			return false;
		}
		boolean res=checkMinHeapProperty(root.left);
		if(res==false)
		{
			return false;
		}
		res=checkMinHeapProperty(root.right);
		return res;
	}
	
	public static int countNodes(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+countNodes(root.left)+countNodes(root.right);
	}
	
	public static boolean checkCompleteBinaryTreeProperty(Node<Integer> root,int countNodes,int index)
	{
		if(root==null)
		{
			return true;
		}
		if(index>=countNodes)
		{
			return false;
		}
		boolean res=checkCompleteBinaryTreeProperty(root.left,countNodes,(2*index)+1);
		if(res==false)
		{
			return false;
		}
		res=checkCompleteBinaryTreeProperty(root.right,countNodes,(2*index)+2);
		return res;
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		boolean res1=checkMinHeapProperty(root);
		boolean res2=false;
		if(res1==false)
		{
			System.out.println(res1);
		}
		else
		{
			int count=countNodes(root);
			res2=checkCompleteBinaryTreeProperty(root,count,0);
		}
		System.out.println(res2);
	}

}
