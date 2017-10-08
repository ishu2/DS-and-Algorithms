package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class MergeSort {
	
static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> createList()
	{
		System.out.println("Enter data:");
		int data=s.nextInt();
		if(data==-1)
		{
			return null;
		}
		Node<Integer> head=new Node<Integer>(data);
		head.next=createList();
		return head;
	}
	
	public static void printList(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static Node<Integer> mergeSort(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		Node<Integer> tail=head;
		Node<Integer> fast=head;
		Node<Integer> a=null;
		Node<Integer> b=null;
		
		  while(fast!=null && fast.next!=null && fast.next.next!=null)
		  {	
			fast=fast.next.next;
			tail=tail.next;
		  }
		  b=tail.next;
		  tail.next=null;
		  a=head;
		
		Node<Integer> l=mergeSort(a);
		Node<Integer> r=mergeSort(b);
		return merge(l,r);
	}
	
	public static Node<Integer> merge(Node<Integer> a,Node<Integer> b)
	{
		if(a==null && b==null)
			return null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		Node<Integer> res=null;
		if(a.data<=b.data)
		{
			res=a;
			res.next=merge(a.next,b);
		}
		else
		{
			res=b;
			res.next=merge(a,b.next);
		}
		return res;
	}
public static Node<Integer> merge2(Node<Integer> left,Node<Integer> right)
{
	Node<Integer> head=null;
	Node<Integer> tail=null;
	while(left!=null && right!=null)
	{
		if(left.data<right.data)
		{
			if(head==null)
			{
				tail=left;
			    head=tail;
				left=left.next;
			}
			else
			{
				tail.next=left;
				left=left.next;
				tail=tail.next;
			}
		}
		else
		{
			if(head==null)
			{
				tail=right;
				head=tail;
				right=right.next;
			}
			else
			{
				tail.next=right;
				tail=tail.next;
				right=right.next;
			}
		}
	}
	if(left!=null)
	{
		while(left!=null)
		{
			tail.next=left;
			left=left.next;
			tail=tail.next;
		}
	}
	if(right!=null)
	{
		while(right!=null)
		{
			tail.next=right;
			tail=tail.next;
			right=right.next;
		}
	}
	return head;
}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		Node<Integer> res=mergeSort(head);
		printList(res);
	}

}
