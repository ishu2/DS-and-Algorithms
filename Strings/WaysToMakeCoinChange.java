package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class WaysToMakeCoinChange {
	
	public static int func(int[] arr,int val,int len)
	{
		if(len==0)
			return 0;
		if(val==0)
			return 1;
		if(val<0)
			return 0;
		if(val>=1 && len<=0)
			return 0;
		return func(arr,val-arr[len-1],len)+func(arr,val,len-1);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr={1,2,3};
		int val=4;
		ArrayList<Integer> res=new ArrayList<>();
		int result=func(arr,val,arr.length);
		System.out.println("Result = "+result);
	}

}
