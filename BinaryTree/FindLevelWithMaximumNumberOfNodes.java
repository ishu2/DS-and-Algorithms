package BinaryTree;

import java.util.Scanner;

public class FindLevelWithMaximumNumberOfNodes {
	
	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter rootdata");
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
	
	public static int levelWithMaximumNodes(Node<Integer> root) throws queueUnderflow
	{
		if(root==null)
		{
			return -1;
		}
		Queue<Node<Integer>> q=new Queue<>();
		int res=-1;
		int level=1;
		int result=0;
		int c=1;
		int max=0;
		q.enque(root);
		while(!(q.isEmpty()))
		{
			while(c>0)
			{
				Node<Integer> elt=q.deque();
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
				c--;
				System.out.print(elt.data+" ");
			}
			System.out.println();
			if(max>res)
			{
				res=Math.max(res, max);	
				result=level;
			}
			c=max;
			max=0;
			level++;
		}
		return result+1;
	}
	
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		int res=levelWithMaximumNodes(root);
		System.out.println("Level with maximum nodes = "+res);
	}

}
