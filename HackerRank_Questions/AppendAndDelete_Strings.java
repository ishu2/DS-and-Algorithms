package HackerRank_Questions;

import java.util.Scanner;

public class AppendAndDelete_Strings {
	
	public static boolean isPossible(String s,String t,int k)
	{
		if(s.length()+t.length()<=k)
		{
			return true;
		}
        int i=0;
        while(i<s.length() && i<t.length())
        {
        	if(!(s.charAt(i)==t.charAt(i)))
        	{
        		break;
        	}
        	i++;
        }
        k=k-(s.length()-i);
        k=k-(t.length()-i);
        if(k<0)
        {
        	return false;
        }
        if(k%2==0)
        {
        	return true;
        }
        else
        {
        	return false;
        }
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String t=s.next();
		int k=s.nextInt();
		boolean res=isPossible(str,t,k);
		System.out.println(res);
		
		
	}

}
