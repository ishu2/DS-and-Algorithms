package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingArithmeticOperators {
	
	public static void swap(int a,int b)
	{
		if(a==0)
		{
			a=b;
			b=0;
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}
		if(b==0)
		{
			b=a;
			a=0;
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}
		int xor=a^b;
	    a=a^xor;
		b=b^xor;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number :-");
		int a=s.nextInt();
		System.out.println("Enter second number :-");
		int b=s.nextInt();
		swap(a,b);
	}

}
