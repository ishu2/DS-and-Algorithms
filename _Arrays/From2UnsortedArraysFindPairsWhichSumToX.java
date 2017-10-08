package GeeksForGeeks_Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class From2UnsortedArraysFindPairsWhichSumToX {

	public static void pairSum(int[] arr1,int[] arr2,int sum)
	{
		if(arr1.length==0 || arr2.length==0)
		{
			System.out.println("No such pair exists !!!");
			return ;
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
			if(map.containsKey(arr1[i]))
			{
			map.put(arr1[i],map.get(arr1[i]+1));
			}
			else
			{
				map.put(arr1[i], 1);
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(map.containsKey(sum-arr2[i]))
			{
				int res=sum-arr2[i];
				
				if(map.get(sum-arr2[i])!=1)
				{
					while(res>0)
					{
					System.out.println(arr2[i]+" , "+res);
					res--;
					}
				}
				else
				{
					System.out.println(arr2[i]+" , "+res);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of 1st array :");
		int n=s.nextInt();
		int[] arr1=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter size of 2nd array :");
		n=s.nextInt();
		int[] arr2=new int[n];
		System.out.println("enter array elements :");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=s.nextInt();
		}
		System.out.println("Enter required sum :");
		int sum=s.nextInt();
		pairSum(arr1,arr2,sum);
	}
	
}
