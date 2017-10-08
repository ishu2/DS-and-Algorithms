package HackerRank_Questions;

import java.util.HashMap;

public class LengthOfLongestConsecutiveElements {

	public static int findLength(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
		{
			return arr.length;
		}
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int res=1;
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
		int val=1;
		int j=1;
		for(int i=0;i<arr.length;i++)
		{
			j=1;
			if(!(map.containsKey(arr[i]-1)))
			{
					while(map.containsKey(arr[i]+j))
					{
				      res++;
				      j++;
				    }
			}	
			 val=Math.max(val, res);
			 res=1;
		}
		return val;
	}
	
	public static void main(String[] args) {
		int[] arr={12,9,6,5,21,8,7,20,18,10,11};
		int res=findLength(arr);
		System.out.println(res);
	}

}
