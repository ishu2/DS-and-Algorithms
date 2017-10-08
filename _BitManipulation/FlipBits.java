package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class FlipBits {
	
	public static void flipBitsOfNumber_Method1(int n)
	{
		int count=0;
		int i=0;
		if(n<=15)
		{
		 count=4;
		 i=1000;
		}
		else
		{
		 count=8;
		 i=10000000;
		}
		int res=0;
		while(count>0)
		{
			if((n&i)==0)
			{
				res=res*10+1;
			}
			else
			{
				res=res*10;
			}
			count--;
			n=n<<1;
		}
		System.out.println(res);
	}
	
	public static  void flipBitsOfNumber_Method2(int n)
	{
		int i=1;
		int count=0;
		if(n<=15)
		{
			count=4;
		}
		else
		{
			count=8;
		}
		while(count>0)
		{
			if((n&i)==0)
			{
				n=n|i;
			}
			else
			{
				n=n&(i-1);
			}
			i=i*10;
			count--;
		}
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
	//	flipBitsOfNumber_Method1(n);
		flipBitsOfNumber_Method2(n);
	}

}
