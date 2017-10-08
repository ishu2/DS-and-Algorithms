package BinaryTree;

import java.util.Scanner;

public class LevelOrderTraversal_LevelByLevel_SeparateLines {
	
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
	
	public static void levelOrder_SeperateLevels(Node<Integer> root) throws queueUnderflow
	{
		if(root==null)
		{
			return;
		}
		Queue<Node<Integer>> q=new Queue<>();
		q.enque(root);
		int c=1;
		int max=0;
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
		}
	}
	
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		levelOrder_SeperateLevels(root);
	}

}
