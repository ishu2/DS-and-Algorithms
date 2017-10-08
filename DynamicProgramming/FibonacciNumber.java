package DynamicProgramming;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static int n_thFibonacciNumber(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		int[] arr=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println("Fibonacci series from 1 to "+n+" is");
		for(int i=0;i<=n;i++)
		{
			System.out.println(arr[i]);
		}
		return arr[n];
	}
	
	public static int fibonacciRecursively(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		return fibonacciRecursively(n-1)+fibonacciRecursively(n-2);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :-");
		int n=s.nextInt();
		int res=n_thFibonacciNumber(n);
		System.out.println(n+"th fabonacci no. is "+res);
		
	}

}
