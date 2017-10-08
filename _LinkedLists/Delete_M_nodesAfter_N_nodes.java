package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class Delete_M_nodesAfter_N_nodes {

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
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static void delete(Node<Integer> head,int m,int n)
	{
		if(n==0)
			return;
		Node<Integer> tail=head;
		Node<Integer> prev=null;
		boolean flag=true;
		int i=1;
		while(tail!=null)
		{
			if(flag)
			{
				while(i<m && tail!=null)
				{
					tail=tail.next;
					i++;
				}
				if(tail==null)
					break;
				prev=tail;
				tail=tail.next;
				prev.next=null;
			}
			else
			{
				while(i<n && tail!=null)
				{
					tail=tail.next;
					i++;
				}
				if(tail==null)
					break;
				prev.next=tail.next;
				tail=tail.next;
			}
			i=1;
			flag=!flag;
		}
			
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		System.out.println("Enter M :");
		int M=s.nextInt();
		System.out.println("Enter N :");
		int N=s.nextInt();
		delete(head,M,N);
		printList(head);
	}
	
}
