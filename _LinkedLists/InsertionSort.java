package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class InsertionSort {
	
	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> createList()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
			return null;
		Node<Integer> head=new Node<>(data);
		head.next=createList();
		return head;
	}
	
	public static void printList(Node<Integer> head)
	{
		if(head==null)
			return;
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static Node<Integer> sort(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		Node<Integer> res=null;
		Node<Integer> tail=null;
		Node<Integer> temp=head;
		while(temp!=null)
		{
			Node<Integer> a=temp;
			temp=temp.next;
			a.next=null;
			if(res==null)
			{
				res=a;
				tail=a;
			}
			else if(a.data<res.data)
			{
				a.next=res;
				res=a;
			}
			else
			{
				tail=res;
				while(tail.next!=null && tail.next.data<a.data)
				{
					tail=tail.next;
				}
				a.next=tail.next;
				tail.next=a;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		Node<Integer> res=sort(head);
		printList(res);
	}

}
