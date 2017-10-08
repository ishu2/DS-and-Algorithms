/*   Given an integer,break it into smaller numbers such that their summation is equal to N.
 *   Note : [1,2,1] and [1,1,2] are same, so print the particular sequence with increasing sequence.
 *   Order of different combinations doesn't matter.
 *   
 *   Input : 4
 *   Output : [1,1,1,1] , [1,1,2] , [1,3] , [2,2] , [4].
 * 
 * 
 * 
 * */

package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class BreakNumbers {
	
	public static void print(int[] arr,int val,int len,ArrayList<Integer> res)
	{
		if(val<0)
		{
			res.remove(res.size()-1);
			return;
		}
		if(len<=0)
			return;
		if(val==0)
		{
			for(Integer i:res)
				System.out.print(i+" ");
			res.remove(res.size()-1);
			System.out.println();
			return;
		}
		print(arr,val,len-1,res);
		res.add(arr[len-1]);
		print(arr,val-arr[len-1],len,res);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=i+1;
		ArrayList<Integer> res=new ArrayList<>();
		print(arr,n,arr.length,res);
	}

}
