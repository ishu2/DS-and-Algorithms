package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class SearchElementInASortedAndRotatedArray {
	
	public static int search(int[] arr,int elt)
	{
		if(arr.length==0)
		{
			return -1;
		}
		if(arr.length==1)
		{
			if(arr[0]==elt)
			{
				return 0;
			}
			else
			{
				return -1;
			}
		}
		int pivot=rotatedIndex(arr,0,arr.length-1);
		int res=-1;
		if(pivot==-1)
		{
			res=binarySearch(arr,elt,0,arr.length-1);	
		}
		else
		{
			if(elt<arr[pivot] && elt>=arr[0])
			{
			  res=binarySearch(arr,elt,0,pivot-1);
			}
			else if(elt<=arr[pivot] && elt<arr[0])
			{
				res=binarySearch(arr,elt,pivot,arr.length-1);
			}
			else
			{
				res=-1;
				return res;
			}
		}
		
		return res;
	}
	
	public static int binarySearch(int[] arr,int elt,int low,int high)
	{
		if(high<=low)
		{
			return -1;
		}
		if(high-low==1)
		{
			if(arr[high]==elt)
			{
				return high;
			}
			else if(arr[low]==elt)
			{
				return low;
			}
			else
			{
				return -1;
			}
		}
		int mid=(low+high)/2;
		if(elt==arr[mid])
		{
			return mid;
		}
		else if(elt<arr[mid])
		{
			return binarySearch(arr,elt,low,mid-1);
		}
		else
		{
			return binarySearch(arr,elt,mid,high);
		}
	}
	
	public static int rotatedIndex(int[] arr,int low,int high)
	{
		if(high<=low)
		{
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]>arr[mid+1])
		{
			return mid;
		}
		else if(arr[mid-1]>arr[mid])
		{
			return mid-1;
		}
		else if(arr[mid]<arr[low])
		{
			return rotatedIndex(arr,low,mid-1);
		}
		else
		{
			return rotatedIndex(arr,mid+1,high);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of the rotated array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter elemnt you want to search .");
		int elt=s.nextInt();
		int res=search(arr,elt);
		if(res==-1)
		{
			System.out.println("NOT FOUND ...");	
		}
		else
		{
			System.out.println(elt+" is found at "+res+"th index.");
		}
	}

}
