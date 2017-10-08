package Strings;

import java.util.Stack;

public class PostfixExpressionEvaluation {

	public static int evaluate(String[] str)
	{
		if(str.length==0)
		{
			return -1;
		}
		if(str.length==1)
		{
			return Integer.parseInt(str[0]);
		}
		int i=0;
		int elt=0;
		Stack s=new Stack();
		s.push(Integer.parseInt(str[0]));
		s.push(Integer.parseInt(str[1]));
		i=2;
		while(i<str.length)
		{
			if(isOperator(str[i]))
			{
				int a=(int) s.pop();
				int b=(int) s.pop();
				if(str[i]=="+")
			    elt=(b+a);
				else if(str[i]=="-")
				elt=(b-a);
				else if(str[i]=="*")
				elt=(b*a);
				else
				elt=(b/a);
				s.push(elt);
			}
			else
			{
				s.push(Integer.parseInt(str[i]));
			}
			i++;
		}
		return (int) s.pop();
	}
	
	public static boolean isOperator(String c)
	{
		if(c=="+" || c=="-" || c=="*" || c=="/")
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String[] str={"5","1","2","+","4","*","+","3","-"};
		int res=evaluate(str);
		System.out.println(res);
	}
	
}
