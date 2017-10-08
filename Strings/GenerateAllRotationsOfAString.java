package Strings;

import java.util.Scanner;

public class GenerateAllRotationsOfAString {

	public static void printRotations(String str)
	{
		if(str.length()<=1)
		{
			System.out.println(str);
			return;
		}
		String s=str+str;
		System.out.println("Rotations of '"+str+"' are :");
		for(int i=0;i<str.length();i++)
		{
			System.out.println(s.substring(i, i+str.length()));
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
        printRotations(str);
	}
	
}
