package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FinfPartitionPointInArray_EltsToTheLeftOfPointAreSmallerAndEltsToTheRightOfPointAreGreater {
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		System.out.println("Enter array elements :");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int res=findPartitionPoint(arr);
		if(res==-1)
		{
			System.out.println("No partition point exists in this array !!");
		}
		else
		{
			System.out.println("Partition point = "+res);
		}
	}

}
