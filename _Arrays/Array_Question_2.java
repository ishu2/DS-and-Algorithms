//  Q-2 Break an array into maximum no. of subarrays such that their averages are same.


package GeeksForGeeks_Arrays;

public class Array_Question_2 {

	public static void subarraysWithSameAverage(int[] arr)
	{
		if(arr.length==0)
		{
			return;
		}
		if(arr.length==1)
		{
			System.out.println(arr[0]);
			return;
		}
		int i=0;
		int j=0;
		int sum=0;
		int avg=0;
		for(int k=0;k<arr.length;k++)
		{
			avg=avg+arr[k];
		}
		avg=avg/arr.length;
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(sum/(i-j+1)==avg && sum%(i-j+1)==0)
			{
				System.out.print(j+" "+i);
				System.out.println();
				j=i+1;
				sum=0;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr={4,6,2,4,8,0,6,2};
		subarraysWithSameAverage(arr);
	}
	
}
