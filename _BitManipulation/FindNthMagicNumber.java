package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class FindNthMagicNumber {
	
	public static int magicNumber(int n)
	{
		int pow=1;
		int res=0;
		while(n!=0)
		{
			pow=pow*5;
			res=res+(pow* (n&1));
			n=n>>1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=s.nextInt();
		int res=magicNumber(n);
		System.out.println(n+"th magic number = "+res);
	}

}
