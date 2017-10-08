package Strings;

import java.util.Scanner;

public class ReverseStringPreservingSpacePositions {

	public static String reverseString(String str)
	{
		if(str.length()<2)
			return str;
		char[] arr=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			while(arr[i]==' ')
				i++;
			while(arr[j]==' ')
				j--;
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		String res=String.valueOf(arr);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.nextLine();
		String res=reverseString(str);
		System.out.println(res);
	}
	
}
