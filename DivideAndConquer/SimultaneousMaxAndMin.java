package DivideAndConquer;

import java.util.Scanner;

public class SimultaneousMaxAndMin {
	
	public static Values simultaneousMaxMinByCreatingSeparateLeftRightArray(int[] arr)
	{
		if(arr.length==0)
		{
		    Values v=new Values();
		    v.max=0;
		    v.min=0;
		}
		if(arr.length==1)
		{
			Values v=new Values();
			v.max=arr[0];
			v.min=arr[0];
			return v;
		}
		if(arr.length==2)
		{
			Values v=new Values();
			if(arr[0]>=arr[1])
			{
				v.max=arr[0];
				v.min=arr[1];
			}
			else
			{
				v.max=arr[1];
				v.min=arr[0];
			}
			return v;
		}
		int mid=arr.length/2;
		int[] left=new int[mid];
		int[] right=new int[arr.length-mid];
		for(int i=0;i<mid;i++)
		{
			left[i]=arr[i];
		}
		for(int i=0;i<arr.length-mid;i++)
		{
			right[i]=arr[mid+i];
		}
		Values res1=simultaneousMaxMinByCreatingSeparateLeftRightArray(left);
		Values res2=simultaneousMaxMinByCreatingSeparateLeftRightArray(right);
		Values res=new Values();;
		if(res1.max>res2.max)
		{
			res.max=res1.max;
			if(res1.min>res2.max)
			{
				res.min=res2.min;
			}
			else if(res1.min<res2.min)
			{
			    res.min=res1.min;
			}
		}
		else
		{
			res.max=res2.max;
			if(res2.min>res1.min)
			{
				res.min=res1.min;
			}
			else if(res2.min<res1.min)
			{
				res.min=res2.min;
			}
		}
		return res;
	}
	
	public static Values simultaneousMaxMinUsingIndexes(int[] arr,int start,int end)
	{
		if(start==end)
		{
			Values v=new Values();
			v.max=arr[start];
			v.min=arr[end];
			return v;
		}
		if(start==end-1)
		{
			Values v=new Values();
			if(arr[start]>arr[end])
			{
				v.max=arr[start];
				v.min=arr[end];
			}
			else
			{
				v.max=arr[end];
				v.min=arr[start];
			}
		}
		Values res=new Values();
		int mid=(start+end)/2;
		Values res1=simultaneousMaxMinUsingIndexes(arr,start,mid);
		Values res2=simultaneousMaxMinUsingIndexes(arr,mid+1,end);
		if(res1.max>res2.max)
		{
			res.max=res1.max;
			if(res1.min>res2.max)
			{
				res.min=res2.min;
			}
			else if(res1.min<res2.min)
			{
			    res.min=res1.min;
			}
		}
		else
		{
			res.max=res2.max;
			if(res2.min>res1.min)
			{
				res.min=res1.min;
			}
			else if(res2.min<res1.min)
			{
				res.min=res2.min;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		Values res=simultaneousMaxMinUsingIndexes(arr,0,n-1);
		System.out.println("Maximum = "+res.max);
        System.out.println("Minimum = "+res.min);
	}

}
