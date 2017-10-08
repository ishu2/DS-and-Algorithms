// Element at any index is equal to XOR of elements at its left and right.


package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class ConstructArrayFromXORofAllElementsOfArrayExceptElementAtSameIndex {

	public static void optimisedUsingExtraSpaceMethod(int[] arr)
	{
		if(arr.length==0)
		{
			System.out.println("No such array !!");
			return ;
		}
		if(arr.length==1)
		{
			System.out.println("0");
			return;
		}
		if(arr.length==2)
		{
			System.out.println(arr[1]+" , "+arr[0]);
			return;
		}
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		left[0]=0;
		for(int i=1;i<arr.length;i++)
		{
			left[i]=left[i-1]^arr[i-1];
		}
		right[arr.length-1]=0;
		for(int i=arr.length-2;i>=0;i--)
		{
			right[i]=right[i+1]^arr[i+1];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((left[i]^right[i])+" ");
		}
		System.out.println();
	}
	
	public static void bruteForceMethod(int[] arr)
	{
		if(arr.length==0)
		{
			System.out.println("No such array !!");
			return ;
		}
		if(arr.length==1)
		{
			System.out.println("0");
			return;
		}
		if(arr.length==2)
		{
			System.out.println(arr[1]+" , "+arr[0]);
			return;
		}
		for(int i=0;i<arr.length;i++)
		{
			int res=0;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					res=res^arr[j];
				}
			}
			System.out.print(res+" ");
		}
		System.out.println();
	}
	
	public static void bestOptimisedMethod(int[] arr)
	{
		if(arr.length==0)
		{
			System.out.println("No such array !!");
			return ;
		}
		if(arr.length==1)
		{
			System.out.println("0");
			return;
		}
		if(arr.length==2)
		{
			System.out.println(arr[1]+" , "+arr[0]);
			return;
		}
		int xor=0;
		for(int i=0;i<arr.length;i++)
		{
			xor=xor^arr[i];
		}
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			res[i]=arr[i]^xor;
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elememnts :");
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        System.out.println("New required array formed is :");
        bruteForceMethod(arr);
        optimisedUsingExtraSpaceMethod(arr);
        bestOptimisedMethod(arr);
	}
	
}
