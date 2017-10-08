package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class SmallestSubarrayWithSumGreaterThanGivenValue {
	
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
		System.out.println("Enter value :");
		int val=s.nextInt();
		
	}

}
