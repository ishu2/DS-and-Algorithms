package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class RotateBitsOfANumber {
	
	public static int rotateBits(int n,int val)
	{
		if(n==0)
		{
			return n;
		}
		return (n<<val)|(n>>(16-val)); // Assuming it to be 16 bit integer.
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=s.nextInt();
		System.out.println("Enter value by which you want to rotate bits :");
		int val=s.nextInt();
		int res=rotateBits(n,val);
		System.out.println("Resultant number = "+res);
	}

}
