package Strings;

import java.util.Scanner;

public class MaximumOccuringCharacter {
	
	public static char maxOccuringCharacter(String str)
	{
		if(str.length()==1)
		{
			return str.charAt(0);
		}
		int[] arr=new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			int index=str.charAt(i)-'a';
			arr[index]++;
		}
		char res=' ';
		int f=0;
		for(int i=0;i<str.length();i++)
		{
			int index=str.charAt(i)-'a';
			if(arr[index]==f && str.charAt(i)<res)  // if same freq , then print smaller alphabet i.e. lexicographical order
			{
				res=str.charAt(i);
			}
		    if(arr[index]>f)
			{
				f=arr[index];
				res=str.charAt(i);
			}
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char res=maxOccuringCharacter(str);
		System.out.println(res);
	}

}
