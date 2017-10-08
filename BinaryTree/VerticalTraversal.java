package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VerticalTraversal {
	
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
	
	public static void verticalTraversalOfTree(Node<Integer> root)
	{
		if(root==null)
		{
			return ;
		}
		Values v=new Values();
		v.min=0;
		v.max=0;
		maxAndMin(root,0,v,v);
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		preOrderTraversal(root,0,map);
		for(int i=v.min;i<=v.max;i++)
		{
			if(map.containsKey(i))
			{
				ArrayList<Integer> list=map.get(i);
				System.out.print(i+" : ");
				for(Integer j:list)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void preOrderTraversal(Node<Integer> root,int far,HashMap<Integer,ArrayList<Integer>> map)
	{
		if(root==null)
		{
			return;
		}
		if(map.containsKey(far))
		{
			ArrayList<Integer> list=map.get(far);
			list.add(root.data);
			map.put(far, list);
		}
		else
		{
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(root.data);
			map.put(far, list);
		}
		preOrderTraversal(root.left,far-1,map);
		preOrderTraversal(root.right,far+1,map);
	}
	
	
	
	public static void maxAndMin(Node<Integer> root,int far,Values min,Values max)
	{
		if(root==null)
		{
			return;
		}
		if(far<min.min)
		{
			min.min=far;
		}
		if(far>max.max)
		{
			max.max=far;
		}
		maxAndMin(root.left,far-1,min,max);
		maxAndMin(root.right,far+1,min,max);
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		verticalTraversalOfTree(root);
	}

}
