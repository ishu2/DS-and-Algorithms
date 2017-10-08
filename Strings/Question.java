/*   Q-  If str="baaaab"  and text="aa" , then find the no. of "aa" in the given string str.

         ("aa" can be overlapping ) In this case OutPut is 3.
 
 * */

package Strings;

public class Question {
	
	public static int count(String str,String txt)
	{
		if(str.length()<txt.length())
		{
			return 0;
		}
		if(str.length()==0 || txt.length()==0)
		{
			return 0;
		}
        int c=0;
		if(str.substring(0,txt.length()).equals(txt))
        {
	       c=c+1;
	       c=c+count(str.substring(1),txt);
		}
		else
		{
		c=c+count(str.substring(1),txt);
		}
	    return c;
	}
	
	public static void main(String[] args) {
		String str="aaaabbaaa";
		String txt="aaa";
		int res=count(str,txt);
		System.out.println(res);
	}
	
}
