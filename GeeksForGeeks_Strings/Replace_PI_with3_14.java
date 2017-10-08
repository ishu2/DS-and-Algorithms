package GeeksForGeeks_Strings;

import java.util.Scanner;

public class Replace_PI_with3_14 {
	
	public static String replace(String str)
	{
		if(str.length()==0)
		{
			return "";
		}
		if(str.length()==1)
		{
			return str;
		}
		String res="";
		if(str.substring(0, 2).equals("pi"))
		{
			res=res+3.14+replace(str.substring(2));
		}
		else
		{
			res+=str.charAt(0)+replace(str.substring(1));
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		String res=replace(str);
		System.out.println(res);
	}

}
