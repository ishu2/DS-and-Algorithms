package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class PrintSubsetsUsingIteration {
	
	public static void printSubsets(int[] arr)
	{
		if(arr.length==0)
		{
			System.out.println("Only empty subset exists .. ");
			return ;
		}
		int c=0;
		int size=(int) Math.pow(2, arr.length);
		System.out.println("Subsets of given array are :");
		for(int i=0;i<size;i++)
		{
			System.out.print("{ ");
			for(int k=0;k<arr.length;k++)
			{
				int t=i&(1<<k);
				if(t!=0)
				{
					System.out.print(arr[k]+" ");
				}
			}
			System.out.println("}");
		}
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
		printSubsets(arr);
	}

}
