package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class SwapNodes {
	
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
			return;
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static Node<Integer> swap(Node<Integer> head,int data1,int data2)
	{
		if(head==null || head.next==null)
			return head;
		Node<Integer> prev1=null;
		Node<Integer> curr1=head;
		Node<Integer> prev2=null;
		Node<Integer> curr2=head;
		while(curr1!=null && curr1.data!=data1)
		{
			prev1=curr1;
			curr1=curr1.next;
		}
		if(curr1==null)
			return head;
		while(curr2!=null && curr2.data!=data2)
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
		System.out.println("Enter x :");
		int x=s.nextInt();
		System.out.println("Enter y :");
		int y=s.nextInt();
		Node<Integer> res=swap(head,x,y);
		printList(res);
	}

}
