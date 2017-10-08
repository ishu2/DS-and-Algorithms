package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class DivideListInto2PartsOfAlternatingElements {
	
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
			System.out.print(head.data);
			head=head.next;
		}
	}
	
	public static void divideList(Node<Integer> head)
	{
		if(head==null)
			return;
		Node<Integer> a=null;
		Node<Integer> b=null;
		Node<Integer> temp=null;
		boolean flag=true;
		while(head!=null)
		{
			if(flag)
			{
				temp=head;
				head=head.next;
				temp.next=a;
				a=temp;
			}
			else
			{
				temp=head;
				head=head.next;
				temp.next=b;
				b=temp;
			}
			flag=!flag;
		}
		System.out.println("List a :");
		printList(a);
		System.out.println("List b :");
		printList(b);
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		divideList(head);
	}

}
