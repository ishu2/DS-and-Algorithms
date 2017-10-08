package BinarySearchTree;

import java.util.Scanner;

public class basicOperationsOnBST {
	
	public static Node<Integer> insertUsingLoop(int data,Node<Integer> root)
	{
		if(root==null)
		{
			return new Node<>(data);
		}
		Node<Integer> parent=root;
		Node<Integer> curr=root;
		while(true)
		{
			if(curr!=null)
			{
			    if(data<curr.data)
			    {
				  parent=curr;
				  curr=curr.left;
			    }
			    else
			    {
			      parent=curr;
			      curr=curr.right;
			    }
			}
			else
			{
				if(data<parent.data)
				{
				  parent.left=new Node<Integer>(data);
				  return root;
				}
				else
				{
				  parent.right=new Node<>(data);
			      return root;
				}
			}
		}
	}
	
	public static void insertUsingRecursion(int data,Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		if(data<root.data)
		{
			if(root.left==null)
			{
				root.left=new Node<>(data);
				return;
			}
			else
			{
				insertUsingRecursion(data,root.left);
			}
		}
		else
		{
			if(root.right==null)
			{
				root.right=new Node<>(data);
				return;
			}
			else
			{
				insertUsingRecursion(data,root.right);
			}
		}
	}
	
	public static int findElement(Node<Integer> root,int elt,int l)
	{
		if(root==null)
		{
			return -1;
		}
		if(root.data==elt)
		{
			return l+1;
		}
		int res=0;
		if(elt<root.data)
		{
			res=findElement(root.left,elt,l+1);
		}
		else
		{
			res=findElement(root.right,elt,l+1);
		}
		return res;
	}
	
	public static void inOrderTraversal(Node<Integer> root)
	{
	  if(root==null)
	  {
		  return;
	  }
	  inOrderTraversal(root.left);
	  System.out.println(root.data);
	  inOrderTraversal(root.right);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter rootdata :");
		Node<Integer> root=new Node<>(s.nextInt());
		
		int choice=10;
		while(choice!=-1)
		{
			System.out.println("Press 1 to insert.");
			System.out.println("Press 2 to print the BST.");
			System.out.println("Press 3 to find an element in BST.");
			System.out.println("Press 4 to delete an element from BST.");
			System.out.println("Press -1 to EXIT");
			choice=s.nextInt();
			if(choice==-1)
			{
				break;
			}
			switch(choice)
			{
			case 1:  System.out.println("Enter data you want to insert in BST :-");
			         int data=s.nextInt();
			
			         while(data!=-1)
			         {
			           insertUsingRecursion(data,root);
			           System.out.println("Enter data you want to insert in BST :-");
			           System.out.println("(Press -1 if you dont want to insert )");
			           data=s.nextInt();
			         }
			         break;
			         
			case 2:  inOrderTraversal(root);
			         break;
			         
			case 3:  System.out.println("Enter the element you want to find in BST :");
			         int elt=s.nextInt();
			
			         int l=findElement(root,elt,0);
			         if(l!=-1)
			         {
				       System.out.println(elt+" is present at level "+l);
			         }
			         else
			         {
				       System.out.println("OOPS! "+elt+" is not present in tree.");
			         }
			         break;
			         
			case 4:  break;
			}
			System.out.println();
		}
	}

}
