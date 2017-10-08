package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class CheckIfaNumberIsPowerOfTwo {
	
	public static boolean checkPowerOf2(int num)
	{
		if(num==0)
		{
			return false;
		}
		if(num==1)
		{
			return true;
		}
		int count=0;
		while(num!=0)
		{
			if((num&1)==1)
			{
				count++;
			}
			num=num>>1;
		}
		if(count==1)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=s.nextInt();
		boolean res=checkPowerOf2(num);
		System.out.println(res);
	}

}
