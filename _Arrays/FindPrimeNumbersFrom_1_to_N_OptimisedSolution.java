package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FindPrimeNumbersFrom_1_to_N_OptimisedSolution {
	
	public static void findPrimeNumbers(boolean[] arr,int n)
	{
		int p=2;
		for(p=2;p*p<n;p++)
		{
			int i=2;
			for(i=2;p*i<n;i++)
			{
				if(arr[p*i])
				{
					arr[p*i]=false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter N :-");
		int n=s.nextInt();
		boolean[] arr=new boolean[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=true;
		}
		arr[0]=false;
		arr[1]=false;
		findPrimeNumbers(arr,n);
		System.out.println("Prime numbers from 1 - "+n+" are :");
		for(int i=0;i<n;i++)
		{
			if(arr[i])
			{
				System.out.println(i);
			}
		}
	}

}
