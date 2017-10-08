/*   Suppose we have two Strings :- Pattern and Text
     pattern: consisting of unique characters
     text: consisting of any length
     We need to find the number of patterns that can be obtained from text removing each and every occurrence
     of Pattern in the Text.
  
     Input : 
             Pattern : ABC
             Text : ABABCABCC

     Output : 3
             Occurrences found at: 4 7 8
     Explanation
             Occurrences and their removal in the order
             1. ABABCABCC   2. ABABCC   3. ABC
 
 * */

package GeeksForGeeks_Strings;

import java.util.Scanner;
import java.util.Stack;

public class CountPatternOccurencesInText {

	public static int count(String pattern,String text)
	{
		if(text.length()<pattern.length())
			return 0;
		Stack<Character> s=new Stack<>();
		int i=pattern.length()-1;
		int j=0;
		int res=0;
		while(j<text.length())
		{
			s.push(text.charAt(j));
			while(i>=0 && s.peek()==pattern.charAt(i))
			{
				i--;
				s.pop();
			}
			if(i<0)
			{
				res++;
			}
			i=pattern.length()-1;
			j++;
		}
		i=pattern.length()-1;
		while(!s.isEmpty())
		{
			if(s.peek()==pattern.charAt(i))
			{
			  while(i>=0 && s.peek()==pattern.charAt(i))
			  {
				i--;
				s.pop();
			  }
			  if(i<0)
			  {
				res++;
			  }
			}
			else
			{
				s.pop();
			}
			i=pattern.length()-1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter pattern :");
		String pattern=s.next();
		System.out.println("Enter text :");
		String text=s.next();
		int res=count(pattern,text);
		System.out.println("Count = "+res);
	}
	
}
