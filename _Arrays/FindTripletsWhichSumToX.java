package GeeksForGeeks_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindTripletsWhichSumToX {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter triplet sum");
		int sum=s.nextInt();
		Arrays.sort(arr);
		
	}
	
}
