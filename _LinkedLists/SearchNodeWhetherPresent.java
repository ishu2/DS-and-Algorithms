package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class SearchNodeWhetherPresent {
	
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
	
	public static boolean searchRecursively(Node<Integer> head,int data)
	{
		if(head==null)
		{
			return false;
		}
		if(head.data==data)
		{
			return true;
		}
		boolean res=false;
		res=searchRecursively(head.next,data);
		return res;
	}
	
	public static boolean searchIteratively(Node<Integer> head,int data)
	{
		if(head==null)
		{
			return false;
		}
		boolean res=false;
		while(head!=null)
		{
			if(head.data==data)
			{
				res=true;
				break;
			}
			head=head.next;
		}
		return res;
	}

	public static void main(String[] args) {
		Node<Integer> head=createList();
		System.out.println("Enter data which you want to search :-");
		int data=s.nextInt();
	    boolean res=searchRecursively(head,data);
	    System.out.println(res);
	    boolean res2=searchIteratively(head,data);
	    System.out.println(res2);
	    		
	}
	
}
