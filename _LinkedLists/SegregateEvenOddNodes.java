package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class SegregateEvenOddNodes {
	
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
	
	public static Node<Integer> segregate(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		Node<Integer> even=null;
		Node<Integer> odd=null;
		Node<Integer> tailEven=null;
		Node<Integer> tailOdd=null;
		while(head!=null)
		{
			if(head.data%2==0)
			{
				if(even==null)
				{
					even=head;
					tailEven=head;
				}
				else
				{
					tailEven.next=head;
					tailEven=tailEven.next;
				}
			}
			else
			{
				if(odd==null)
				{
					odd=head;
					tailOdd=head;
				}
				else
				{
					tailOdd.next=head;
					tailOdd=tailOdd.next;
				}
			}
			head=head.next;
		}
		if(even==null)
			return odd;
		if(odd==null)
			return even;
		tailEven.next=odd;
		tailOdd.next=null;
		return even;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		Node<Integer> res=segregate(head);
		printList(res);
	}

}
