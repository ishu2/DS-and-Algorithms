package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class FindXOR_Of_TheXORsOFAllTheSubsets {
	
	public static int findXOR(int[] arr)
	{
		if(arr.length==1)
		{
			return arr[0];
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int res=findXOR(arr);
		System.out.println(res);
	}

}
