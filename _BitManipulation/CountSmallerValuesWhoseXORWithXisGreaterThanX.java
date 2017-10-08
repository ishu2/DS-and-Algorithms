package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class CountSmallerValuesWhoseXORWithXisGreaterThanX {
	
	public static int count(int num)
	{
		if(num==0 || num==1)
		{
			return 0;
		}
		int k=0;
		int n=num;
		while(n!=0)
		{
			k++;
			n=n>>1;
		}
		int i=0;
		int res=0;
		while(k>0)
		{
			res=(int) (res+Math.pow(2, i));
			i++;
			k--;
		}
		return res-num;
	}
	
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number :");
	int num=s.nextInt();
	int res=count(num);
	System.out.println(res);
   }
	
}
