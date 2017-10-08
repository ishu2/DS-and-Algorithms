package GeeksForGeeks_LinkedLists;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseListsInGroupsOfSizeK {
	
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
	
	public static Node<Integer> reverseK(Node<Integer> head,int k,int size)
	{
		if(k==0)
			return head;
		if(head==null || head.next==null)
			return head;
		if(size<k)
			return head;
		Node<Integer> prev=null;
		Node<Integer> curr=head;
		Node<Integer> next=null;
		Node<Integer> temp=head;
		int count=0;
		while(curr!=null && count<k)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		head.next=reverseK(next,k,size-k);
		return prev;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		System.out.println("Enter k :");
		int k=s.nextInt();
		int size=0;
		Node<Integer> temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			size++;
		}
		Node<Integer> res=reverseK(head,k,size);
		printList(res);
	}

}
