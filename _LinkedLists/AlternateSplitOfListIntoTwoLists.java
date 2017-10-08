package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class AlternateSplitOfListIntoTwoLists {
	
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
	
	public static void split(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return;
		boolean flag=true;
		Node<Integer> tail1=null;
		Node<Integer> tail2=null;
		while(head!=null)
		{
			if(flag)
			{
				if(a==null)
				{
					a=head;
					tail1=head;
				}
				else
				{
					tail1.next=head;
					tail1=tail1.next;
				}
			}
			else
			{
				if(b==null)
				{
					b=head;
					tail2=head;
				}
				else
				{
					tail2.next=head;
					tail2=tail2.next;
				}
			}
			flag=!flag;
			head=head.next;
		}
	}
	
	static Node<Integer> a=null;
	static Node<Integer> b=null;

	public static void main(String[] args) {
		Node<Integer> head=createList();
		
		split(head);
		System.out.println("List 1 :");
		printList(a);
		System.out.println("List 2 :");
		printList(b);
	}

}
