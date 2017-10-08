package GeeksForGeeks_LinkedLists;

public class SublistSearch_CheckAListInOtherList {
	
	public static boolean checkSublist(Node<Integer> head1,Node<Integer> head2)
	{
		int l1=count(head1);
		int l2=count(head2);
		if(l1>l2)
		{
			return false;
		}
		int i=l1;
		int j=0;
		Node<Integer> p1=head1;
		Node<Integer> p2=head2;
		while(p2!=null)
		{
			if(p1.data==p2.data)
			{
				p1=p1.next;
				p2=p2.next;
				j++;
			}
			else
			{
				p1=head1;
				j=0;
			}
		}
		if(i==j)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	public static int count(Node<Integer> head)
	{
		if(head==null)
		{
			return 0;
		}
		Node<Integer> tail=head;
		int count=0;
		while(tail!=null)
		{
			count++;
			tail=tail.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Node<Integer> head1=new Node<Integer>(1);
		head1.next=new Node<Integer>(2);
		head1.next.next=new Node<Integer>(3);
		head1.next.next.next=new Node<Integer>(6);
		Node<Integer> head2=new Node<Integer>(1);
		head2.next=new Node<Integer>(2);
		head2.next.next=new Node<Integer>(1);
		head2.next.next.next=new Node<Integer>(2);
		head2.next.next.next.next=new Node<Integer>(3);
		head2.next.next.next.next.next=new Node<Integer>(8);
		boolean res=checkSublist(head1,head2);
		System.out.println(res);
	}

}
