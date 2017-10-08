package HackerRank_Questions;

import java.util.ArrayList;

public class SubarraysWithPerfectSquares {
	
	public static boolean isSquare(int num)
	{
		if(num==1)
		{
			return true;
		}
		int i=2;
		for(i=2;i*i<=num;i++)
		{
			if(i*i==num)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr={1,4};
		int prod=1;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isSquare(arr[i]))
			{
				count++;
			}
			prod=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				prod=prod*arr[j];
				if(isSquare(prod))
				{
					count++;
				}
			}
			
		}
		System.out.println(count);
	}

}
