package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class CountFrequencyOfGivenElementInSortedArray_logN_Time {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array in sorted order");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter element whose frequency you want to find :");
		int elt=s.nextInt();
	    int lowerIndex=findLowerIndex(arr,0,arr.length-1,elt);
	    int higherIndex=findHigherIndex(arr,0,arr.length-1,elt);
	    int res=higherIndex-lowerIndex+1;
	    System.out.println("Frequency = "+res);
	}

}
