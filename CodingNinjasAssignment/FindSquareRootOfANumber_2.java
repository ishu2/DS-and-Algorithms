package CodingNinjasAssignment;

import java.util.Scanner;

public class FindSquareRootOfANumber_2 {
	
	public static double root(int n,int k)
	{
		if(n<=1)
			return n;
		double res=0;
		int start=0;
		int end=n;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(mid*mid==n)
				return mid;
			if(mid*mid<n)
			{
				res=mid;
				start=mid+1;
			}
			else if(mid*mid>n)
			{
				end=mid-1;
			}
		}
		double c=0.1;
		for(int i=0;i<k;i++)
		{
			while(res*res<=n)
				res+=c;
			res=res-c;
			c/=10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=s.nextInt();
		System.out.println("Enter decimal places :");
		int k=s.nextInt();
		double res=root(n,k);
		System.out.println(res);
	}

}
