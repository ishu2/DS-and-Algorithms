package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeProblem {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int val=5;
		int[] arr={1,2,3,4};
		System.out.println(func(arr,val));
	}
	
	public static int func(int[] arr,int val)
	{
		int[] res=new int[val+1];
		Arrays.fill(res,0);
		res[0]=1;
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=arr[i];j<=val;j++)
		    {
		    	res[j]+=res[j-res[i]];
		    }
		   / result[i]=res;
		}
	    return res[val];
	}

}
