package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnValidParenthesis {
	
	static ArrayList<String> list=new ArrayList<>();
	
	public static void find(int m,int n,int k,String res)
	{
		if(res.length()==2*k)
		{
			list.add(res);
			System.out.println(res);
			return;
		}
		if(m<k)
			find(m+1,n,k,res+"(");
		if(m>n)
			find(m,n+1,k,res+")");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=s.nextInt();
		find(0,0,n,"");
		int k=0;
		String[] arr=new String[list.size()];
		for(String i:list)
			arr[k++]=i;
		for(int i=0;i<list.size();i++)
			System.out.println(arr[i]);
	}

}
