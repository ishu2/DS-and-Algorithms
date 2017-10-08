package GeeksForGeeks_Strings;

import java.util.Scanner;

public class CreateSequence {
	
	public static void func(int n,int[] arr)
	{
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=s.nextInt();
		if(n<=2)
			return;
		if(n<=5 && n>2)
		{
			System.out.println("2");
			return;
		}
		String[] arr={"2","5"};
		func(n,arr);
	}

}
