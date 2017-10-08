package HackerEarth;

public class ReturnUncommonEltsFromTwoArrays {

	public static String uncommon(int[] arr1,int[] arr2)
	{
        quickSort(arr1,0,arr1.length-1);
        quickSort(arr2,0,arr2.length-1);
        String res="";
        	 for(int i=0;i<arr1.length;i++)
             {
             	int index=binarySearch(arr1[i],arr2);
             	if(index==-1)
             	{
             		if(res=="")
             		{
             			res+=arr1[i];
             		}
             		else
             		res=res+'$'+arr1[i];
             	}
             }
        	 for(int i=0;i<arr2.length;i++)
             {
             	int index=binarySearch(arr2[i],arr1);
             	if(index==-1)
             	{
             		if(res=="")
             		{
             			res+=arr2[i];
             		}
             		else
             		res=res+'$'+arr2[i];
             	}
             }
       
        return res;
	}
	
	 public static int binarySearch(int elt,int[] arr)
	    {
	        int start=0;
	        int end=arr.length-1;
	        if(elt==arr[start])
	        {
	            return start;
	        }
	        if(elt==arr[end])
	        {
	            return end;
	        }
	        
	        while(start<=end)
	        {
	            int mid=(start+end)/2;
	            if(arr[mid]==elt)
	            {
	                return mid;
	            }
	            else if(arr[mid]>elt)
	            {
	                end=mid-1;
	            }
	            else
	            {
	                start=mid+1;
	            }
	        }
	        return -1;
	    }
	 
	 public static void quickSort(int[] arr,int f,int l)
	    {
	        if(f<l)
	        {
	            int index=partition(arr,f,l);
	            quickSort(arr,f,index-1);
	            quickSort(arr,index+1,l);
	        }
	    }
	 
	 public static int partition(int[] arr,int f,int l)
	    {
	        int i=f-1;
	        int pivot=arr[l];
	        while(f<=l)
	        {
	            if(arr[f]<=pivot)
	            {
	                i++;
	                int temp=arr[f];
	                arr[f]=arr[i];
	                arr[i]=temp;
	            }
	            f++;
	        }
	        return i;
	    }

	
	public static void main(String[] args) {
		int[] arr1={1,3,5,4,2};
		int[] arr2={3,4,5,6,7};
		String res=uncommon(arr1,arr2);
		System.out.println(res);
	}
	
}
