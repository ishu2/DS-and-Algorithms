package GeeksForGeeks_Strings;

import java.util.Scanner;

public class ReverseStringUsingRecursion {
	
	public static String reverseString(String str)
	{
		if(str.length()==0)
		{
			return "";
		}
		String res=reverseString(str.substring(1));
		res+=str.charAt(0);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=s.next();
		String res=reverseString(str);
		System.out.println(res);
	}	
}
