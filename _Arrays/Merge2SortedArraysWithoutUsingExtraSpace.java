/*  Merge two sorted arrays with O(1) extra space
    
    We are given two sorted array. We need to merge these two arrays such that the initial numbers
    (after complete sorting) are in the first array and the remaining numbers are in the second array.
    Extra space allowed in O(1).

    Example:
             Input: ar1[] = {10};
                    ar2[] = {2, 3};

             Output: ar1[] = {2}
                     ar2[] = {3, 10}  

             Input: ar1[] = {1, 5, 9, 10, 15, 20};
                    ar2[] = {2, 3, 8, 13};

             Output: ar1[] = {1, 2, 3, 5, 8, 9}
                     ar2[] = {10, 13, 15, 20} 
 
 * */


package GeeksForGeeks_Arrays;

public class Merge2SortedArraysWithoutUsingExtraSpace {

	public static void merge(int[] a1,int[] a2)
	{
		if(a1.length==0 || a2.length==0)
		{
			return ;
		}
		int i=a1.length-1;
		int j=a2.length-1;
		while(j>=0)
		{
			if(a1[i]>a2[j])
			{
				int temp=a2[j];
				a2[j]=a1[i];
				i--;
				while(temp<a1[i] && i>=0)
				{
					a1[i+1]=a1[i];
					i--;
				}
				a1[i+1]=temp;
			}
			j--;
			i=a1.length-1;
		}
	}
	
	public static void main(String[] args) {
		int[] arr1={1,5,9,10,15,20};
		int[] arr2={2,3,8,13};
		merge(arr1,arr2);
		System.out.println("1st array :");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println();
		System.out.println("2nd array is :");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
	
}
