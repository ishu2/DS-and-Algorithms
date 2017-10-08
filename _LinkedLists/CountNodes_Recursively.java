package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class CountNodes_Recursively {
	
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
	
	public static void print(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		System.out.println(head.data);
		print(head.next);
	}
	
	public static int count(Node<Integer> head)
	{
		if(head==null)
		{
			return 0;
		}
		int res=1+count(head.next);
		return res;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		print(head);
		int res=count(head);
		System.out.println("Number of nodes = "+res);
	}

}
