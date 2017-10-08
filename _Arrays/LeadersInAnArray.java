// Leaders in an array are those elements which are larger than all the elements on their right. 

package GeeksForGeeks_Arrays;

import java.util.Scanner;
import java.util.Stack;

public class LeadersInAnArray {
	
	public static void printLeaders(int[] arr)
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
		int max=arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
				System.out.println(max);
			}
		}
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
		printLeaders(arr);
	}

}
