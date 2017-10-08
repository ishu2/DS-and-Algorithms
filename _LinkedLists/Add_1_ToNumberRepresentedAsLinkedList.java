package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class Add_1_ToNumberRepresentedAsLinkedList {

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
	
	public static Node<Integer> add1(Node<Integer> head)
	{
		if(head==null)
			return null;
		if(head.next==null)
		{
			head.data=head.data+1;
		    return head;
		}
		head=reverse(head);
		int num=head.data+1;
		head.data=num%10;
		int carry=num>=10 ? 1 : 0;
		Node<Integer> temp=head.next;
		Node<Integer> prev=null;
		while(temp!=null && carry!=0)
		{
			num=temp.data+carry;
			temp.data=num%10;
			carry=num>=10 ? 1 : 0;
			prev=temp;
			temp=temp.next;
		}
		if(carry!=0)
			prev.next=new Node<Integer>(carry);
		head=reverse(head);
		return head;
	}
	
	public static Node<Integer> reverse(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		Node<Integer> finalHead=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return finalHead;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		head=add1(head);
		printList(head);
	}
	
}
