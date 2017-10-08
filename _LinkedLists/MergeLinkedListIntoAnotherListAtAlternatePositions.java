package GeeksForGeeks_LinkedLists;

import java.util.Scanner;

public class MergeLinkedListIntoAnotherListAtAlternatePositions {
	
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
	
	public static void main(String[] args) {
		Node<Integer> head1=createList();
		Node<Integer> head2=createList();
		Node<Integer>
	}

}
