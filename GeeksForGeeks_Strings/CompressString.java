package GeeksForGeeks_Strings;

import java.util.Scanner;

public class CompressString {
	
	public static String compress(String inputString)
	{
		int i=0;
		int count=1;
		String res="";
		while(i<inputString.length())
		{
		    char ch=inputString.charAt(i);
		    res=res+ch;
		    i+=1;
		    while(i<inputString.length() && inputString.charAt(i)==ch)
		    {
		        count++;
		        i++;
		    }
		    if(count>1)
		    res=res+count;
		    count=1;
		}
        return res;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		System.out.println(compress(str));
	}

}
