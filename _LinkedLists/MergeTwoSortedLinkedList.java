package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class MergeTwoSortedLinkedList {
	
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
	
	public static Node<Integer> merge(Node<Integer> a,Node<Integer> b)
	{
		if(a==null && b==null)
			return null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		Node<Integer> res=null;
		if(a.data<=b.data)
		{
			res=a;
			res.next=merge(a.next,b);
		}
		else
		{
			res=b;
			res.next=merge(a,b.next);
		}
		return res;
	}

	public static void main(String[] args) {
		Node<Integer> head1=createList();
		Node<Integer> head2=createList();
		Node<Integer> res=merge(head1,head2);
		printList(res);
	}

}
