// A subset is called divisible if for every pair (x,y) in subset, either x divides y or y divides x. 

package GeeksForGeeks_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargestDivisibleSubsetInArray {
	
	public static void largestDivisibleSubset(int[] arr)
	{
		if(arr.length==0)
		{
			return;
		}
		if(arr.length==1)
		{
		  System.out.println(arr[0]);
		  return;
		}
		int[] count=new int[arr.length];
		int[] prevDivisor=new int[arr.length];
		int maxLength=0;
		int index=0;
        for(int i=0;i<arr.length;i++)
        {
        	count[i]=1;
        	prevDivisor[i]=-1;
        }
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<i;j++)
        	{
        		if(arr[i]%arr[j]==0)
        		{
        			if(count[i]<=count[j]+1)
        			{
        				count[i]=count[j]+1;
        				prevDivisor[i]=j;
        			}
        		}
        	}
        	if(maxLength<count[i])
        	{
        		maxLength=count[i];
        		index=i;
        	}
        }
        System.out.println("Largest size subarray is :");
        while(index>=0)
        {
        	System.out.println(arr[index]);
        	index=prevDivisor[index];
        }
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elememnts :");
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        largestDivisibleSubset(arr);
	}

}
