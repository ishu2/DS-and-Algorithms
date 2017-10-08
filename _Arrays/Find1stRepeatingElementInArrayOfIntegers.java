package GeeksForGeeks_Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Find1stRepeatingElementInArrayOfIntegers {

	public static int firstRepeatingElement(int[] arr)
	{
		if(arr.length<2)
		{
			return -1;
		}
		int res=-1;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(arr[i])>1)
			{
				res=arr[i];
				break;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int res=firstRepeatingElement(arr);
		if(res==-1)
		{
			System.out.println("There is no repeating element !!");
		}
		else
		{
			System.out.println("1st repeating element is : "+res);
		}
	}
	
}
