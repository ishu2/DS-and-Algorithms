package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class MergeTwoListsInDecreasingOrder {

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
	
	public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2)
	{
		if(head1==null && head2==null)
			return null;
			Node<Integer> head=null;
			Node<Integer> temp=null;
			while(head1!=null && head2!=null)
			{
			    if(head1.data<head2.data)
			    {
			        temp=head1;
			        head1=head1.next;
			        temp.next=head;
			        head=temp;
			       
			    }
			    else
			    {
			        temp=head2;
			        head2=head2.next;
			        temp.next=head;
			        head=temp;
			        
			    }
			}
			while(head1!=null)
			{
			    temp=head1;
			    head1=head1.next;
			    temp.next=head;
			    head=temp;
			    
			}
			while(head2!=null)
			{
			  temp=head2;
			  head2=head2.next;
			  temp.next=head;
			  head=temp;
			     
			}
	       return head;
		
	}

	public static void main(String[] args) {
		System.out.println("List 1 :");
		Node<Integer> head1=createList();
		System.out.println("List 2 :");
		Node<Integer> head2=createList();
		Node<Integer> res=merge(head1,head2);
		printList(res);
	}
	
	
}
