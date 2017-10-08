package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class CountMinimumBitsToFlipSuchThatXORofAandBequalToC {
	
	public static int countFlips(int a,int b,int c,int n)
	{
		if(a==0 &&  b==0)
		{
			if(c==0)
			{
				return 0;
			}
			else
			{
				int count=0;
				while(c!=0)
				{
					count++;
					c=c>>1;
				}
				return count;
			}
		}
		int count=0;
		int i=0;
		while(i<n)
		{
			if((a^b)==0 && (c&1)==1)
			{
				count++;
			}
			else if((a^b)==1 && (c&1)==0)
			{
				count++;
			}
			a=a>>1;
			b=b>>1;
			c=c>>1;
			n++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of bits");
		int N=s.nextInt();
		System.out.println("enter A");
		int A=s.nextInt();
		System.out.println("enter B");
		int B=s.nextInt();
		System.out.println("enter C");
		int C=s.nextInt();
		int res=countFlips(A,B,C,N);
		System.out.println(res+" flips are required to make");
		System.out.println("XOR of A and B equal to C");
	}

}
