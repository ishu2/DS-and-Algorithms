package Strings;

import java.util.Scanner;

public class StringContainingFirstLetterOfEveryWordInAGivenStringWithSpaces {

	public static String modifyString(String str)
	{
		if(str.length()<2)
			return str;
		String res="";
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			if(flag && Character.isAlphabetic(str.charAt(i)))
			{
				res+=str.charAt(i);
				flag=!flag;
			}
			else if(str.charAt(i)==' ')
			{
				flag=true;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.nextLine();
		String res=modifyString(str);
		System.out.println("Resultant string : "+res);
	}
	
}
