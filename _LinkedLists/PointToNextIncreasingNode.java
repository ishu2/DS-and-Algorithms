package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class PointToNextIncreasingNode {
	
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
			head=head.arbitrary;
		}
	}
	
	public static Node<Integer> mergeSort(Node<Integer> head)
	{
	    if(head==null || head.arbitrary==null)
	    return head;
	    Node<Integer> slow=head;
	    Node<Integer> fast=head;
	    
	    while(fast!=null && fast.arbitrary!=null)
	    {
	        fast=fast.arbitrary.arbitrary;
	        if(fast==null || fast.arbitrary==null)
	        	break;
	        slow=slow.arbitrary;
	    }
	    fast=slow.arbitrary;
	    slow.arbitrary=null;
	    Node<Integer> a=mergeSort(head);
	    Node<Integer> b=mergeSort(fast);
	    return merge(a,b);
	}
	
	public static Node<Integer> merge(Node<Integer> a,Node<Integer> b)
	{
		 Node<Integer> res=null;
		if(a==null && b==null)
			return null;
	    if(a==null)
	    return b;
	    if(b==null)
	    return a;
	    if(a.data<=b.data)
	    {
	        res=a;
	        res.arbitrary=merge(a.arbitrary,b);
	    }
	     else
	     {
	        res=b;
	        res.arbitrary=merge(a,b.arbitrary);
	     }
	    return res;
	}
	
	public static Node<Integer> modifyList(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
		    temp.arbitrary=temp.next;
		    temp=temp.next;
		}
		Node<Integer> res=mergeSort(head);
        return res;
	}
	
	public static void main(String[] args) {
		Node<Integer> head=createList();
		Node<Integer> res=modifyList(head);
		printList(res);
	}

}
