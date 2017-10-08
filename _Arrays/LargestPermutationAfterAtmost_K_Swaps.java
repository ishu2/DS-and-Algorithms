/*  Given a permutation of first n natural numbers as array and an integer k. 
 *  Print the lexicographically largest permutation after at most k swaps
 * 
 *  INPUT : arr=[4,5,2,1,3];
 *          k=3
 *          
 *  OUTPUT : [5,4,3,2,1];
 */

package GeeksForGeeks_Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LargestPermutationAfterAtmost_K_Swaps {
	
	public static void lexicographicallyLargestPermutation(int[] arr,int k,HashMap<Integer,Integer> map)
	{
		if(k==0)
		{
			return;
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int i=0;
		while(i<arr.length && k>0)
		{
			if(arr[i]!=max-i)
			{
				int index=map.get(max-i);
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				map.put(max-i, i);
				map.put(temp, index);
				k--;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elememts :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the maximum no. of swaps that can be performed :");
		int k=s.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], i);
		}
		lexicographicallyLargestPermutation(arr,k,map);
		System.out.println("Lexicographical largest permutation is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
