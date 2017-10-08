package GeeksForGeeks_Strings;

import java.util.Scanner;
import java.util.Stack;

public class IfExpressionIsValidThenComputeTheResult {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter expression :");
		String str=s.nextLine();
		System.out.println(Integer.valueOf((char) 8));
		checkExpression(str);
	}
	
	// This function is created assuming that the integers will be of single digit only.
	
	public static void checkExpression(String exp)
	{
		if(exp==null || exp.length()%2==0)
		{
			System.out.println("Invalid expression..");
			return;
		}
		Stack<Integer> digit=new Stack<>();
		Stack<Character> op=new Stack<>();
		boolean flag=true;
		for(int i=0;i<exp.length();i++)
		{
			if(flag)
			{
				char ch=exp.charAt(i);
				if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
				{
					System.out.println("Invalid expression..");
					return;
				}
				int elt=Integer.valueOf(ch);
				digit.push(elt);
				System.out.println(digit.peek());
			}
			else
			{
				char ch=exp.charAt(i);
				int pr=priority(ch);
			  	if(!op.isEmpty() && priority(op.peek())>pr)
			  	{
			  		while(priority(op.peek())>pr && !op.isEmpty())
			  		{
			  			int a=digit.pop();
			  			int b=digit.pop();
			  			char c=op.pop();
			  			int res=0;
			  			if(c=='+')
			  				res=a+b;
			  			else if(c=='-')
			  				res=a-b;
			  			else if(c=='*')
			  				res=a*b;
			  			else
			  				res=a/b;
			  			digit.push(res);
			  		}
			  	}
			  	op.push(ch);
			}
			flag=!flag;
		}
	    while(!digit.isEmpty() && !op.isEmpty())
	    {
	    	int a=digit.pop();
  			int b=digit.pop();
  			char c=op.pop();
  			if(c=='+')
  				digit.push(a+b);
  			else if(c=='-')
  				digit.push(a-b);
  			else if(c=='*')
  				digit.push(a*b);
  			else
  				digit.push(a/b);
	    }
	    int res=digit.pop();
	    System.out.println("Result = "+res);
	}
	
	public static int priority(char ch)
	{
		switch(ch)
		{
		case '+':return 1;
		case '-':return 1;
		case '*':return 2;
		case '/':return 2;
		}
		return -1;
	}
	
}
