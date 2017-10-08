package January_27;

public class Question_10_PrintPairsWhichSumToK {
	
	public static void quickSort(int[] arr,int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		int index=partition(arr,start,end);
		quickSort(arr,start,index-1);
		quickSort(arr,index+1,end);
	}
	
	public static int partition(int[] arr,int start,int end)
	{
		int pivot=arr[end];
		int i=start-1;
		for(int j=start;j<=end;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		return i;
	}
	
	public static void printDuplets(int[] arr,int sum)
	{
		if(arr.length==0)
		{
			System.out.println("no such pair....");
			return;
		}
		quickSort(arr,0,arr.length-1);
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]+arr[j]>sum)
			{
				j--;
			}
			else if(arr[i]+arr[j]<sum)
			{
				i++;
			}
			else if(arr[i]+arr[j]==sum)
			{
				if(arr[i]==arr[j])
				{
					int k=j-i;
					int count=k;
					while(k!=0)
					{
						count=count+k-1;
						k--;
					}
					for(int m=0;m<count;m++)
					{
						System.out.println(arr[i]+" "+arr[j]);
					}
					return;
				}
				else
				{
					if(arr[i]==arr[i+1] || arr[j]==arr[j-1])
					{
					  int count1=1;
					  int count2=1;
					  int a=i;
					  int b=j;
					  while(arr[i]==arr[i+1])
					  {
						i++;
						count1++;
					  }
					  while(arr[j]==arr[j-1])
					  {
						j--;
						count2++;
					  }
					  for(int m=0;m<count1*count2;m++)
					  {
						System.out.println(arr[a]+" "+arr[b]);
					  }
					  i++;
					  j--;
					}
					else
					{
						System.out.println(arr[i]+" "+arr[j]);
						i++;
						j--;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr={1,3,6,2,5,4,3,2,4};
		printDuplets(arr,7);
	}
	
}
