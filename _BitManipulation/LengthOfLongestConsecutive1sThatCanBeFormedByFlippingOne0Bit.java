package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class LengthOfLongestConsecutive1sThatCanBeFormedByFlippingOne0Bit {
	
	public static int findLength(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int prev0=-1;
		int prevPrev0=-1;
		int curr=-1;
		int res=-1;
		while(n!=0)
		{
			if((n&1)==1)
			{
				curr++;
			}
			else
			{
				if(curr-prevPrev0+1>res)
				{
				   res=curr-prevPrev0+1;
				}
				prevPrev0=prev0;
				prev0=curr;
			}
			n=n>>1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int res=findLength(n);
		System.out.println(res);
	}

}
