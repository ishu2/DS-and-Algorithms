package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class DeleteAlternateNodes {
	
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
	
	public static void deleteAlternate_Iterative(Node<Integer> head)
	{
		if(head==null)
			return;
		Node<Integer> temp=head;
		while(temp!=null && temp.next!=null)
		{
			temp.next=temp.next.next;
			temp=temp.next;
		}
	}
	
	public static void deleteAlternate_Recursively(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return;
		head.next=head.next.next;
		deleteAlternate_Recursively(head.next);
	}

	public static void main(String[] args) {
		Node<Integer> head=createList();
		deleteAlternate_Recursively(head);
		printList(head);
	}

}
