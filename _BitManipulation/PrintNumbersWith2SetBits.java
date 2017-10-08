package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class PrintNumbersWith2SetBits {
	
	public static void print2SetBitNumbers(int num)
	{
		if(num<=2)
		{
			System.out.println("No such number exists !!!");
			return ;
		}
		int i=0;
		int j=i+1;
		boolean condition=true;
		while(condition)
		{
			if(Math.pow(2, i)+Math.pow(2, j)<=num)
			{
				int res=(int) (Math.pow(2, i)+Math.pow(2, j));
				System.out.println(res);
				j++;
			}
			else
			{
				i=i+1;
				j=i+1;
				if(Math.pow(2, i)+Math.pow(2, j)>num)
				{
					condition=false;
				}
			}
		}
			
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number upto which you want to print numbers :");
		int num=s.nextInt();
		System.out.println("Numbers with 2 set bits less than ");
		System.out.println(num+" are :");
		print2SetBitNumbers(num);
	}

}
