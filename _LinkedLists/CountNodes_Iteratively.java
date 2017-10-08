package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class CountNodes_Iteratively {
	
	static Scanner s=new Scanner(System.in);
	
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
	
	public static int count(Node<Integer> head)
	{
		if(head==null)
		{
			return 0;
		}
		int res=0;
		while(head!=null)
		{
			res++;
			head=head.next;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
	   	int res=count(head);
	   	System.out.println("Number of nodes = "+res);
	}

}
