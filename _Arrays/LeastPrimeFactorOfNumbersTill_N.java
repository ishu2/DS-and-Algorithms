package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class LeastPrimeFactorOfNumbersTill_N {
	
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
		System.out.println("Least prime factor of :");
		System.out.println("1 is 1");
		for(int i=2;i<n;i++)
		{
			System.out.print(i+" is ");
			if(arr[i])
			{
				System.out.println(i);
			}
			else
			{
				for(int k=2;k<i;k++)
				{
					if(i%k==0 && arr[k]==true)
					{
						System.out.println(k);
						break;
					}
				}
			}
		}
	}
}
