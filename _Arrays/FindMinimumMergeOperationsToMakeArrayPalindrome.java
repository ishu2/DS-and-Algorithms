/*  Given an array of positive integers. We need to make the given array a ‘Palindrome’. Only allowed 
 *  operation on array is merge. Merging two adjacent elements means replacing them with their sum. The task
 *  is to find minimum number of merge operations required to make given array a ‘Palindrome’.

    To make an array a palindromic we can simply apply merging operations n-1 times where n is the size of 
    array (Note a single element array is alway palindrome similar to single character string). In that case,
    size of array will be reduced to 1. But in this problem we are asked to do it in minimum number of
    operations.
 * 
 * Example:
 * 
            Input : arr[] = {15, 4, 15}
            Output : 0
                     Array is already a palindrome. So we
                     do not need any merge operation.

            Input : arr[] = {1, 4, 5, 1}
            Output : 1
                     We can make given array palindrome with
                     minimum one merging (merging 4 and 5 to make 9)

            Input : arr[] = {11, 14, 15, 99}
            Output : 3
                     We need to merge all elements to make a palindrome.

           Expected time complexity is O(n).
 * 
 * 
 */

package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FindMinimumMergeOperationsToMakeArrayPalindrome {
	
	public static int countMergeOperations(int[] arr)
	{
		if(arr.length<2)
		{
			return 0;
		}
		int i=0;
		int j=arr.length-1;
		int count=0;
		while(i<=j)
		{
			if(arr[i]==arr[j])
			{
				i++;
				j--;
			}
			else if(arr[i]<arr[j])
			{
				arr[i+1]=arr[i+1]+arr[i];
				i++;
				count++;
			}
			else if(arr[j]<arr[i])
			{
				arr[j-1]=arr[j-1]+arr[j];
				j--;
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int res=countMergeOperations(arr);
		System.out.println("Count = "+res);
	}

}
