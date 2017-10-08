package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FindMinimumLengthUnsortedSubarray_SortingWhichMakesTheCompleteArraySorted {
	
	public static void findStartingAndEndingIndexOfSubarrayToBeSorted(int[] arr)
	{
		 if(arr.length<2)
	           return;
	        if(arr.length==2)
	        {
	            if(arr[0]<=arr[1])
	            {
	            	System.out.println("NO need of sorting..");
	            	return;
	            }
	               System.out.println("Sort the whole array..");
	               return;  
	        }
	        int i=0;
	        while(i<arr.length-1 && arr[i]<=arr[i+1])
	            i++;
	        if(i==arr.length-1)
	        {
	        	System.out.println("No need of sorting..");
	        	return;
	        }
	        int j=arr.length-1;
	        while(j>i && arr[j]>=arr[j-1])
	            j--;
	        int min=findMin(arr,i,j);
	        int max=findMax(arr,i,j);
	        while(i>=0 && min<arr[i])
	            i--;
	        i++;
	        while(j<arr.length && max>arr[j])
	            j++;
	        j--;
	        int res= j-i+1;
	        System.out.println("Sort the array of size = "+res);
		System.out.println("Array needs to be sorted between");
		System.out.println("index "+i+" and "+j);
	}
	
	 public static int findMin(int[] arr,int i,int j)
	    {
	        int min=Integer.MAX_VALUE;
	        while(i<=j)
	        {
	            if(arr[i]<min)
	                min=arr[i];
	            i++;
	        }
	        return min;
	    }
	    
	    public static int findMax(int[] arr,int i,int j)
	    {
	        int max=Integer.MIN_VALUE;
	        while(i<=j)
	        {
	           if(arr[i]>max)
	               max=arr[i];
	            i++;
	        }
	        return max;
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
		findStartingAndEndingIndexOfSubarrayToBeSorted(arr);
	}
	
}
