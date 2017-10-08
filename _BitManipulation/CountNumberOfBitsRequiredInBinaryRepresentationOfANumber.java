package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class CountNumberOfBitsRequiredInBinaryRepresentationOfANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  number");
		int n=s.nextInt();
		int count=0;
		while(n!=0)
		{
			count++;
			n=n>>1;
		}
		System.out.println(count);
	}
	
}
