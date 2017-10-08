/*
     Q- Given an array of size N (which contains 0 at all the positions initially) , M times the array
        will be modified i.e. add K from index A to index B elements .Now , print the maximum value found 
        in the resultant array.
        
         For eg- N=5 , M=3
         A=1 , B=2 , K=100    --> arr={100,100,0,0,0}
         A=2 , B=5 , K=100    --> arr={100,200,100,100,100}
         A=3 , B=4 , K=100    --> arr={100,200,200,200,100}
         
         Here, the maximum value found in the resultant array is 200.
         Therefore , print 200.
 */

package HackerRank_Questions;

import java.util.HashMap;
import java.util.Scanner;

public class AlgorithmicCrush {
	
	// Brute Force Method
	
	public static void fillMap(int a,int b,int k,HashMap<Integer,Integer> map)
	{
		for(int i=a;i<=b;i++)
		{
			map.put(i, map.get(i)+k);
		}
	}
	
	// Optimised Solution
	
	public static void algorithmicCrush(int[] arr,int a,int b,int k)
	{
		if(k==0 || arr.length==0)
		{
			return;
		}
		arr[a-1]+=k;
		if(b<=arr.length-1)
		{
			arr[b]-=k;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();   // size of array
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=0;                       // Initially array is initialised with 0;
		}
		int M=s.nextInt();                  // number of times array will be modified
		while(M>0)
		{
			int a=s.nextInt();              // starting index for adding k
			int b=s.nextInt();              //ending index upto which k will be added
			int k=s.nextInt();              // number to be added to array elements
		    if(a<=N)
		    {
			algorithmicCrush(arr,a,b,k);
		    }
			M--;
		}
		int res=arr[0];                    // maximum value found after modifying array
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=arr[i]+arr[i-1];
			if(arr[i]>res)
			{
				res=arr[i];
			}
		}
		System.out.println(res);
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
