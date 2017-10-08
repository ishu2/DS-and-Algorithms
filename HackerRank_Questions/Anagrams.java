/*   Q-1 find the number of inversions required to make two strings anagram (the two strings are obtained by 


 *       breaking a single string into two equal parts.
 *
 *       T=6   (no. of test cases) 
 *       Input:aaabbb   Output:3
 *       Input:ab       Output:1
 *       Input:abc      Output:-1
 *       Input:mnop     Output:2
 *       Input:xyyx     Output:0
 *       Input:xaxbbbxx  Output:1
 * 
 * */





package HackerRank_Questions;

import java.util.Scanner;

public class Anagrams {
	
	public static int inversionsRequired(String str)
	{
		if(str.length()%2!=0)
		{
			return -1;
		}
		int mid=str.length()/2;
		String s1=str.substring(0,mid);
		String s2=str.substring(mid);
		int[] a1=new int[26];
		int[] a2=new int[26];
		for(int i=0;i<s1.length();i++)
		{
			int index=s1.charAt(i)-'a';
			a1[index]=a1[index]+1;
		}
		for(int i=0;i<s2.length();i++)
		{
			int index=s2.charAt(i)-'a';
			a2[index]++;
		}
		int count=0;
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]!=0)
			{
				if(a1[i]-a2[i]>=1)
				{
					count=count+a1[i]-a2[i];
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int i=0;
		while(i<T)
		{
			String str=s.next();
			int res=inversionsRequired(str);
			System.out.println(res);
			i++;
		}
	}

}
