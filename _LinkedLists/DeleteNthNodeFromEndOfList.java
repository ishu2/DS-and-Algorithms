package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class DeleteNthNodeFromEndOfList {
	
	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> createList()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
			return null;
		Node<Integer> head=new Node<Integer>(data);
		head.next=createList();
		return head;
	}
	
	public static Node<Integer> delete(Node<Integer> head,int n)
	{
		if(head==null)
			return null;
		if(head.next==null)
		{
			if(n==1)
				return null;
			return head;
		}
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		while(fast!=null && n>0)
		{
			fast=fast.next;
			n--;
		}
		if(fast==null)
		{
			if(n==0)
				return head.next;
			return head;		
		}
		while(fast.next!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		slow.next=slow.next.next;
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		System.out.println("Enter which node you want to delete :");
		int n=s.nextInt();
		Node<Integer> res=delete(head,n);
		System.out.println("Resultant list :");
		while(res!=null)
		{
			System.out.println(res.data);
			res=res.next;
		}
	}

}
