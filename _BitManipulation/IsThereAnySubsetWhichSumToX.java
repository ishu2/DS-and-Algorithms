package GeeksForGeeks_BitManipulation;

import java.util.Arrays;

public class IsThereAnySubsetWhichSumToX {
	
	public static boolean subsetSum(int[] arr,int sum)
	{
		if(arr.length==0)
		{
			return false;
		}
		if(sum<=0 && arr[0]>0)
		{
			return false;
		}
		for(int i=arr.length-1;i>0;i--)
		{
			sum=sum-arr[i];
			if(sum<0)
			{
				return false;
			}
			else if(sum==0)
			{
				return true;
			}
			else
				i++;
		}
		if(sum==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		int[] arr={4,2,3};
		int sum=5;
		Arrays.sort(arr);
		boolean res=subsetSum(arr,sum);
		System.out.println(res);
	}

}
