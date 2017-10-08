/*  Q-11 Modify an array in such a manner that all the even elements are placed at the even positions
         and odd elements are placed at the odd positions keeping the order of elements undisturbed.

        For eg – Input : {14,24,63,264,327,585,1,3,572,896}
                Output : {14,63,24,327,264,585,1,3,572,896} 
 * */

package GeeksForGeeks_Arrays;

public class Array_Question_11 {
	
	public static void modifyArray(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
		{
			return;
		}
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				if(arr[i]%2==0)
				{
					i++;
				}
				else
				{
					index=i;
					break;
				}
			}
			else
			{
				if(arr[i]%2!=0)
				{
					i++;
				}
				else
				{
					index=i;
					break;
				}
			}
		}
		
		
		if(index>=arr.length)
		{
			index=index-arr.length;
		}
		if(index%2==0)
		{
			int temp=arr[index];
			index=2*index;
			int temp2=arr[index];
			arr[index]=temp;
			index=2*index;
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] arr={14,24,63,264,327,585,1,3,572,896};
		modifyArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
