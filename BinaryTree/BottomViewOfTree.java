package BinaryTree;

import java.util.HashMap;
import java.util.Scanner;

public class BottomViewOfTree {
	
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
	
	public static void printBottomView(Node<Integer> root,treeMap map) throws queueUnderflow
	{
		if(root==null)
		{
			return;
		}
		Queue<treeMap> q=new Queue<>();
		q.enque(map);
		HashMap<Integer,Integer> hashmap=new HashMap<>();
		while(!(q.isEmpty()))
		{
			treeMap elt=q.deque();
			Node<Integer> head=elt.root;
			int hd=elt.hd;
			hashmap.put(hd, head.data);
			if(head.left!=null)
			{
				q.enque(new treeMap(head.left,hd-1));
			}
			if(head.right!=null)
			{
				q.enque(new treeMap(head.right,hd+1));
			}
		}
		System.out.println("Bottom view of tree :");
		for(Integer i:hashmap.keySet())
		{
			System.out.println(hashmap.get(i));
		}
	}
	
	public static void main(String[] args) throws queueUnderflow {
		Node<Integer> root=constructTree();
		treeMap map=new treeMap(root,0);
		printBottomView(root,map);
	}

}
