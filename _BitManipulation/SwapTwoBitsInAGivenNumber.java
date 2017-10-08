package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class SwapTwoBitsInAGivenNumber {

	public static int swapBits(int num,int a,int b)
	{
		if(a==b)
		{
			return num;
		}
		int k=num>>(a-1);
		k=k&1;
		int l=num>>>(b-1);
		l=l&1;
		int xor=k^l;
		if(xor==0)
		{
			return num;
		}
		int t=xor<<(a-1) | xor<<(b-1);
		return num^t;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=s.nextInt();
		System.out.println("Enter positions whose bits you want to swap :");
		int a=s.nextInt();
		int b=s.nextInt();
		int res=swapBits(num,a,b);
		System.out.println(res);
	}
	
}
