package DivideAndConquer;

public class CountInversions {
	
	public static long mergeSort(int[] arr,int[] temp,int start,int end)
	{

	    long count=0;
	    if(start<end)
	    {
	        int mid=(start+end)/2;
	        count+=mergeSort(arr,temp,start,mid);
	        count+=mergeSort(arr,temp,mid+1,end);
	        count+=merge(arr,temp,start,mid+1,end);
	    }
	    return count;	
	}
	
	public static long merge(int[] arr,int[] temp,int start,int mid,int end)
	{
	  int i=start;
	  int j=mid;
	  int k=start;
	  long count=0;
	  while(i<=mid-1 && j<=end)
	  {
	      if(arr[i]<=arr[j])
	      temp[k++]=arr[i++];
	      else
	      {
	       count+=mid-i;   
	      temp[k++]=arr[j++];
	      }
	  }
	  while(i<=mid-1)
	  {
	      temp[k++]=arr[i++];
	  }
	  while(j<=end)
	  {
	    temp[k++]=arr[j++];  
	  }
	  for(i=start;i<=end;i++)
	  arr[i]=temp[i];
	  return count;
	}
	
	public static void main(String[] args) {
		int[] arr={2,5,1,3,4};
		int[] temp=new int[arr.length];
		System.out.println(mergeSort(arr,temp,0,arr.length-1));
	}

}
