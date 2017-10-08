// Q-1 Find subarray with given sum(non negative numbers).

package GeeksForGeeks_Arrays;

public class Array_Question_1 {
	
	public static void subarrayWithRequiredSum(int[] arr,int sum)
	{
		if(arr.length==0)
		{
			return;
		}
		if(arr.length==1)
		{
			if(arr[0]==sum)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println("No subarray found..");
			}
			return;
		}
		int res=arr[0];
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
				while(res>sum && j<i-1)
				{
					res=res-arr[j];
					j++;
				}
				if(res==sum)
				{
					System.out.println("Sum found between index "+(j)+" and "+(i-1));
					return;
				}
				res=res+arr[i];
		}
		System.out.println("No subarray found");
	}
	
	public static void main(String[] args) {
		int[] arr={1,4};
		int sum=0;
		subarrayWithRequiredSum(arr,sum);
	}

}
