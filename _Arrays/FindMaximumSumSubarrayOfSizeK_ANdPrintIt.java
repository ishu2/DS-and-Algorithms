package GeeksForGeeks_Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindMaximumSumSubarrayOfSizeK_ANdPrintIt {
	
	public static void printMaximumSubarrayWithLargestSum(int[] arr,int k)
	{
		if(arr.length<k)
		{
			System.out.println("No such subarray of required size with largest sum exist !!!");
			return;
		}
		int i=0;
		int l=k;
		int sum=0;
		int max=0;
		int startIndex=0;
		while(l>0)
		{
			sum=sum+arr[i];
			i++;
			l--;
		}
		max=Math.max(sum, max);
		while(i<arr.length)
		{
			sum=sum+arr[i]-arr[i-k];
			if(sum>max)
			{
				max=sum;
				startIndex=i-k+1;
			}
			i++;
		}
		System.out.println("Maximum sum of required size subarray is "+max);
		while(k>0)
		{
			System.out.print(arr[startIndex]+" ");
			startIndex++;
			k--;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
		{
	      arr[i]=s.nextInt();
		}
		System.out.println("Enter size of subarray :");
		int k=s.nextInt();
		printMaximumSubarrayWithLargestSum(arr,k);
	}

}
