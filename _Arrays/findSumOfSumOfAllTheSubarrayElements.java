package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class findSumOfSumOfAllTheSubarrayElements {
	
	public static int findSum(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		int n=arr.length;
		int res=0;
		int finalRes=0;
		for(int i=0;i<arr.length;i++)
		{
			res=n+res-i;
			finalRes+=res*arr[i];
			n--;
		}
		return finalRes;
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
