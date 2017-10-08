package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class CheckIfANumberIsDivisibleBy11 {
	
	public static boolean checkDivisibility(long n)
	{
		if(n<=10)
		{
			return false;
		}
		if(n==11)
		{
			return true;
		}
		int odd=0;
		int even=0;
		int i=0;
		while(n!=0)
		{
			if(i%2==0)
			{
				even+=n%10;
			}
			else
			{
				odd+=n%10;
			}
			n=n/10;
			i++;
		}
		int res=Math.abs(odd-even)%11;
		if(res==0)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :-");
		long n=s.nextLong();
		System.out.println("Is "+n+" divisible by 11 ?");
		boolean res=checkDivisibility(n);
		System.out.println(res);
	}

}
