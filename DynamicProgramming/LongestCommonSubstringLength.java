package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubstringLength {
	
	public static int longestCommonSubstringLength(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return 0;
		}
		if(s1.length()==1 || s2.length()==1)
		{
			if(s1.charAt(0)==s2.charAt(0))
			{
				return 1;
			}
			else 
			{
				return 0;
			}
		}
		int count=0;
		int[][] res=new int[s1.length()][s2.length()];
		for(int j=0;j<s2.length();j++)
		{
			if(s1.charAt(0)==s2.charAt(j))
			{
			res[0][j]=1;
			}
			else
			{
				res[0][j]=0;
			}
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				res[i][0]=1;
			}
			else
			{
				res[i][0]=0;
			}
		}
		for(int i=1;i<s1.length();i++)
		{
			for(int j=1;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					res[i][j]=res[i-1][j-1]+1;
					count=Math.max(res[i][j], count);
				}
				else
				{
					res[i][j]=0;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first string :-");
		String str1=s.next();
		System.out.println("Enter second string :-");
		String str2=s.next();
		int len=longestCommonSubstringLength(str1,str2);
		System.out.println("Length of longest common substring is : "+len);
	}
	
}
