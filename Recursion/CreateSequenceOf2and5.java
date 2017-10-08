package Recursion;

import java.util.Scanner;

public class CreateSequenceOf2and5 {
	
	public static void print(int num,int res)
	{
		if(res>=num)
			return;
		if(res<num && res!=0)
			System.out.println(res);
		print(num,(res*10)+2);
		print(num,(res*10)+5);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range :");
		int n=s.nextInt();
		print(n,0);
	}

}
