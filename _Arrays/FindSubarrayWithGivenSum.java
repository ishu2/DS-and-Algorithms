package GeeksForGeeks_Arrays;

public class FindSubarrayWithGivenSum {

	public static void findSubarrayWithGivenSum(int[] arr,int sum)
	{
		int i=0;
		int j=0;
		int s=0;
		while(j<arr.length && s<=sum)
		{
			s=s+arr[j];
			j++;
		}
		if(s==sum)
		{
			System.out.println("Sum fount between indexes "+i+" and "+j);
			return;
		}
		while(s!=sum && i<j)
		{
			s=s-arr[i];
			i++;
		}
		if(s==sum)
		{
			j=j-1;
			System.out.println("Sum fount between indexes "+i+" and "+j);
			return;
		}
		System.out.println("No such subarray exists !!!!!");
	}
	
	public static void main(String[] args) {
		int[] arr={1, 4};
		int sum=0;
		findSubarrayWithGivenSum(arr,sum);
	}
	
}
