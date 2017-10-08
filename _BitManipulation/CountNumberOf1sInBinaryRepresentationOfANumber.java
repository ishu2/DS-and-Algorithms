package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class CountNumberOf1sInBinaryRepresentationOfANumber {
	
	public static int count(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int res=0;
		while(n!=0)
		{
			if((n&1)==1)
			{
				res++;
			}
			n=n>>1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :-");
		int n=s.nextInt();
		int res=count(n);
		System.out.println("Number of 1's in binary representation");
		System.out.println("of "+n+" are "+res);
	}

}
