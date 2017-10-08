package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class ReverseLinkedList_Recursively {
	
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
	
	static Node<Integer> root=null;
	
	public static void reverseList(Node<Integer> prev,Node<Integer> curr)
	{
		if(curr==null)
		{
			return;
		}
		if(curr.next==null)
		{
			root=curr;
			curr.next=prev;
			return ;
		}
		Node<Integer> temp=curr.next;
		curr.next=prev;
		reverseList(curr,temp);
		
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		reverseList(null,head);
		System.out.println("Reversed list :");
		while(root!=null)
		{
			System.out.println(root.data);
			root=root.next;
		}
	}

}
