package Strings;

import java.util.Scanner;

public class CountSubstringsWhoseStartingAndEndingCharactersAreSame {
	
	public static int count(String str)
	{
		if(str.length()==0 || str.length()==1)
		{
			return 0;
		}
		int[] arr=new int[26];
		int res=0;
		for(int i=0;i<str.length();i++)
		{
			int index=str.charAt(i)-'a';
			arr[index]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			res=res+(arr[i]*(arr[i]+1)/2);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		int res=count(str);
		System.out.println("No. of substring with same starting and ending characters are :-");
		System.out.println(res);
	}

}
