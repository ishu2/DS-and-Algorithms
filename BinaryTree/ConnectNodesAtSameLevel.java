package BinaryTree;

import java.util.Scanner;

public class ConnectNodesAtSameLevel {
	
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
	
	public static void connectNodesAtSameLevel(Node<Integer> root) throws queueUnderflow
	{
		if(root==null)
		{
			return;
		}
		Queue<Node> q=new Queue<>();
		q.enque(root);
		int h=1;
		int m=0;
		int height=1;
		while(!(q.isEmpty()))
		{
			while(h>0)
			{
				Node<Integer> elt=q.deque();
				h-=1;
				if(h==0)
				{
					elt.nextRight=null;
				}
				else
				{
			    	elt.nextRight=q.getFront();
				}
				if(elt.left!=null)
				{
					q.enque(elt.left);
					m+=1;
				}
				if(elt.right!=null)
				{
					q.enque(elt.right);
					m+=1;
				}
			}
			h=m;
			m=0;
		}
		preorderTraversal(root);
	}
	
	public static void preorderTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Node<Integer> temp=root;
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.nextRight;
		}
		System.out.println("null");
		preorderTraversal(root.left);
	}
	
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		connectNodesAtSameLevel(root);
	}

}
