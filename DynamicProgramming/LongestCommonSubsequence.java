package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequence {
	
	public static String commonSubsequence(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return null;
		}
		if(s1.length()==1 && s1.charAt(0)!=s2.charAt(0))
		{
			return null;
		}
		if(s2.length()==1 && s1.charAt(0)!=s2.charAt(0))
		{
			return null;
		}
		int[][] arr=new int[s1.length()][s2.length()];
		int count=0;
		int column=0;
		String res="";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					count=count+1;
					arr[i][j]=count;
					if(j>=column)
					{
						res=res+s1.charAt(i);
						column=j;
					}
					break;
				}
				else
				{
					arr[i][j]=0;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first string :");
		String str1=s.next();
		System.out.println("Enetr second string :");
		String str2=s.next();
		String res=commonSubsequence(str1,str2);
		System.out.println("Longest common subsequence is :");
		System.out.println(res);
	}

}
