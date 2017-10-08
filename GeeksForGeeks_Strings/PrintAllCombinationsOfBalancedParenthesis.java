package GeeksForGeeks_Strings;

import java.util.Scanner;

public class PrintAllCombinationsOfBalancedParenthesis {
	
	public static void generateParenthesis(int position,int n,int left,int right,String res)
	{
		if(n==0)
		{
			System.out.println("No combination exists ..");
			return;
		}
		if(n==1)
		{
			System.out.println("{}");
			return ;
		}
		if(right>n)
		{
			System.out.println(res);
			return;
		}
		if(right<left)
		{
			res=res.substring(0,position)+"}"+res.substring(position);
			generateParenthesis(position+1,n,left,right+1,res);
		}
		else if(left<n)
		{
			res=res.substring(0,position)+"{"+res.substring(position);
			generateParenthesis(position+1,n,left+1,right,res);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=s.nextInt();
		int position=0;
		int left=0;
		int right=0;
		String res="";
		generateParenthesis(position,n,left,right,res);
	}

}
