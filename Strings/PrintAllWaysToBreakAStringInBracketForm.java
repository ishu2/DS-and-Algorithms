package Strings;

import java.util.Scanner;

public class PrintAllWaysToBreakAStringInBracketForm {

	public static void print(String str,String result)
	{
		if(str.length()==0 || str==null)
		{
			System.out.println(result);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			print(str.substring(i+1),result+'('+str.substring(0, i+1)+')');
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		print(str,"");
	}
	
}
