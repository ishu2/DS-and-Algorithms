package GeeksForGeeks_Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class ArrangeTheNumbersSuchThatTheyFormTheLargestNumber {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println(func(arr));
		
	}
	
	public static String func(int[] arr)
	{
		Arrays.sort(arr,new Comparator<Integer>()
		{
		  public int compare(int i,int j)
		  {
			  int a=i*10+j;
			  int b=j*10+i;
			  return Math.max(a, b);
		  }
		});
		
	}
	
}
