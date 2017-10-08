package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class TurnOffAParticularBit {
	
	public static int unsetGivenBit(int n,int k)
	{
		if(n==0 && k>0)
		{
			return 0;
		}
		int i=1;
		while(k>1)
		{
			i=i<<1;
			k--;
		}
		return (n^i);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=s.nextInt();
		System.out.println("Enter the position of bit which you want to unset :");
		int k=s.nextInt();
		int res=unsetGivenBit(n,k);
		System.out.println(res);
	}

}
