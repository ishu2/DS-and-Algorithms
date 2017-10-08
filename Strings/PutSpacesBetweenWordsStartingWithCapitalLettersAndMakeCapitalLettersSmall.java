package Strings;

import java.util.Scanner;

public class PutSpacesBetweenWordsStartingWithCapitalLettersAndMakeCapitalLettersSmall {

	public static String putSpaces(String str)
	{
		if(str.length()==0)
			return str;
		String res=Character.toLowerCase(str.charAt(0))+"";
		for(int i=1;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				res=res+" "+Character.toLowerCase(str.charAt(i));
			}
			else
			{
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.nextLine();
		String res=putSpaces(str);
		System.out.println(res);
	}
	
}
