package BinaryTree;

import java.util.Scanner;

public class LevelOrderTraversal_InOneLine {
	
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
	
	public static void levelOrderTraversal(Node<Integer> root) throws queueUnderflow
	{
		if(root==null)
		{
			return;
		}
		Queue<Node<Integer>> q=new Queue<>();
		q.enque(root);
		while(!(q.isEmpty()))
		{
			Node<Integer> elt=q.deque();
			System.out.print(elt.data+" ");
			if(elt.left!=null)
			{
				q.enque(elt.left);
			}
			if(elt.right!=null)
			{
				q.enque(elt.right);
			}
		}
	}
	
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		levelOrderTraversal(root);
	}

}
