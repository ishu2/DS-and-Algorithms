package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FindFixedPointInArray {
	
	public static int findFixedPoint(int[] arr,int low,int high)
	{
		if(high<low)
		{
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]==mid)
		{
			return mid;
		}
		else if (arr[mid]<mid)
		{
			return findFixedPoint(arr,mid+1,high);
		}
		else
		{
			return findFixedPoint(arr,low,mid-1);
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
		int res=findFixedPoint(arr,0,n-1);
		if(res==-1)
		{
			System.out.println("No fixed point exists !!!");
		}
		else
		{
			System.out.println("Fixed point = "+res);
		}
	}

}
