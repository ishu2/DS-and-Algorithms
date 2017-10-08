package Print_Patterns;

import java.util.Scanner;

public class PrintPattern_CN_Hard {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=s.nextInt();
		printPattern(n);
	}
	
	public static void printPattern(int n)
	{
		int k=1;
		int t=0;
		if(n%2!=0)
		{
		for(int i=1;i<=(n/2)+1;i++)
		{
		    if(k==1)
		    {
		        t=k;
		        for(int j=0;j<n;j++)
		        {
		            System.out.print(k+" ");
		            k++;
		        }
		    }
		    else
		    {
		        k=t+2*n;
		        t=k;
		        for(int j=0;j<n;j++)
		        {
		            System.out.print(k+" ");
		            k++;
		        }
		    }
		    System.out.println();
		}
		k=Math.abs(t-n);
		}
		else
		{
			for(int i=1;i<=(n/2);i++)
			{
			    if(k==1)
			    {
			        t=k;
			        for(int j=0;j<n;j++)
			        {
			            System.out.print(k+" ");
			            k++;
			        }
			    }
			    else
			    {
			        k=t+2*n;
			        t=k;
			        for(int j=0;j<n;j++)
			        {
			            System.out.print(k+" ");
			            k++;
			        }
			    }
			    System.out.println();
			}
			k=Math.abs(t+n);	
		}
		for(int i=1;i<=n/2;i++)
		{
		    t=k;
		    for(int j=1;j<=n;j++)
		    {
		        System.out.print(k+" ");
		        k++;
		    }
		    k=t-2*n;
		    System.out.println();
		}
	}
	
}
