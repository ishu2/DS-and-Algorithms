package GeeksForGeeks_Arrays;

public class PeakOfArray {
	
	public static int peak(int[] arr)
	{
		if(arr.length==0)
		{
			return -1;
		}
		if(arr.length==1)
		{
			return arr[0];
		}
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		int res=-1;
		while(start<=end)
		{
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
			{
				return arr[mid];
			}
			else if(arr[mid]<arr[mid-1])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			mid=(start+end)/2;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,3,1,3,5,7,6};
		int res=peak(arr);
		System.out.println("Peak of array is :"+res);
	}

}
