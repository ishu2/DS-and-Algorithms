package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class PrintReverseOfListUsingRecursion {

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
	
	public static void printReverseList(Node<Integer> head)
	{
		if(head==null)
			return;
		printReverseList(head.next);
		System.out.println(head.data);
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		printReverseList(head);
	}
	
}
