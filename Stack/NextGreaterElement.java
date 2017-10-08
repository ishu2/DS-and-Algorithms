package Stack;

import java.util.Stack;

public class NextGreaterElement {
	
	public static void nextGreaterElement(int[] arr)
	{
		if(arr.length==0)
		{
			return;
		}
		Stack<Integer> s=new Stack<>();
		s.push(arr[0]);
		int i=1;
		while(i<arr.length)
		{
			int temp=arr[i];
			if(temp>s.peek())
			{
				while(!s.isEmpty() && temp>s.peek())
				{
				  int elt=s.pop();
				  System.out.println(elt+" --> "+temp);
				}
			}
			s.push(temp);
			i++;
		}
		while(!s.isEmpty())
		{
			System.out.println(s.pop()+" --> -1");
		}
	}
	
	public static void main(String[] args) {
		int[] arr={13,14,15,16};
		nextGreaterElement(arr);
	}

}
