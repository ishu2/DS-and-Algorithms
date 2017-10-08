package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class SmallestPowerOf2GreaterThanOrEqualToNum {
	
	public static int findNumber(int num)
	{
		if(num==0 || num==1)
		{
			return 1;
		}
		int i=1;
		int count=0;
		while(i<num)
		{
			count++;
			i=i<<1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num :");
		int num=s.nextInt();
		int res=findNumber(num);
		System.out.println("Smallest power of two greater than or equal to "+num+" :");
		System.out.println(res);
		System.out.println("Number is :"+Math.pow(2, res));
	}

}
