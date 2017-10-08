
package BinaryTree;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_UsingInBuiltQueue {

static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> constructTree()
	{
		
		System.out.println("Enter rootdata :");
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
	
	static ArrayList<Integer> res=new ArrayList<>();
	
	public static void checkTriplet(Node<Integer> root, int X) {
	 addElements(root);
		int[] arr=new int[res.size()];
		int k=0;
		for(Integer i:res)
		{
		    arr[k]=i;
		    k++;
		}
		Arrays.sort(arr);
		int i=0;
		for(i=0;i<arr.length-2;i++)
		{
		    int j=i+1;
		    k=arr.length-1;
		    while(j<k)
		    {
		        if(arr[j]+arr[k]==X-arr[i])
		        {
		            System.out.println("Yes");
		            return;
		        }
		        else if(arr[j]+arr[k]<X-arr[i])
		        {
		            j++;
		        }
		        else
		        {
		            k--;
		        }
		    }
		}
		System.out.println("No");
	}
	
	public static void addElements(Node<Integer> root)
	{
	    if(root==null)
	    return;
	    addElements(root.left);
	    addElements(root.right);
	    res.add(root.data);
	}
	
	public static void printDFS(Node<Integer> root)
	{
		if(root==null)
			return;
		Queue<Node<Integer>> q=new LinkedList();
		q.add(root);
		System.out.println("DFS :-");
		while(!q.isEmpty())
		{
			Node<Integer> elt=q.poll();
			System.out.println(elt.data);
			if(elt.left!=null)
			q.add(elt.left);
			if(elt.right!=null)
			q.add(elt.right);
			
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> root=constructTree();
		//printDFS(root);
		checkTriplet(root,6);
	}
	
}
