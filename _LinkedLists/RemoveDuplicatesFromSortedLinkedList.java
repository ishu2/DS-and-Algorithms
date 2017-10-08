package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedLinkedList {
	
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
	
	public static void removeDuplicates(Node<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return;
		}
		while(head.next!=null)
		{
			if(head.data==head.next.data)
			{
				head.next=head.next.next;
			}
			else
			{
				head=head.next;
			}
		}
	}
	
	public static void printList(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		System.out.println(head.data);
		printList(head.next);
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
	    removeDuplicates(head);	
	    printList(head);
	}

}
