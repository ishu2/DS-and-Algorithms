package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class CreateLinkedList {
	
	static Scanner s=new Scanner(System.in);
	
	public static void printList(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static Node<Integer> createList()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(data!=-1)
		{
			if(head==null)
			{
				head=new Node<>(data);
				tail=head;
			}
			else
			{
				tail.next=new Node<>(data);
				tail=tail.next;
			}
			System.out.println("Enter data :");
			data=s.nextInt();
		}
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		printList(head);
	}

}
