package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FindPrimeNumbersFrom_1_to_N {
	
	public static boolean isPrime(int i)
	{
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N :");
		int n=s.nextInt();
		System.out.println("Prime numbers from 1 to "+n+" are :");
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	
}
