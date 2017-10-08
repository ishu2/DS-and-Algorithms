package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VerticalSumInBinaryTree {
	
static Scanner s=new Scanner(System.in); 
	
	public static Node<Integer> constructTree()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
		{
			return  null;
		}
		Node<Integer> root=new Node<Integer>(data);
		root.left=constructTree();
		root.right=constructTree();
		return root;
	}
	
	public static void fillHashMapWithVerticalLines(Node<Integer> root,HashMap<Integer,ArrayList<Integer>> map,int hd)
	{
	  if(root==null)
	  {
		  return;
	  }
	  if(map.containsKey(hd))
	  {
		  ArrayList<Integer> list=map.get(hd);
		  list.add(root.data);
	  }
	  else
	  {
		  ArrayList<Integer> list=new ArrayList<>();
		  list.add(root.data);
		  map.put(hd, list);
	  }
	  fillHashMapWithVerticalLines(root.left,map,hd-1);
	  fillHashMapWithVerticalLines(root.right,map,hd+1);
	}
	
	public static void printVerticalSums(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		fillHashMapWithVerticalLines(root,map,0);
		for(Integer i:map.keySet())
		{
			ArrayList<Integer> list=map.get(i);
			int sum=0;
			for(Integer j:list)
			{
				sum+=j;
			}
			System.out.println(i+" --> "+sum);
		}
		
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		printVerticalSums(root);
	}

}
