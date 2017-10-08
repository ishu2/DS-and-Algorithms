// Find maximum number of consecutive 1's in array.

package GeeksForGeeks_Arrays;

public class MaximumConsecutive_1_inArray {
	
	public static int maximumNumberOfOne(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		int res=0;
		int i=0;
		int count=0;
		while(i<arr.length)
		{
		  if(arr[i]==1)
		  {
			  count++;
		  }
		  else
		  {
			  res=Math.max(count,res);
			  count=0;
		  }
		  i++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr={1,0,0,1,1,1,0,0,1,0,1,1,1,1,0,1};
		int res=maximumNumberOfOne(arr);
		System.out.println("result :"+res);
	}

}
