package GeeksForGeeks_LinkedLists;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromUnsortedList {
	
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
	
	public static void removeDuplicates(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return;
		HashSet<Integer> set=new HashSet<>();
		set.add(head.data);
		while(head.next!=null)
		{
			if(set.contains(head.next.data))
			{
				head.next=head.next.next;
			}
			else
			{
				set.add(head.next.data);
				head=head.next;
			}
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		removeDuplicates(head);
		printList(head);
	}

}
