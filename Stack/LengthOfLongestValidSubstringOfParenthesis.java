//  Find length of longest valid substring os parenthesis.
//  Foe eg:- 1. "((()"  Output=2       2.  "()(()))))"  Output=6

package Stack;
import java.util.Scanner;
import java.util.Stack;

public class LengthOfLongestValidSubstringOfParenthesis {

	public static int findLength(String str)
	{
		if(str.length()<=1)
		{
			return 0;
		}
		int count=0;
		int i=0;
		Stack s=new Stack();
		while(i<str.length())
		{
			if(str.charAt(i)=='(')
			{
				s.push('(');
			}
			else
			{
				if(!(s.isEmpty()))
				{
					s.pop();
					count+=2;
				}
			}
			i++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Entyer string containing parenthesis :");
		String str=s.next();
		int res=findLength(str);
		System.out.println("Length = "+res);
		
	}
	
}
