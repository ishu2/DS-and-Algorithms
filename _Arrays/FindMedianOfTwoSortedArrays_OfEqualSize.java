package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class FindMedianOfTwoSortedArrays_OfEqualSize {
	
	public static int median(int[] arr)
	{
	  if(arr.length==0)
	  {
	    return 0;
	  }
	  if(arr.length%2==0)
	  {
	    int mid=arr.length/2;
	    int mid2=mid-1;
	    return (arr[mid]+arr[mid2])/2;
	  }
	  else
	  {
	    return arr[arr.length/2];
	  }
	}

	public static int findMedian(int[] a1,int[] a2)
	{

	  if(a1.length==0 && a2.length==0)
      {
	    return 0;
	  }
	  if(a1.length==1 && a2.length==1)
	  {
	    return (a1[0]+a2[0])/2;
	  }
	  if(a1.length==2 && a2.length==2)
	  {
    	return (Math.max(a1[0],a2[0]) + Math.min(a1[1],a2[1]))/2;
	  }
	  int m1=median(a1);
	  int m2=median(a2);
	  if(m1==m2)
	  {
		  return m1;
	  }
	  if(m1<m2)
	  {
	    int[] newA1=new int[a1.length/2+1];
	    int[] newA2=new int[a2.length/2+1];
	    int k=0;
	    if(a1.length%2==0)
	    for(int i=a1.length/2-1;i<a1.length;i++)
	    {
	      newA1[k]=a1[i];
	      k++;
	    }
	    else
	    for(int i=a1.length/2;i<a1.length;i++)
		{
		    newA1[k]=a1[i];
		    k++;
		 }	
	    k=0;
	    for(int i=0;i<=a2.length/2;i++)
	    {
	      newA2[k]=a2[i];
	      k++;
	    }
	    return findMedian(newA1,newA2);
	  }
	  else
	  {
	    int[] newA1=new int[a1.length/2+1];
	    int[] newA2=new int[a2.length/2+1];
	    int k=0;
	    for(int i=0;i<=a1.length/2;i++)
	    {
	      newA1[k]=a1[i];
	      k++;
	    }
	    k=0;
	    if(a2.length%2==0)
	    for(int i=a2.length/2-1;i<a2.length;i++)
	    {
	      newA2[k]=a2[i];
	      k++;
	    }
	    else
	    for(int i=a2.length/2;i<a2.length;i++)
        {
	       newA2[k]=a2[i];
	       k++;
	     }	
	    return findMedian(newA1,newA2);
	  }
	} 

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of 1st array :");
		int size1=s.nextInt();
		System.out.println("Enter size of 2nd array :");
		int size2=s.nextInt();
		int[] a1=new int[size1];
		int[] a2=new int[size2];
		System.out.println("Enetr elements of 1st array :");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=s.nextInt();
		}
		System.out.println("Enter elements of 2nd array :");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=s.nextInt();
		}
		int res=findMedian(a1,a2);
		System.out.println("Median of theses arrays is : "+res);
	}
	
}
