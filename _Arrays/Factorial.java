package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class Factorial {
	
	public static int findFactorial(int n,int[] arr)
	{
		if(n==1)
		{
			arr[n-1]=1;
			return arr[n-1];
		}
		if(arr[n-1]!=-1)
		{
			return arr[n-1];
		}
		arr[n-1]=n*findFactorial(n-1,arr);
		return arr[n-1];
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=-1;
		}
		int res=findFactorial(n,arr);
		System.out.println("Factorial of "+n+" is: "+res);
	}

}
