package GeeksForGeeks_Strings;

import java.util.Scanner;

public class PrintPermutationsOfString {
	
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
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		printPermutation(str,"");
	}

}
