// KADANE'S ALGORITHM

package HackerRank_Questions;

public class SubarrayWithLargestSum {
	
	public static int maxSubarraySum(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		if(arr.length==1)
		{
			return arr[0];
		}
		int sum=arr[0];
		int end=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(sum>=end)
			{
				end=sum;
			}
			if(sum<=0)
			{
				sum=0;
			}
		}
		return end;
	}
	
	public static int maxSubarraySumUsingDP(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		if(arr.length==1)
		{
			return arr[0];
		}
		int res=arr[0];
		int finalRes=arr[0];
		int i=0;
		while(i<arr.length)
		{
			res=Math.max(arr[i], res+arr[i]);
			finalRes=Math.max(res, finalRes);
			i++;
		}
		return finalRes;
	}
	
	public static void main(String[] args) {
		int[] arr={-20,-3,-10,-50,-40,-9};
		int res=maxSubarraySumUsingDP(arr);
		System.out.println(res);
	}

}
