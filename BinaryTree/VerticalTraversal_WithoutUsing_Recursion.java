package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VerticalTraversal_WithoutUsing_Recursion {
	
	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree(){
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
	
	public static void verticalTraversal(Node<Integer> root) throws queueUnderflow
	{
		if(root==null)
		{
			return;
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		ExtraNodeForVerticalTraversal obj=new ExtraNodeForVerticalTraversal(root,0);
		Queue<ExtraNodeForVerticalTraversal> q=new Queue<>();
		q.enque(obj);
		while(!(q.isEmpty()))
		{
			ExtraNodeForVerticalTraversal elt=q.deque();
			Node<Integer> head=elt.root;
			int hd=elt.hd;
			if(map.containsKey(hd))
			{
				ArrayList<Integer> list=map.get(hd);
				list.add(head.data);
				map.put(hd, list);
			}
			else
			{
				ArrayList<Integer> list=new ArrayList<>();
				list.add(head.data);
				map.put(hd, list);
			}
			if(max<hd)
			{
				max=hd;
			}
			if(min>hd)
			{
				min=hd;
			}
			if(head.left!=null)
			{
			  q.enque(new ExtraNodeForVerticalTraversal(head.left,hd-1));	
			}
			if(head.right!=null)
			{
				q.enque(new ExtraNodeForVerticalTraversal(head.right,hd+1));
			}
		}
		System.out.println("Vertical traversal of tree :");
		for(int i=min;i<=max;i++)
		{
			if(map.containsKey(min))
			{
				ArrayList<Integer> res=map.get(i);
				for(Integer k:res)
				{
					System.out.print(k+" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		verticalTraversal(root);
	}

}
