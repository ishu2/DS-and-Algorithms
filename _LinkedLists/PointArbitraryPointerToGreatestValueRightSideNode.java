package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class PointArbitraryPointerToGreatestValueRightSideNode {
	
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
			if(head.arbitrary!=null)
			System.out.println(head.data+" --> "+head.arbitrary.data);
			head=head.next;
		}
	}
	
	public static Node<Integer> reverse(Node<Integer> head)
	{
		Node<Integer> root=null;
		if(head==null)
			return null;
		if(head.next==null)
		return head;
		root=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return root;
	}
	
	public static void arbitraryPointers(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return;
		Node<Integer> node=reverse(head);
		Node<Integer> temp=node;
		Node<Integer> tail=node.next;
		while(tail!=null)
		{
			tail.arbitrary=temp;
			if(tail.data>temp.data)
				temp=tail;
			tail=tail.next;
		}
		head=reverse(node);
	}
	
	public static Node<Integer> arbitraryPointers_Recursive(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		Node<Integer> temp=arbitraryPointers_Recursive(head.next);
		head.arbitrary=temp;
		if(head.data>temp.data)
			temp=head;
		return temp;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		System.out.println("Iterative :");
		arbitraryPointers(head);
		printList(head);
		Node<Integer> temp=head;  // change the arbitrary pointers again to null
		while(temp!=null)
		{
			temp.arbitrary=null;
			temp=temp.next;
		}
		System.out.println("Recursive :");
		arbitraryPointers_Recursive(head);
		printList(head);
	}

}
