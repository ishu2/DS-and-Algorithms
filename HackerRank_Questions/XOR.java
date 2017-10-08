/*    Q-  'a' and 'x' are two long integers.

 *         Conditions to be satisfied:-
 *         1.       a^x > x    ( '^' is XOR operator.)  
 *         2.       0 < a < x
 *         First line contains 'q' (the number of queries)
 *         
 *         Input:-    2  (no. of queries)
 *                    2  (value of 'x')
 *                    10 (value of 'x')
 *            
 *         Output:-   1  (no. of values of 'a' which satisfy the given condition for x=2)
 *                    5  (no. of values of 'a' which satisfy the given condition for x=10)
 * 
 * */




package HackerRank_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class XOR {
	
	public static int binaryToDecimal(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		int res=0;
		int k=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			res+=arr[i]*Math.pow(2,k);
			k--;
		}
		return res;
	}
	
	public static int[] decimalToBinary(int num)
	{
		if(num==0)
		{
			int[] a=new int[0];
			return a;
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(num!=0)
		{
			list.add(num%2);
			num=num/2;
		}
		int size=list.size();
		int[] res=new int[size];
		int k=0;
		for(Integer i:list)
		{
			res[k]=i;
			k++;
		}
		reverseArray(res);
		return res;
	}
	
	public static void reverseArray(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
		{
			return;
		}
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static int XOR(int[] a1,int[] a2)
	{
		if(a1.length==0 && a2.length==0)
		{
			return 0;
		}
		int res=0;
		if(a1.length==0)
		{
			res=binaryToDecimal(a2);
			return res;
		}
		if(a2.length==0)
		{
			res=binaryToDecimal(a1);
			return res;
		}
		int size=(a1.length>a2.length?a1.length:a2.length);
		int[] arr=new int[size];
		int i=a1.length-1;
		int j=a2.length-1;
		int k=size-1;
		while(i>=0 && j>=0)
		{
			if(a1[i]!=a2[j])
			{
				arr[k]=1;
			}
			else
			{
				arr[k]=0;
			}
			k--;
			i--;
			j--;
		}
		if(i>=0)
		{
			while(i>=0)
			{
				arr[k]=a1[i];
				k--;
				i--;
			}
		}
		if(j>=0)
		{
			while(j>=0)
			{
				arr[k]=a2[j];
				k--;
				j--;
			}
		}
		res=binaryToDecimal(arr);
		return res;
	}
	
	public static int numberOfA(int x)
	{
		if(x==0 || x==1)
		{
			return 0;
		}
		int count=0;
		int i=1;
		int[] a2=decimalToBinary(x);
		while(i<x)
		{
			int[] a1=decimalToBinary(i);
			int z=XOR(a1,a2);
			if(z>x)
			{
				count++;
			}
			i++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int q=s.nextInt();
		int i=0;
		while(i<q)
		{
			int x=s.nextInt();
			int res=numberOfA(x);
			System.out.println(res);
			i++;
		}
	}

}
