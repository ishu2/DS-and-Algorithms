/*    Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
      
      Examples:

          Input :  arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}     k = 3
          Output :  3 3 4 5 5 5 6

          Input :  arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}       k = 4
          Output :  10 10 10 15 15 90 90

 */

package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class MaxmumOfAllSubarraysOfSizeK {

	public static int[] maxOfAllSubarrays(int[] arr,int k)
	{
		if(k==0 || arr.length==0)
		{
			int[] res=null;
			return res;
		}
		int[] res=new int[arr.length-k+1];
		int max=0;
		int i=0;
		int index=0;
		for(i=0;i<k;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		res[index]=max;
		index++;
		while(i<arr.length)
		{
			if(arr[i]>max)
			{
				res[index]=arr[i];
				max=arr[i];
			}
			else
			{
				res[index]=max;
			}
			i++;
			index++;
		}
		return res;
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
		System.out.println("Enter k :");
		int k=s.nextInt();
		int[] res=maxOfAllSubarrays(arr,k);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	 
}
