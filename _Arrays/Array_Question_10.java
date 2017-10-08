package GeeksForGeeks_Arrays;

import java.util.HashMap;
import java.util.Set;

public class Array_Question_10 {
	
	public static int findPairs(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
		{
			return 0;
		}
		int count=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], i);
		}
		int elt=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			elt=arr[i]*arr[j];
			if(map.containsKey(elt))
			{
				System.out.println(arr[i]+" "+arr[j]);
				count++;
			}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr={3,5,2,4,15,8};
		int count=findPairs(arr);
		System.out.println("no. of pairs whose product already exists in array are : "+count);
	}

}
