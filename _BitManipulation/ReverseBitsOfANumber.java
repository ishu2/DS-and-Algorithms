package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class ReverseBitsOfANumber {
	
	public static int reverseBits(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int res=0;
		int count=0;
		while(n!=0)
		{
			int k=n&1;
			res=res|k;
			res=res<<1;
			n=n>>1;
			count++;
		}
		return (res<<(8-(count+1)));
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number whose bits u want to reverse :");
		int n=s.nextInt();
		int res=reverseBits(n);
		System.out.println(res);
	}
	
}
