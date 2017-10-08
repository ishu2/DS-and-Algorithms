package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class SwapOddPositionBitsWithEvenPositionBits {
	
	public static int swapOddEvenBits(int num)
	{
		if(num==0)
		{
			return 0;
		}
		int a=num & 0xAAAAAAAA;
		a=a>>1;
		int b=num & 0x55555555;
		b=b<<1;
		return a|b;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=s.nextInt();
		int res=swapOddEvenBits(num);
		System.out.println(res);
	}

}
