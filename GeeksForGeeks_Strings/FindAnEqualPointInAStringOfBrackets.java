/*  Given a string of brackets, the task is to find an index k which decides the number of opening brackets
 *  is equal to the number of closing brackets.
    String must be consists of only opening and closing brackets i.e. ‘(‘ and ‘)’.
    An equal point is an index such that the number of opening brackets before it is equal to the number of
    closing brackets from and after.

    Examples:
     
     Input : str = "(())))("
     Output:   4

     After index 4, string splits into (())and ))(. Number of opening brackets in the 
     first part is equal to number of closing brackets in the second part.

     Input : str = "))"
     Output: 2

     As after 2nd position i.e. )) and "empty" string will be split into these two parts:
     So, in this number of opening brackets i.e.0 in the first part is equal to number of 
     closing brackets in the second part i.e. also 0.
 
 * */

package GeeksForGeeks_Strings;

public class FindAnEqualPointInAStringOfBrackets {
	
	public static int findEquilibriumIndex(String str)
	{
		if(str.length()<=1)
		{
			return str.length();
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==')')
			{
				count2++;
			}
			else
			{
				count1++;
			}
		}
		if(count1==0 || count2==0)
		{
			return str.length();
		}
		int res=0;
		count1=0;
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i)=='(')
		    {
		    	count1++;
		    }
		    else
		    {
		    	count2--;
		    }
		    if(count1==count2)
		    {
		    	res=i+1;
		    	break;
		    }
		}
		return res;
	}
	
	public static void main(String[] args) {
		String str="(()))(()()())))";
		int res=findEquilibriumIndex(str);
		System.out.println(res);
	}

}
