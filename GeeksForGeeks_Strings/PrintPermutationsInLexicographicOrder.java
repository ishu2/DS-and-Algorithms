package GeeksForGeeks_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class PrintPermutationsInLexicographicOrder {
	
	public static void printPermutation(String str,String res)
	{
		if(str.length()==0)
		{
			System.out.println(res);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			printPermutation(str.substring(0, i)+str.substring(i+1),res+str.charAt(i));
		}
	}
	
	public static String sortString(String str)
	{
		if(str.length()<2)
		{
			return str;
		}
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		str=String.valueOf(arr);
		return str;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		str=sortString(str);
		printPermutation(str,"");
	}

}
