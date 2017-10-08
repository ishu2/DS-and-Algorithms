package Stack;

import java.util.Stack;

public class SortStack {
	
	public static void sortStack(Stack s)
	{
		if(s.isEmpty())
		{
			return;
		}
		Stack s2=new Stack();
		while(!(s.isEmpty()))
		{
			int elt=(int) s.pop();
	        if(s2.isEmpty())
	        {
	        	s2.push(elt);
	        }
	        else
	        {
	        	int s2elt=(int) s2.pop();
	        	if(s2elt>elt)
	        	{
	        		s2.push(s2elt);
	        		s2.push(elt);
	        	}
	        	else
	        	{
	        		while(s2elt<elt)
	        		{
	        			s.push(s2elt);
	        			if(s2.isEmpty())
	        				break;
	        			s2elt=(int) s2.pop();
	        		}
	        		s2.push(elt);
	        	}
	        }
		}
		s=s2;
		while(!(s.isEmpty()))
		{
			System.out.println(s.pop());
		}
	}
	
	public static void main(String[] args) {
		int[] arr={15,16,11};
		Stack s=new Stack();
		for(int i=0;i<arr.length;i++)
		{
			s.push(arr[i]);
		}
		sortStack(s);
	}

}
