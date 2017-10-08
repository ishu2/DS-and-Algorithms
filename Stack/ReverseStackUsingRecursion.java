package Stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {

	public static void reverseStack(Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			return;
		}
		int elt=s.pop();
		reverseStack(s);
		insertAtBottom(s,elt);
	}
	
	public static void insertAtBottom(Stack<Integer> s,int elt)
	{
		if(s.isEmpty())
		{
			s.push(elt);
			return;
		}
		int temp=s.pop();
		insertAtBottom(s,elt);
		s.push(temp);
	}

	
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		for(int i=1;i<=5;i++)
		{
			s.push(i);
		}
		reverseStack(s);
		System.out.println("Reversed stack is :");
		while(!(s.isEmpty()))
		{
			System.out.println(s.pop());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
