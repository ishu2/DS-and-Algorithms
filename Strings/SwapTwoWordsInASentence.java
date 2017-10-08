package Strings;

import java.util.Scanner;

public class SwapTwoWordsInASentence {
	
	public static int indexOfPattern(String str,char ch)
	{
		int[] arr=new int[26];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=str.length()-1;
		}
		int i=str.length()-1;
		int k=0;
		while(i>=0)
		{
			int index=str.charAt(i)-'a';
			arr[index]=k;
			k++;
			i--;
		}
		int index=ch-'a';
		return arr[index];
	}
	
	public static int searchPattern(String pattern,String text)
	{
		if(pattern.length()>text.length())
		{
			return -1;
		}
		if(pattern.length()==0)
		{
			return -1;
		}
		int i=0;
		int k=pattern.length()-1;
		while(i<=text.length()-pattern.length())
		{
			if(pattern.charAt(k)==text.charAt(i+k))
			{
				k--;
			}
			else if(pattern.charAt(k)!=text.charAt(i+k))
			{
				int index=indexOfPattern(pattern.substring(0,k+1),text.charAt(i+k));
				i=i+index;
				k=pattern.length()-1;
			}
			if(k<0)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static String swapWords(String str,String w1,String w2)
	{
		if(w1==w2)
		{
			return str;
		}
		int index1=searchPattern(w1,str);
		int index2=searchPattern(w2,str);
		String res=str.substring(0,index1)+w2+str.substring(index1+w1.length(),index2)+w1+str.substring(index2+w2.length());
        return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sentence :-");
		String str=s.nextLine();
		System.out.println("Enter first word :-");
		String w1=s.next();
		System.out.println("Enter second word :-");
		String w2=s.next();
		String res=swapWords(str,w1,w2);
		System.out.println(res);
	}

}
