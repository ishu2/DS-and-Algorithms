package LinkedList;

import java.util.Scanner;

public class CreateLinkedList {
	
	public static Node<Integer> createLinkedList()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter data:-");
		int data=s.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(data!=-1)
		{
			if(head==null)
			{
				head=new Node<Integer>(data);
			    tail=head;
			}
			else
			{
				tail.next=new Node<Integer>(data);
				tail=tail.next;
			}
			System.out.println("Enter data:-");
			data=s.nextInt();
		}
		return head;
	}
	
	public static void printLinkedList(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		Node<Integer> tail=head;
		while(tail!=null)
		{
			System.out.println(tail.data);
			tail=tail.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createLinkedList();
		printLinkedList(head);
	}

}
