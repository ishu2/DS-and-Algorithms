package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class Swap3NumbersWithoutUsingTemporaryVariables {
	
	public static void swapUsingXOR(int a,int b,int c)
	{
		a=a^b^c;
		b=a^b^c;
		c=a^b^c;
		a=a^b^c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void swapUsingArithmetic(int a,int b,int c)
	{
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a , b , c :-");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		swapUsingXOR(a,b,c);
		swapUsingArithmetic(a,b,c);
		
	}

}
