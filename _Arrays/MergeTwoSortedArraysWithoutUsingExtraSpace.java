// first array has extra space to accomodate elements of second array also.

package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class MergeTwoSortedArraysWithoutUsingExtraSpace {
	
	public static void mergeArrays(int[] a1,int[] a2,int s1)
	{
		if(a2.length==0)
		{
			return;
		}
		int j=a1.length-1;
		int i=s1-1;
		while(i>=0)
		{
			a1[j]=a1[i];
			i--;
			j--;
		}
		i=0;
		j=j+1;
		int k=0;
		while(j<a1.length && i<a2.length)
		{
			if(a2[i]<a1[j])
			{
				a1[k]=a2[i];
				i++;
				k++;
			}
			else
			{
				a1[k]=a1[j];
				j++;
				k++;
			}
		}
		while(i<a2.length)
		{
			a1[k]=a2[i];
			i++;
			k++;
		}
		while(j<a1.length)
		{
			a1[k]=a1[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of first array :");
		int s1=s.nextInt();
		System.out.println("Enter size of second array :");
		int s2=s.nextInt();
		int[] arr1=new int[s1+s2];
		int[] arr2=new int[s2];
		System.out.println("Enter elements of 1st array in sorted array :");
		for(int i=0;i<s1;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter elements of second array in sorted order :");
		for(int i=0;i<s2;i++)
		{
			arr2[i]=s.nextInt();
		}
		System.out.println("Required merged array is :");
		mergeArrays(arr1,arr2,s1);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
