package GeeksForGeeks_Arrays;

public class MinimizeSumOfTwoNumbers {
	
	public static int partition(int[] arr,int start,int end)
    {
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<=end;j++)
        {
            if(arr[j]<=pivot)
            {
                i+=1;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return i;
    }
    
    public static void sort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int index=partition(arr,start,end);
            sort(arr,start,index-1);
            sort(arr,index,end);
        }
    }
    
    public static void main(String[] args) {
		int[] arr={5,7,0,4,3};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
