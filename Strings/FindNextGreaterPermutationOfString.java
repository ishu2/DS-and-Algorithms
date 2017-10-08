package Strings;

import java.util.Scanner;

public class FindNextGreaterPermutationOfString {
	
	public static String nextGreaterPermutation(String str)
	{
		if(str.length()<=1)
			return str;
		char[] arr=str.toCharArray();
		int j=str.length()-1;
		while(j>0)
		{
			if(arr[j]>arr[j-1])
				break;
		}
		int k=j-1;
		char min=arr[k];
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		String res=nextGreaterPermutation(str);
		System.out.println("Resultant string : "+res);
	}

}
