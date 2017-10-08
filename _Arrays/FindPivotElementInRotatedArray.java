package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FindPivotElementInRotatedArray {
	
	public static int rotatedIndex(int[] arr,int low,int high)
	{
		if(high<=low)
		{
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]>arr[mid+1])
		{
			return mid;
		}
		else if(arr[mid-1]>arr[mid])
		{
			return mid-1;
		}
		else if(arr[mid]<arr[low])
		{
			return rotatedIndex(arr,low,mid-1);
		}
		else
		{
			return rotatedIndex(arr,mid+1,high);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of the rotated array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int res=rotatedIndex(arr,0,n-1);
		if(res!=-1)
		{
		     System.out.println("Array is rotated from "+res+" index.");
		}
		else
		{
			System.out.println("Array is not rotated.");
		}
	}

}
