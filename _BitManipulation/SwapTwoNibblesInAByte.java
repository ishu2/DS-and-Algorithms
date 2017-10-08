package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class SwapTwoNibblesInAByte {
	
	public static int swapNibbles(int num)
	{
		if(num==0)
		{
			return 0;
		}
		int i=num & 0x0f;
		i=i<<4;
		int j=num & 0xf0;
		j=j>>4;
		int a=i|j;
		return a;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number whose nibbles you want to swap :");
		int num=s.nextInt();
		int res=swapNibbles(num);
		System.out.println(res);
	}

}
