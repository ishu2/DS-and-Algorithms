package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class Swap2PairOfBitsOfGivenSize {
	
	public static int swapBits(int num,int l,int a,int b)
	{
		if(num==0 || l==0)
		{
			return num;
		}
		while(l>0)
		{
			int k=((num>>a)&1) ^ ((num>>b)&1);
			if(k!=0)
			{
				num=num^(1<<a);
				num=num^(1<<b);
			}
			l--;
			a++;
			b++;
		}
		return num;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=s.nextInt();
		System.out.println("Enter size of bits to be swapped :");
		int l=s.nextInt();
		System.out.println("Enetr 1st starting position from right :");
		int a=s.nextInt();
		System.out.println("Enetr second starting position from right :");
		int b=s.nextInt();
		int res=swapBits(num,l,a,b);
		System.out.println(res);
	}

}
