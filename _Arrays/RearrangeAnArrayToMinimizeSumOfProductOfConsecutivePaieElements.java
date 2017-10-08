package GeeksForGeeks_Arrays;

public class RearrangeAnArrayToMinimizeSumOfProductOfConsecutivePaieElements {

	public static int sortArray(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		if(arr.length==1)
		{
			return arr[0];
		}
		if(arr.length==2)
		{
			return arr[0]*arr[1];
		}
		int[] res=mergeSort(arr);
		int result=0;
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			result+=res[i]*res[j];
			i++;
			j--;
		}
		return result;
	}
	
	public static int[] mergeSort(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
		{
			return arr;
		}
		int mid=arr.length/2;
		int[] l=new int[mid];
		int[] r=new int[arr.length-mid];
		int k=0;
		for(int i=0;i<l.length;i++)
		{
			l[i]=arr[k];
			k++;
		}
		for(int i=0;i<r.length;i++)
		{
			r[i]=arr[k];
			k++;
		}
		int[] lArray=mergeSort(l);
		int[] rArray=mergeSort(r);
		int[] res=merge(arr,lArray,rArray);
		return res;
	}
	
	public static int[] merge(int[] arr,int[] l,int[] r)
	{
		if(l.length==0)
		{
			return r;
		}
		if(r.length==0)
		{
			return l;
		}
		int k=0;
		int i=0;
		int j=0;
		while(i<l.length && j<r.length)
		{
			if(l[i]<r[j])
			{
				arr[k]=l[i];
				i++;
			}
			else
			{
				arr[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<l.length)
		{
			arr[k]=l[i];
			i++;
			k++;
		}
		while(j<r.length)
		{
			arr[k]=r[j];
			j++;
			k++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr={9,2,8,4,5,7,6,0};
		int sum=sortArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Minimum Sum Of Product is :"+sum);
	}
	
}
