/*
 * A permutation where each element indicates either number of elements before or after it
   Given an array of n elements. The task is to check whether a permutation of given array exists, 
   such that each element indicate number of element present before or after it. Print “Yes” if exists,
    else print “No”.

   Examples:
     Input : arr[] = {1, 3, 3, 2}
     Output : Yes
      {3, 1, 2, 3} is a permutation in which each element 
      indicate number of element present before or after it.
      There is one more permutation {3, 2, 1, 3}

     Input : arr[] = {4, 1, 2, 3, 0}
     Output : Yes
       There are two permutations {0, 1, 2, 3, 4} or
       {4, 3, 2, 1, 0}
 */

package GeeksForGeeks_Arrays;

import java.util.HashMap;

public class PermutationWhereEachEltIndicateEitherNumberOfEltBeforeItOrAfterIt {

	public static void main(String[] args) {
		int[] arr={3,1,2,7};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(map.containsKey(i))
			{
				int val=map.get(i);
				if(val==1)
				{
					map.remove(i);
				}
				else
				{
					map.put(i, val-1);
				}
			}
			else if(map.containsKey(arr.length-i-1))
			{
				int val=map.get(arr.length-i-1);
				if(val==1)
				{
					map.remove(arr.length-i-1);
				}
				else
				{
					map.put(arr.length-i-1, val-1);
				}
			}
			else
			{
				System.out.println("No");
				break;
			}
		}
		if(i==arr.length)
		{
			System.out.println("Yes");
		}
	}
	
}
