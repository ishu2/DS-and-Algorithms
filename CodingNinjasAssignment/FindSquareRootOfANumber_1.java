package CodingNinjasAssignment;

import java.util.Scanner;

public class FindSquareRootOfANumber_1 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. whose square root you want to find :");
		int n=s.nextInt();
		int i=1;
		int k=0;
		while(i*i<n)
		{
			k=i;
			i++;
		}
		System.out.println(k);
	}

}
