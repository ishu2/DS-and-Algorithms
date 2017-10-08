package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubstring {
	
	public static String commonSubstring(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return null;
		}
		int[][] arr=new int[s1.length()][s2.length()];
		int count=0;
		int res=0;
		String str="";
		for(int j=0;j<s2.length();j++)
		{
			if(s1.charAt(0)==s2.charAt(j))
			{
				arr[0][j]=1;
				if(count==0)
				{
					count=1;
					str=str+s1.charAt(0);
				}
			}
			else
			{
				arr[0][j]=0;
			}
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				arr[i][0]=1;
				if(count==0)
				{
					count=1;
					str=str+s2.charAt(0);
				}
			}
			else
			{
				arr[i][0]=0;
			}
		}
		for(int i=1;i<s1.length();i++)
		{
			for(int j=1;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					arr[i][j]=arr[i-1][j-1]+1;
					if(arr[i][j]>count)
					{
						count++;
						str=s1.substring(i-count+1,i+1);
					}
				}
				else
				{
					arr[i][j]=0;
				}
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr first string :");
		String str1=s.next();
		System.out.println("Enter second string :");
		String str2=s.next();
		String res=commonSubstring(str1,str2);
		System.out.println("Longest common substring is :");
		System.out.println(res);
	}

}
