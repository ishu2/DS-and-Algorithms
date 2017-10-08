package DynamicProgramming;

import java.util.Scanner;

public class FactorialOfANumber {
	
	public static int factorial(int n)
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
			arr[i]=i*arr[i-1];
		}
		return arr[n];
	}
	
	public static int factorialRecursively(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*factorialRecursively(n-1);
	}
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number :");
	int n=s.nextInt();
	int res=factorialRecursively(n);
	System.out.println("Factorial of "+n+" is : "+res);
	}

}
