package GeeksForGeeks_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSmallestSubarrayWithSumGreaterThanGivenValue {

	public static ArrayList<Integer> findSubarray(int[] arr,int sum)
	{
		if(arr[0]>sum)
		{
		    ArrayList<Integer> result=new ArrayList<>();
		    result.add(arr[0]);
		    return result;
		}
		int start=0;
		int end=0;
		int res=0;
		int resStart=0;
		int resEnd=arr.length+1;
		while(end<arr.length)
		{
		    res+=arr[end];
		    if(res>sum)
		    {
		        while(res>sum)
		        {
		            res-=arr[start];
		            start++;
		        }
		        if(start!=0)
		        {
		          start-=1;
		          res+=arr[start];
		        }
		        if(end-start<resEnd-resStart)
		        {
		            resStart=start;
		            resEnd=end;
		        }
		    }
		    end++;
		}
		ArrayList<Integer> result=new ArrayList<>();
		while(resStart<=resEnd)
		{
		    result.add(arr[resStart]);
		    resStart++;
		}
		return result;

	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter sum :");
		int sum=s.nextInt();
		ArrayList<Integer> res=findSubarray(arr,sum);
        for(Integer i:res)
        	System.out.println(i);
	}
	
}
