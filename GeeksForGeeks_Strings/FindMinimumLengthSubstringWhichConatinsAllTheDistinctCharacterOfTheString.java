package GeeksForGeeks_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumLengthSubstringWhichConatinsAllTheDistinctCharacterOfTheString {

	public static String minimumLengthSubstring(String str)
	{
		if(str.length()<2)
		{
			return str;
		}
		int[] charArr=new int[256];
		for(int i=0;i<256;i++)
		{
			charArr[i]=0;
		}
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(charArr[str.charAt(i)]==0)
			{
				charArr[str.charAt(i)]=1;
				count++;
			}
		}
		for(int i=0;i<256;i++)
		{
			charArr[i]=0;
		}
		int start=0;
		int len=0;
		int i=0;
		int minLength=Integer.MAX_VALUE;
		String res="";
		while(i<str.length())
		{
			charArr[str.charAt(i)]++;
			
			if(charArr[str.charAt(i)]==1)
				len++;
			
			if(len==count)
			{
			  while(charArr[str.charAt(start)]>1)
			  {
				  charArr[str.charAt(start)]--;
				  start++;
			  }
			  int j=i-start+1;
			  if(j<minLength)
			  {
				minLength=j;
				res=str.substring(start, i+1);
		      }
			}
			i++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sgtring :");
		String str=s.next();
		String res=minimumLengthSubstring(str);
		System.out.println("Minimum length substring containing"
				+ "all the distinct characters of this string is :" );
		System.out.println(res);
	}
	
}
