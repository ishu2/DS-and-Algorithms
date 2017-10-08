package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class MaximumProfitByBuyingAndSellingAShareAtmostTwice {
	
	
// Time complexity of this method=O(N) , Space complexity=O(2N)  (It uses 2 auxiliary arrays)	
	public static int maxProfit(int[] arr)
	{
		if(arr.length<2)
		{
			return 0;
		}
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		left[0]=0;
		right[arr.length-1]=0;
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			left[i]=Math.max(left[i-1], arr[i]-min);
			min=Math.min(min, arr[i]);
		}
		int max=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1], max-arr[i]);
			max=Math.max(max, arr[i]);
		}
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res=Math.max(res, left[i]+right[i]);
		}
		return res;
	}
	
// Time complexity of this method=O(N) , Space complexity=O(2N)  (It uses 1 auxiliary array)
	
	public static int maxProfitSpaceOptimised(int[] arr)
	{
		if(arr.length<2)
		{
			return 0;
		}
		int res=0;
		int[] left=new int[arr.length];
		left[0]=0;
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			left[i]=Math.max(left[i-1], arr[i]-min);
			min=Math.min(min, arr[i]);
		}
		int max=arr[arr.length-1];
		res=left[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			left[i]=Math.max(left[i+1], max-arr[i]+left[i]);
			max=Math.max(arr[i], max);
			res=Math.max(left[i], res);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int res=maxProfit(arr);
		System.out.println("Maximum profit = "+res);
	}

}
