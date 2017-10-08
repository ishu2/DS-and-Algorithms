package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class MaximizeDifferenceBetween2ElementsSuchThatLargerElementAppearAfterSmallerElement {
	
	public static int maximizeDifference(int[] arr)
	{
		if(arr.length<2)
		{
			return 0;
		}
		int minElt=arr[0];
		int diff=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>minElt && arr[i]-minElt>diff)
			{
				diff=arr[i]-minElt;
			}
			if(arr[i]<minElt)
			{
				minElt=arr[i];
			}
		}
		return diff;
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
		int res=maximizeDifference(arr);
		System.out.println(res);
	}

}
