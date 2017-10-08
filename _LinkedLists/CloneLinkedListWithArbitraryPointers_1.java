// Cloning a linked list means creating copy of linked list.

package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class CloneLinkedListWithArbitraryPointers_1 {
	
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
			if(head.arbitrary!=null)
			System.out.println(head.data+" --> "+head.arbitrary.data);
			else
			System.out.println("NULL");
			head=head.next;
		}
	}
	
	public static void cloneList(Node<Integer> head)
	{
		if(head==null)
			return;
		Node<Integer> tail=head;
		while(tail!=null)
		{
			Node<Integer> n=new Node<>(tail.data);
			n.next=tail.next;
			tail.next=n;
			tail=tail.next.next;
		}
		tail=head;
		while(tail!=null)
		{
			if(tail.arbitrary!=null)
			tail.next.arbitrary=tail.arbitrary.next;
			else
			tail.next.arbitrary=null;
			tail=tail.next.next;
		}
		Node<Integer> res=null;
		Node<Integer> tail2=null;
		Node<Integer> first=null;
		Node<Integer> tailFirst=null;
		boolean flag=true;
		tail=head;
		while(tail!=null)
		{
			if(flag)
			{
				if(first==null)
				{
					first=tail;
					tailFirst=first;
					tail=tail.next;
					first.next=null;
					tailFirst.next=null;
				}
				else
				{
					tailFirst.next=tail;
					tail=tail.next;
					tailFirst=tailFirst.next;
					tailFirst.next=null;
				}
			}
			else
			{
				if(res==null)
				{
					res=tail;
					tail2=res;
					tail=tail.next;
					res.next=null;
					tail2.next=null;
				}
				else
				{
					tail2.next=tail;
					tail=tail.next;
					tail2=tail2.next;
					tail2.next=null;
				}
			}
			flag=!flag;
				
		}
		System.out.println("List 1 :");
		printList(first);
		System.out.println("List 2 :");
		printList(res);
	}
	
	public static void main(String[] args) {
	Node<Integer> head=new Node<Integer>(1);
	head.next=new Node<Integer>(2);
	head.next.next=new Node<Integer>(3);
	head.next.next.next=new Node<Integer>(4);
	head.next.next.next.next=new Node<Integer>(5);
	head.next.next.next.next.next=new Node<Integer>(6);
	head.arbitrary=head.next.next;
	head.next.arbitrary=head;
	head.next.next.arbitrary=head.next.next.next.next;
	head.next.next.next.arbitrary=head.next.next.next.next;
	head.next.next.next.next.arbitrary=head.next;
	head.next.next.next.next.next.arbitrary=null;
	cloneList(head);
	}

}
