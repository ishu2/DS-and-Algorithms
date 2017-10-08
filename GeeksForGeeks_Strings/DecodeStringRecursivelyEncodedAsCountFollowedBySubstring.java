package GeeksForGeeks_Strings;

import java.util.Scanner;

public class DecodeStringRecursivelyEncodedAsCountFollowedBySubstring {

	public static String decodeString(String str)
	{
		if(str.length()==0)
			return "";
		String res=decodeString(str.substring(1));
		if(Character.isAlphabetic(str.charAt(0)))
		{
			res=str.charAt(0)+res;
		}
		else if(Character.isDigit(str.charAt(0)))
		{
			int count=str.charAt(0)-'0';
			String s=res;
			while(count>1)
			{
				res=s+res;
				count--;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		String res=decodeString(str);
		System.out.println("Decoded string : "+res);
	}
	
}
