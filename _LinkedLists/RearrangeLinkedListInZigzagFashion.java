// a < b > c < d > e

package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class RearrangeLinkedListInZigzagFashion {

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
	
	public static Node<Integer> zigzag(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
		boolean flag=false;
		Node<Integer> tail=head;
		Node<Integer> res=head;
		if(tail.data>tail.next.data)
	        res=swap(head,tail,tail.next);
		else
			tail=tail.next;
		while(tail!=null && tail.next!=null)
		{
			if(flag)
			{
				if(tail.data>tail.next.data)
					swap(res,tail,tail.next);
				else
					tail=tail.next;
			}
			else
			{
				if(tail.data<tail.next.data)
					swap(res,tail,tail.next);
				else
					tail=tail.next;
			}
			flag=!flag;
		}
		return res;
	}
	
	public static Node<Integer> swap(Node<Integer> head,Node<Integer> a,Node<Integer> b)
	{
		if(head==null)
			return null;
		if(a==null && b==null)
			return null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		Node<Integer> prev1=null;
		Node<Integer> prev2=null;
		Node<Integer> curr1=head;
		Node<Integer> curr2=head;
		while(curr1!=null && curr1.data!=a.data)
		{
			prev1=curr1;
			curr1=curr1.next;
		}
		if(curr1==null)
			return head;
		while(curr2!=null && curr2.data!=b.data)
		{
			prev2=curr2;
			curr2=curr2.next;
		}
		if(curr2==null)
			return head;
		if(prev1==null)
			head=curr2;
		else
			prev1.next=curr2;
		if(prev2==null)
			head=curr1;
		else
			prev2.next=curr1;
		Node<Integer> temp=curr1.next;
		curr1.next=curr2.next;
		curr2.next=temp;
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		Node<Integer> res=zigzag(head);
		printList(res);
	}
	
}
