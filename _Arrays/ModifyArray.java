/*   Q- Given an array , replace data of every index with the product of data of
 
 *      every other index.
 *      For eg-
 *       
 *      Input   :  {2,3,5,4,10}
 *      Output  :  {600,400,240,300,120}
 * 
 * */



package GeeksForGeeks_Arrays;

public class ModifyArray {
	
	public static int[] usingBruteForce(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
		{
			return arr;
		}
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			res[i]=1;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					res[i]*=arr[j];
				}
			}
		}
		return res;
	}
	
	public static int[] usingBestApproach(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
		{
			return arr;
		}
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		left[0]=1;
		right[arr.length-1]=1;
		for(int i=1;i<left.length;i++)
		{
			left[i]=left[i-1]*arr[i-1];
		}
		for(int j=right.length-2;j>=0;j--)
		{
			right[j]=right[j+1]*arr[j+1];
		}
		for(int i=0;i<left.length;i++)
		{
			left[i]=right[i]*left[i];
		}
		return left;
	}
	
	public static void main(String[] args) {
		int[] arr={2,3,5,4,10};
		int[] res1=usingBruteForce(arr);
		System.out.println("solution with O(N^2) complexity (using brute force) :");
		for(int i=0;i<res1.length;i++)
		{
			System.out.println(res1[i]);
		}
		int[] res2=usingBestApproach(arr);
		System.out.println("solution with O(N) complexity :");
		for(int i=0;i<res2.length;i++)
		{
			System.out.println(res2[i]);
		}
	}

}
