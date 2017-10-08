package Print_Patterns;

import java.util.Scanner;

public class FindPowerOfX {
	
	public static long power1(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return x;
		}
		long res=x*power1(x,n-1);
		return res;
	}
	
	public static long power2(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return x;
		}
		long res=power2(x,n/2);
		if(n%2==0)
		{
			return res*res;
		}
		else
		{
			return x*res*res;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter x:-");
		int x=s.nextInt();
		System.out.println("enter n :-");
		int n=s.nextInt();
		long res1=power2(x,n);
		System.out.println(" ** best solution ( O(logN) ) **");
		System.out.println(x+"^"+n+"="+res1);
		long res=power1(x,n);
		System.out.println("...................................");
		System.out.println(" ** ( O(N) ) solution **");
		System.out.println(x+"^"+n+"="+res);
		
	}

}
