/*
 *  Given a string consisting of some numbers, not separated by any separator. The numbers are positive 
 *  integers and the sequence increases by one at each number except the missing number. The task is to
 *  find the missing number. The numbers will have no more than six digits. Print -1 if input sequence is
 *  not valid. 

    Examples:
             Input  : 89101113
             Output : 12

             Input  : 9899101102
             Output : 100

             Input  : 596597598600601602:
             Output : 599

 */

package Strings;

public class FindTheMissingNumberInAStringOfNumbersWithNoSeparator {
	
	public static int findMissingNumber(String str)
	{
		if(str.length()<5)
		{
			return -1;
		}
		int res=-1;
		int digit=str.length()/6;
		if(digit==0)
		{
			digit=1;
		}
		int i=0;
		while(i<str.length()-digit)
		{
			int end=i+digit;
			int a=Integer.parseInt(str.substring(i,end));
			int b=Integer.parseInt(str.substring(end,end+digit));
			if(a!=b-1)
			{
				res=a+1;
				break;
			}
			if((a+1)%10==0 || (b+1)%10==0)
			{
				digit=digit+1;
			}
			i=i+digit;
		}
		return res;
	}
	
	public static void main(String[] args) {
		String str="56891011";
		int res=findMissingNumber(str);
		System.out.println(res);
	}

}
