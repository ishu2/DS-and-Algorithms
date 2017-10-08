package GeeksForGeeks_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveCharactersFrom1stStringWhichArePresentIn2ndString {
	
	public static String modifyStr1(String str1,String str2)
	{
		if(str1.length()==0 || str2.length()==0)
		{
			return str1;
		}
		boolean[] arr=new boolean[26];
		Arrays.fill(arr, false);
		for(int i=0;i<str1.length();i++)
		{
			arr[str1.charAt(i)-'a']=true;
		}
		for(int i=0;i<str2.length();i++)
		{
			if(arr[str2.charAt(i)-'a']==true)
			{
				arr[str2.charAt(i)-'a']=false;
			}
		}
		String res="";
		for(int i=0;i<str1.length();i++)
		{
			if(arr[str1.charAt(i)-'a']==true)
			{
				res+=str1.charAt(i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1="muisic";
		String str2="movie";
		String res=modifyStr1(str1,str2);
		System.out.println("String 1 : "+res);
	}

}
