// the subsequence should not contain any two adjacent elements.

package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class SubsequenceWithMaximumSum {

	public static int maximumSumSubsequence(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		if(arr.length==1)
		{
			return arr[0];
		}
		int inclusive=arr[0];
		int exclusive=0;
		int temp=0;
		for(int i=1;i<arr.length;i++)
		{
			temp=inclusive;
			inclusive=Math.max(arr[i], exclusive+arr[i]);
		    exclusive=inclusive;
		}
		return inclusive;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int res=maximumSumSubsequence(arr);
	    System.out.println(res);
	}
	
}
