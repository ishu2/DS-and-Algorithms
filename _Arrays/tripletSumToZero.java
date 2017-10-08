package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class tripletSumToZero {
	
	public static boolean findTriplets(int arr[] , int n)
    {
      quickSort(arr,0,n-1);
      for(int i=0;i<n;i++)
      {
    	  System.out.println(arr[i]);
      }
      for(int i=0;i<n;i++)
      {
          int sum=(0-arr[i]);
          int start=i+1;
          int end=n-1;
          while(start<end)
          {
              if((arr[start]+arr[end])==sum)
              {
                  return true;
              }
              else if((arr[start]+arr[end])<sum)
              {
                  start++;
              }
              else
              {
                  end--;
              }
          }
      }
      return false;
    }
    
    public static void quickSort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int r=partition(arr,start,end);
            quickSort(arr,start,r-1);
            quickSort(arr,r+1,end);
        }
    }
    
    public static int partition(int[] arr,int start,int end)
    {
        int pivot=arr[end];
        int i=start-1;
        int j=start;
        while(j<=end)
        {
            if(pivot>=arr[j])
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        return i;
    }

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		boolean res=findTriplets(arr,n);
		System.out.println();
		System.out.println("result :");
		if(res)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}

}
