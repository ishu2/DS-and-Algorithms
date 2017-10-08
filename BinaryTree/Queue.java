package BinaryTree;

public class Queue<T> {
	 LinkedListNode<T> front;
	 LinkedListNode<T> rear;
	 T data;
	 int size;
	public Queue()
	{
		size=0;
		front=null;
		rear=null;
	}
	
	public void enque(T data)
	{
		LinkedListNode<T> newnode=new LinkedListNode<>(data);
		if(front==null)
		{
			front=newnode;
			rear=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
		size++;
	}
	
	public T deque() throws queueUnderflow
	{
		if(front== null)
		{
			throw new queueUnderflow();
		}
		T res=front.data;
		front=front.next;
		size--;
		return res;
	}
	
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		return false;
	}
	
    public T getFront()
    {
    	if(front==null)
    	{
    		System.out.println("Queue underflow");
    		return null;
    	}
    	return front.data;
    }
    
    public T getRear()
    {
    	if(rear==null)
    	{
    		System.out.println("Queue underflow");
    		return null;
    	}
    	return rear.data;
    }

}
