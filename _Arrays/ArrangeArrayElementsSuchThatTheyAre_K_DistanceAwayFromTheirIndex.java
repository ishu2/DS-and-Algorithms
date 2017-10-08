package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class ArrangeArrayElementsSuchThatTheyAre_K_DistanceAwayFromTheirIndex {
	
	public static void modifyArray(int[] arr,int start,int end,int t)
	{
		if(start>=arr.length)
		{
			return;
		}
		if(end>=arr.length)
		{
			swap(arr,start,arr.length-1,t);
			return;
		}
		swap(arr,start,end,t);
		modifyArray(arr,end+1,end+t,t);
	}
	
	public static void swap(int[] arr,int start,int end,int t)
	{
		if(start==end)
		{
			return;
		}
		int i=start;
		int j=((start+end)/2)+1;
		while(j<=end)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j++;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		System.out.println("Enter K :");
		int k=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i+1;
		}
		int t=(2*k);
		modifyArray(arr,0,t-1,t);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
