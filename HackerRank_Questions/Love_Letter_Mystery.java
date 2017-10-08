
/*  Q-2 Find number of inversions required to make a string palindrome.


    Input:abc          Output:2
    Input:abcba        Output:0
    Input:abcd         Output:4
    Input:cba          Output:2

*/


package HackerRank_Questions;

import java.util.Scanner;

public class Love_Letter_Mystery {

	public static int inversionsRequired(String str)
	{
		if(str.length()==0 || str.length()==1)
		{
			return 0;
		}
		int count=0;
		if(str.charAt(0)>=str.charAt(str.length()-1))
		{
			count=(str.charAt(0)-str.charAt(str.length()-1))+inversionsRequired(str.substring(1, str.length()-1));
		}
		else
		{
			count=(str.charAt(str.length()-1)-str.charAt(0))+inversionsRequired(str.substring(1, str.length()-1));
		}
		return count;
	}
	
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        int i=0;
        while(i<T)
        {
		String str=s.next();
		int res=inversionsRequired(str);
		System.out.println(res);
		i++;
        }
	}
	
}
