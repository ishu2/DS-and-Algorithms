package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class Generate10NumbersAdjacentToAGivenNumberUsingBitManipulation {
	
	public static void generateNumbers(int n)
	{
		int i=0;
		while(i<10)
		{
			
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
	//	generateNumbers(n);
		while(n>0)
		{
			if((n&1)==0)
			{
				n=n|1;
			}
			n=n>>1;
		}
		System.out.println(n);
	}

}
