package Stack;

import java.util.Stack;

public class CheckForBalancedParenthesis {
	
	public static boolean checkBalancing(String str)
	{
		if(str.length()==0 || str.length()==1)
		{
			return false;
		}
		if(str.length()%2!=0)
		{
			return false;
		}
		int i=0;
		Stack s=new Stack();
		while(i<str.length())
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
			{
				s.push(str.charAt(i));
				
			}
			else
			{
				char ch=(char) s.pop();
				if(str.charAt(i)==')' && ch!='(' )
				{
					return false;
				}
				else if(str.charAt(i)=='[' && ch!=']')
				{
					return false;
				}
				else if(str.charAt(i)=='{' && ch!='}')
				{
					return false;
				}
			}
			i++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str="[(])";
		boolean res=checkBalancing(str);
		System.out.println(res);
	}

}
