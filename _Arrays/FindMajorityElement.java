// Majority element is the element that appears more than n/2 times in array.

package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FindMajorityElement {
	
	public static int findCandidateElement(int[] arr)
	{
		int count=1;
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[index]==arr[i])
			{
				count++;
			}
			else
			{
				count--;
			}
			if(count==0)
			{
				index=i;
				count=1;
			}
		}
		return arr[index];
	}
	
	public static int majorityElement(int[] arr)
	{
		if(arr.length<2)
		{
			return -1;
		}
		int elt=findCandidateElement(arr);
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==elt)
			{
				count++;
			}
			if(count>arr.length/2)
			{
				return elt;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int res=majorityElement(arr);
		if(res!=-1)
		{
		    System.out.println("Majority element = "+res);
		}
		else
		{
			System.out.println("Majority element doesn't exist.");
		}
	}

}
