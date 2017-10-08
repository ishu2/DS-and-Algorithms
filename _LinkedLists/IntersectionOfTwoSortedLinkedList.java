package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class IntersectionOfTwoSortedLinkedList {
	
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
			System.out.println("No common nodes exists..");
			return;
		}
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static Node<Integer> intersection(Node<Integer> head1,Node<Integer> head2)
	{
		if(head1==null || head2==null)
			return null;
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(head1!=null && head2!=null)
		{
			if(head1.data==head2.data)
			{
				if(head==null)
				{
					head=head1;
					tail=head;
				}
				else
				{
					tail.next=head1;
					tail=tail.next;
				}
				head1=head1.next;
				head2=head2.next;
			}
			else if(head1.data<head2.data)
			{
				head1=head1.next;
			}
			else
			{
				head2=head2.next;
			}
		}
		return head;
	}
	
	public static Node<Integer> intersection2(Node<Integer> head1,Node<Integer> head2)
	{
		if(head1==null || head2==null)
			return null;
		Node<Integer> head=null;
		if(head1.data==head2.data)
		{
			head=head1;
			head.next=intersection2(head1.next,head2.next);
		}
		else if(head1.data<head2.data)
		{
			head=intersection2(head1.next,head2);
		}
		else
		{
			head=intersection2(head1,head2.next);
		}
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head1=createList();
		Node<Integer> head2=createList();
		printList(intersection2(head1,head2));
	}

}
