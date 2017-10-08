/* An interleaved string of given two strings preserves the order of characters in individual strings. 
   For example, in all the interleavings of above first example, ‘A’ comes before ‘B’ and ‘C’ comes 
   before ‘D’.

    Input: str1 = "AB",  str2 = "CD"
    Output:
            ABCD
            ACBD
            ACDB
            CABD
            CADB
            CDAB
*/
package GeeksForGeeks_Strings;

import java.util.Scanner;
import java.util.ArrayList;

public class PrintAllInterleavingsOfGivenTwoStrings {
	
	public static void printInterleaving(String str1,String str2,String res,int i)
	{
		if(str1.length()==0 && str2.length()==0)
		{
			System.out.println(res);
			return;
		}
		if(str1.length()!=0)
		{
			printInterleaving(str1.substring(1),str2,res+str1.charAt(0),i+1);
		}
		if(str2.length()!=0)
		{
			printInterleaving(str1,str2.substring(1),res+str2.charAt(0),i+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st string :");
		String s1=s.next();
		System.out.println("Enter 2nd string :");
		String s2=s.next();
		printInterleaving(s1,s2,"",0);
	}
	
}
