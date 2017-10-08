/*    Sort array after converting elements to their squares
        Given a array of both positive and negative integers ‘arr[]’ which are sorted. 
        Task is to sort square of the numbers of the Array.
        Examples:
          Input  : arr[] =  {-6, -3, -1, 2, 4, 5}
          Output : 1, 4, 9, 16, 25, 36 

          Input  : arr[] = {-5, -4, -2, 0, 1}
          Output : 0, 1, 4, 16, 25
 
 */

package GeeksForGeeks_Arrays;

public class SortArrayAfterConvertingElementsToItsSquares {

	public static int[] sortArray(int[] arr)
	{
		int f=0;
		int l=arr.length-1;
		int mid=(f+l)/2;
		while(f<l)
		{
			if(arr[mid]<0 && arr[mid+1]<0)
			{
				f=mid+1;
			}
			else if(arr[mid]<0 && arr[mid+1]>0)
			{
				break;
			}
			else
			{
				l=mid-1;
			}
			mid=(f+l)/2;
		}
	int[] res=new int[arr.length];
	int i=mid;
	int j=mid+1;
	int k=0;
	while(i>=0 && j<arr.length)
	{
		if(arr[i]*arr[i]<arr[j]*arr[j])
		{
			res[k]=arr[i]*arr[i];
			k++;
			i--;
		}
		else
		{
			res[k]=arr[j]*arr[j];
			j++;
			k++;
		}
	}
	while(i>=0)
	{
		res[k]=arr[i]*arr[i];
		i--;
		k++;
	}
	while(j<arr.length)
	{
		res[k]=arr[j]*arr[j];
		j++;
		k++;
	}
	return res;
	}
	
	public static void main(String[] args) {
		int[] arr={-6,-3,-1,2,4,5};
	int[] res=sortArray(arr);
		for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
	}
	
}
