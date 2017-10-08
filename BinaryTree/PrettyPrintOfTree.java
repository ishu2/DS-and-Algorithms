package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Queue.QueueUnderFlowException;
import Queue.QueueUsingLinkedList;

public class PrettyPrintOfTree {
	
	public static Node<Integer> constructTree()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter data :");
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
	
	public static void prettyPrint(Node<Integer> root) throws QueueUnderFlowException
	{
		if(root==null)
		{
			return;
		}
		Values v=new Values();
		v.min=0;
		v.max=0;
		maxAndMin(root,v,v,0);
	    HashMap<Integer,Integer> map1=new HashMap<>();
	    HashMap<Integer,ArrayList<Integer>> map2=new HashMap<>();
	    treeTraversalMap(root,map1,0);
	    levelOrderMap(root,map2);
	    for(Integer i:map2.keySet())
	    {
	    	ArrayList<Integer> list=map2.get(i);
	    	for(Integer j:list)
	    	{
	    		Integer val=map1.get(j);
	    		if(val>0)
	    		{
	    			for(int k=0;k<(2*val)+1;k++)
	    			{
	    				System.out.print(" ");
	    			}
	    		}
	    		else
	    		{
	    		  for(int k=0;k<2*(val-v.min);k++)
	    		  {
	    			System.out.print(" ");
	    		  }
	    		}
	    		System.out.print(j);
	    	}
	    	System.out.println();
	    	System.out.println();
	    }
	    
	}
	
	public static void treeTraversalMap(Node<Integer> root,HashMap<Integer,Integer> map,int far)
	{
		if(root==null)
		{
			return;
		}
		map.put(root.data, far);
		treeTraversalMap(root.left,map,far-1);
		treeTraversalMap(root.right,map,far+1);
	}
	
	
	public static void maxAndMin(Node<Integer> root,Values min,Values max,int far)
	{
		if(root==null)
		{
			return;
		}
		if(min.min>far)
		{
			min.min=far;
		}
		if(max.max<far)
		{
			max.max=far;
		}
		maxAndMin(root.left,min,max,far-1);
		maxAndMin(root.right,min,max,far+1);
	}
	
	public static void levelOrderMap(Node<Integer> root,HashMap<Integer,ArrayList<Integer>> map) throws QueueUnderFlowException
	{
		if(root==null)
		{
			return;
		}
		QueueUsingLinkedList queue=new QueueUsingLinkedList();
		queue.enqueue(root);
		int h=0;
		while(!(queue.isEmpty()))
		{
			int size=queue.size();
			if(size==0)
			{
				return;
			}
			h++;
			while(size>0)
			{
				Node<Integer> elt=(Node<Integer>) queue.dequeue();
				if(map.containsKey(h))
				{
					ArrayList<Integer> list=map.get(h);
					list.add(elt.data);
					map.put(h, list);
				}
				else
				{
					ArrayList<Integer> list=new ArrayList<Integer>();
					list.add(elt.data);
					map.put(h, list);
				}
				if(elt.left!=null)
				{
					queue.enqueue(elt.left);
				}
				if(elt.right!=null)
				{
					queue.enqueue(elt.right);
				}
				size--;
			}
		}
	}
	
	public static void main(String[] args) throws QueueUnderFlowException {
	Node<Integer> root=constructTree();
	prettyPrint(root);
	}

}
