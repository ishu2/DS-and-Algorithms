package GeeksForGeeks_Strings;

import java.util.Scanner;

public class PrintAllPermutationWithRepetitionOfCharacters {
	
	public static void printPermutation(String str,String res,int len)
	{
		if(len==str.length() || str.length()==0)
		{
			System.out.println(res);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			printPermutation(str,res+str.charAt(i),len+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		printPermutation(str,"",0);
	}

}
