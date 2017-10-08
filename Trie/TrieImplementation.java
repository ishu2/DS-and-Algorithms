package Trie;

import java.util.HashMap;

public class TrieImplementation {
	
	private static TrieNode root;
	
	public static void insert(String str,TrieNode root)
	{
		insertRecursively(str,0,root);
	}
	
	private static void insertRecursively(String str,int index,TrieNode root)
	{
		if(index==str.length())
		{
			return;
		}
		if(root.children.get(str.charAt(index))==null)
		{
			TrieNode n=new TrieNode();
			root.children.put(str.charAt(index),n);
			root=n;
		}
		root=root.children.get(str.charAt(index));
		insertRecursively(str,index+1,root);
		root.isWord=true;
	}
	
	public static void insertIteratively(String str)
	{
		TrieNode current=root;
		int i=0;
		while(i<str.length())
		{
			TrieNode node=current.children.get(str.charAt(i));
			if(node==null)
			{
				node=new TrieNode();
				current.children.put(str.charAt(i),node);
			}
			current=node;
			i++;
		}
		current.isWord=true;
	}
	
	public static boolean search(String str,TrieNode root,int index)
	{
		if(root==null)
		{
			return false;
		}
		if(str.length()==index)
		{
			return true;
		}
		if(root.children.get(str.charAt(index))==null)
		{
			return false;
		}
		return search(str,root.children.get(str.charAt(index)),index+1);
	}
	
	public static void main(String[] args) {
		final TrieNode root=new TrieNode();
		String[] arr={"cat","cater","a","area","are"};
		for(int i=0;i<arr.length;i++)
		{
			insertIteratively(arr[i]);
		}
	}

}
