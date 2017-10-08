package GeeksForGeeks_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubsetWherePairSumIsNotDivisibleByK {
	
	public static int longestSubsetSize(int[] arr,int K)
	{
		if(K==1)
		{
			return 0;
		}
		int res=0;
		int[] freq=new int[K];
		for(int i=0;i<arr.length;i++)
		{
			freq[arr[i]%K]++;
		}
		int i=0;
		while(arr[i]%K!=0 && i<arr.length)
		{
			i++;
		}
			if(i!=arr.length)
			{
				res+=1;
			}
		for(int j=1;j<=K/2;j++)
		{
			res=res+Math.max(freq[j],freq[K-j]);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array :-");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements :-");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter K :-");
		int K=s.nextInt();
		System.out.println("Longest subset where pair sum is not divisible by K is :");
		int res=longestSubsetSize(arr,K);
		if(res==0)
		{
			System.out.println("No such subset exists !!");
		}
		else
		{
		   System.out.println("Maximum subset size is : "+res);
		}
	}
	
}
