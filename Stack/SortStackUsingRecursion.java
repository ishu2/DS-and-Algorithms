package Stack;

import java.util.Stack;

public class SortStackUsingRecursion {
	
	public static void sortStack(Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			return;
		}
		int elt=s.pop();
		sortStack(s);
		insertAtCorrectPosition(s,elt);
	}
	
	public static void insertAtCorrectPosition(Stack<Integer> s,int elt)
	{
		if(s.isEmpty() || elt>s.peek())
		{
			s.push(elt);
			return;
		}
		int temp=s.pop();
		insertAtCorrectPosition(s,elt);
		s.push(temp);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(30);
		s.push(-5);
		s.push(18);
		s.push(14);
		s.push(-1);
		sortStack(s);
		System.out.println("Sorted stack is :");
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}

}
