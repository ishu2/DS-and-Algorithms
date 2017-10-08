package Strings;

import java.util.Scanner;

public class MoveSpacesToFrontOfStringInSingleTraversal {
	
	public static String moveSpaces(String str)
	{
		if(str.length()<=1)
			return str;
		char[] arr=str.toCharArray();
		int i=str.length()-1;
		int j=str.length()-1;
		while(j>=0 && i>=0)
		{
			while(arr[j]!=' ' && j>0)
			    j--;
			i=j;
			while(arr[i]==' ' && i>0)
				i--;
			if(j<0 || i<0)
				break;
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
			i--;
		}
		String res=String.valueOf(arr);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.nextLine();
		String res=moveSpaces(str);
		System.out.println(res);
	}

}
