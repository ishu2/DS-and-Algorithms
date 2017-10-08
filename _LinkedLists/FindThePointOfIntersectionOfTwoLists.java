package GeeksForGeeks_LinkedLists;

public class FindThePointOfIntersectionOfTwoLists {
	
	public static Node<Integer> pointOfIntersection(Node<Integer> head1,Node<Integer> head2)
	{
		if(head1==null && head2!=null)
		{
			return head2;
		}
		if(head2==null && head1!=null)
		{
			return head1;
		}
		int l1=count(head1);
		int l2=count(head2);
		int d=0;
		Node<Integer> front=null;
		Node<Integer> front2=null;
		if(l1>l2)
		{
			d=l1-l2;
			front=head1;
			front2=head2;
		}
		else
		{
			d=l2-l1;
			front=head2;
			front2=head1;
		}
		while(d>0)
		{
			front=front.next;
			d--;
		}
		
		while(front!=null  || front2!=null)
		{
			if(front.data==front2.data)
			{
				return front;
			}
			front=front.next;
			front2=front2.next;
		}
		return null;
	}
	
	public static int count(Node<Integer> head)
	{
		if(head==null)
		{
			return 0;
		}
		int count=0;
		Node<Integer> tail=head;
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
		head1.next.next.next=new Node<Integer>(4);
		head1.next.next.next.next=new Node<Integer>(5);
		head1.next.next.next.next.next=new Node<Integer>(6);
		
		Node<Integer> head2=new Node<Integer>(8);
		head2.next=new Node<Integer>(10);
		head2.next.next=new Node<Integer>(5);
		head2.next.next.next=new Node<Integer>(6);
		
		Node<Integer> res=pointOfIntersection(head1,head2);
		System.out.println("point of intersection of two nodes is :");
		System.out.println(res.data);
	}

}
