package LinkedList;

import java.util.HashMap;
import java.util.Set;

public class UnionOfTwoLinkedLists {
	
	public static Node<Integer> unionOfTwoLists(Node<Integer> head1,Node<Integer> head2)
	{
		if(head1==null && head2==null)
		{
			return null;
		}
		if(head1==null)
		{
			return head2;
		}
		if(head2==null)
		{
			return head1;
		}
		Node<Integer> res=null;
		Node<Integer> tail=null;
		Node<Integer> tail1=head1;
		Node<Integer> tail2=head2;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		while(tail1!=null)
		{
			if(map.containsKey(tail1.data))
			{
				map.put(tail1.data, map.get(tail1.data)+1);
				tail1=tail1.next;
			}
			else
			{
				map.put(tail1.data,1);
				tail1=tail1.next;
			}
		}
		while(tail2!=null)
		{
			if(map.containsKey(tail2.data))
			{
				map.put(tail2.data, map.get(tail2.data)+1);
				tail2=tail2.next;
			}
			else
			{
				map.put(tail2.data,1);
				tail2=tail2.next;
			}
		}
		Set<Integer> set=map.keySet();
		for(Integer i:set)
		{
			if(res==null)
			{
				res=new Node<Integer>(i);
				tail=res;
			}
			else
			{
				tail.next=new Node<Integer>(i);
				tail=tail.next;
			}
		}
		return res;
	}
	
	public static Node<Integer> union(Node<Integer> head1,Node<Integer> head2)
	{
		if(head1==null && head2==null)
		{
			return null;
		}
		if(head1==null && head2!=null)
		{
			return head2;
		}
		if(head2==null && head1!=null)
		{
			return head1;
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		Node<Integer> res=head1;
		while(head1.next!=null)
		{
			if(map.containsKey(head1.data))
			{
				map.put(head1.data, map.get(head1.data)+1);
			}
			else
			{
				map.put(head1.data, 1);
			}
			head1=head1.next;
		}
		if(map.containsKey(head1.data))
		{
			map.put(head1.data, map.get(head1.data)+1);
		}
		else
		{
			map.put(head1.data, 1);
		}
		while(head2!=null)
		{
			if(map.containsKey(head2.data))
			{
				if(map.get(head2.data)==1)
				{
					map.remove(head2.data);
				}
				else
				{
					map.put(head2.data, map.get(head2.data)-1);
				}
			}
			else
			{
				head1.next=head2;
				head1=head1.next;
			}
			head2=head2.next;
		}
		return res;
	}
	
	public static void printList(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		Node<Integer> tail=head;
		while(tail!=null)
		{
			System.out.println(tail.data);
			tail=tail.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head1=new Node<Integer>(3);
		head1.next=new Node<Integer>(5);
		head1.next.next=new Node<Integer>(8);
		head1.next.next.next=new Node<Integer>(10);
		head1.next.next.next.next=new Node<Integer>(12);
		head1.next.next.next.next.next=new Node<Integer>(12);
		
		Node<Integer> head2=new Node<Integer>(1);
		head2.next=new Node<Integer>(2);
		head2.next.next=new Node<Integer>(3);
		head2.next.next.next=new Node<Integer>(4);
		head2.next.next.next.next=new Node<Integer>(5);
		
		Node<Integer> head=union(head1,head2);
		printList(head);
	}

}
