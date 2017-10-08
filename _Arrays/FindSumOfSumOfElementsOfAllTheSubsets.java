package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FindSumOfSumOfElementsOfAllTheSubsets {
	
	public static int findSum(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		if(arr.length==1)
		{
			return arr[0];
		}
		int t=(int) Math.pow(2, arr.length-1);
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res=res+arr[i];
		}
		return res*t;
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
	    int res=findSum(arr);
	    System.out.println(res);
	}

}
