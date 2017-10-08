package Strings;

import java.util.Scanner;

public class FindUncommonCharactersInTwoStrings {

	public static void printUncommonCharacters(String str1,String str2)
	{
		if(str1.length()==0 && str2.length()==0)
		{
			System.out.println("No common characters ..");
			return;
		}
		if(str1.length()==0)
		{
			for(int i=0;i<str2.length();i++)
				System.out.println(str2.charAt(i));
			return;
		}
		if(str2.length()==0)
		{
			for(int i=0;i<str1.length();i++)
				System.out.println(str1.charAt(i));
			return;
		}
		int[] arr1=new int[26];
		int[] arr2=new int[26];
		for(int i=0;i<str1.length();i++)
	        arr1[str1.charAt(i)-'a']++;
		for(int i=0;i<str2.length();i++)
			arr2[str2.charAt(i)-'a']++;
		boolean flag=false;
		for(int i=0;i<26;i++)
		{
			if((arr1[i]!=0 && arr2[i]==0) || arr2[i]!=0 && arr1[i]==0)
			{
				char res=(char) (i+'a');
				System.out.print(res+" ");
				flag=true;
			}
		}
		if(!flag)
			System.out.println("No uncommon characters exists..");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string 1 :");
		String str1=s.next();
		System.out.println("Enter string 2 :");
		String str2=s.next();
		printUncommonCharacters(str1,str2);
	}
	
}
