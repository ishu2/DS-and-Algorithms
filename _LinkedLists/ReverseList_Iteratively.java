package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class ReverseList_Iteratively {
	
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
	
	public static Node<Integer> reverse(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		Node<Integer> prev=null;
		Node<Integer> curr=head;
		Node<Integer> next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		Node<Integer> res=reverse(head);
		printList(res);
	}

}
