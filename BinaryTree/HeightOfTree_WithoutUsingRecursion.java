package BinaryTree;

import java.util.Scanner;

public class HeightOfTree_WithoutUsingRecursion {
	
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
	
	public static int height(Node<Integer> root) throws queueUnderflow
	{
		if(root==null)
		{
			return 0;
		}
		Queue<Node<Integer>> q=new Queue<>();
		q.enque(root);
		int c=1;
		int max=0;
		int count=0;
		while(!(q.isEmpty()))
		{
			while(c>0)
			{
				Node<Integer> elt=q.deque();
				System.out.print(elt.data+" ");
				c--;
				if(elt.left!=null)
				{
					q.enque(elt.left);
					max++;
				}
				if(elt.right!=null)
				{
					q.enque(elt.right);
					max++;
				}
			}
			System.out.println();
			c=max;
			max=0;
			count+=1;
		}
		return count;
	}
	
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		int res=height(root);
		System.out.println("Height of tree = "+res);
	}

}
