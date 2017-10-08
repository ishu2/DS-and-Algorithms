package Stack;
import java.util.Stack;

public class ImplementQueueUsingStack {
	
	public static Stack implementQueueUsing1UserStack(int[] arr,int i)
	{
		if(i==arr.length)
		{
			Stack res=new Stack();
			return res;
		}
		Stack s=implementQueueUsing1UserStack(arr,i+1);
		s.push(arr[i]);
		return s;
	}
	
	public static void implementQueueMakingPushEfficient(int[] arr)
	{
		if(arr.length==0)
		{
			return;
		}
		if(arr.length==1)
		{
			System.out.println(arr[0]);
			return;
		}
		Stack s1=new Stack();
		Stack s2=new Stack();
		int i=0;
		while(i<arr.length)
		{
			s1.push(arr[i]);
			i++;
		}
		while(!(s1.isEmpty()))
		{
			s2.push(s1.pop());
		}
		System.out.println("Queue using stack making push efficient :");
		while(!(s2.isEmpty()))
		{
			System.out.println(s2.pop());
		}
	}
	
	public static void implementQueueMakingPopEfficient(int[] arr)
	{
		if(arr.length==0)
		{
			return;
		}
		if(arr.length==1)
		{
			System.out.println(arr[0]);
			return;
		}
		Stack s1=new Stack();
		Stack s2=new Stack();
		int i=0;
		while(i<arr.length)
		{
			if(s1.isEmpty())
			{
				s1.push(arr[i]);
			}
			else
			{
				while(!(s1.isEmpty()))
				{
					s2.push(s1.pop());
				}
				s1.push(arr[i]);
				while(!(s2.isEmpty()))
				{
					s1.push(s2.pop());
				}
			}
			i++;
		}
		System.out.println("Queue using stack making pop efficient :");
		while(!(s1.isEmpty()))
		{
			System.out.println(s1.pop());
		}
	}
	
	public static void main(String[] args) {
		int[] arr={19,2,5,7,1,10};
		Stack s=implementQueueUsing1UserStack(arr,0);
		System.out.println("Queue using 1 user stack and 1 recursive stack :");
		while(!(s.isEmpty()))
		{
           System.out.println(s.pop());			
		}
		implementQueueMakingPushEfficient(arr);
		implementQueueMakingPopEfficient(arr);
	}

}
