package BinaryTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TopViewOfTree {
	
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
	
	public static void printTopView(Node<Integer> root,treeMap map) throws queueUnderflow
	{
		if(root==null)
		{
			return;
		}
		Queue<treeMap> q=new Queue<>();
		q.enque(map);
		HashSet<Integer> set =new HashSet<>();
		while(!(q.isEmpty()))
		{
			treeMap elt=q.deque();
			Node<Integer> head=elt.root;
			int hd=elt.hd;
			if(!(set.contains(hd)))
			{
				set.add(hd);
				System.out.println(head.data);
			}
			if(head.left!=null)
			{
				q.enque(new treeMap(head.left,hd-1));
			}
			if(head.right!=null)
			{
				q.enque(new treeMap(head.right,hd+1));
			}
		}
	}
		
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		treeMap map=new treeMap(root,0);
		printTopView(root,map);
	}

}
