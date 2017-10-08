/*   Given two sorted linked lists, construct a linked list that contains maximum sum path from start to end.
    The result list may contain nodes from both input lists. When constructing the result list, we may switch
    to the other input list only at the point of intersection (which mean the two node with the same value in
    the lists). You are allowed to use O(1) extra space.
  
    Input:
           List1 =  1->3->30->90->120->240->511
           List2 =  0->3->12->32->90->125->240->249

    Output: 
           Following is maximum sum linked list out of two input lists
           list =  1->3->12->32->90->125->240->511
           we switch at 3 and 240 to get above maximum sum linked list

 */

package GeeksForGeeks_LinkedLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ConstructMaximumSumLinkedListOutOf2SortedLinkedListHavingSomeCommomNodes {

	static Scanner s=new Scanner(System.in);
	
	public static Node<Integer> createList()
	{
		System.out.println("Enter data :");
		int data=s.nextInt();
		if(data==-1)
			return  null;
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
	
	public static Node<Integer> maxSumList(Node<Integer> head1,Node<Integer> head2)
	{
		if(head1==null && head2==null)
			return null;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		HashMap<Integer,Integer> map=new HashMap<>();
		Node<Integer> tail1=head1;
		Node<Integer> tail2=head2;
		while(tail1!=null)
		{
			map.put(tail1.data, 1);
			tail1=tail1.next;
		}
		while(tail2!=null)
		{
			if(!map.containsKey(tail2.data))
				map.remove(tail2.data);
		}
		ArrayList<Integer> list=new ArrayList<>();
	    Set<Integer> set=map.keySet();
	    for(Integer i:set)
	    {
	    	list.add(i);
	    }
	    
	}
	
	public static void main(String[] args) {
		Node<Integer> head1=createList();
		Node<Integer> head2=createList();
		Node<Integer> res=maxSumList(head1,head2);
		printList(res);
	}
	
}
