package GeeksForGeeks_Strings;

import java.util.Scanner;

public class AlternateVowelAndConsonantString {
	
	public static String formStringWithAlternateVowelAndConsonant(String vowel,String consonant,int v,int c,String res,boolean flag)
	{
        while(v<vowel.length() && c<consonant.length())
        {
        	if(flag)
        	{
        		res+=vowel.charAt(v);
        		v++;
        		flag=!flag;
        	}
        	else
        	{
        		res+=consonant.charAt(c);
        		c++;
        		flag=!flag;
        	}
        }
        if(v<vowel.length())
        {
        	res+=vowel.charAt(v);
        }
        if(c<consonant.length())
        {
        	res+=consonant.charAt(c);
        }
        return res;
	}

	public static boolean isVowel(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			return true;
		return false;
	}
	
	public static String findString(String str)
	{
		if(str.length()<2)
		{
			return str;
		}
		int c=0;
		int v=0;
		String vowel="";
		String consonant="";
		for(int i=0;i<str.length();i++)
		{
			if(isVowel(str.charAt(i)))
			{
				v++;
				vowel+=str.charAt(i);
			}
			else
			{
				c++;
				consonant+=str.charAt(i);
			}
		}
		if(Math.abs(v-c)>1)
		{
			return "No such string can be formed";
		}
		String res="";
		boolean flag=true;      // add vowel in result
	    if(v>c)
		{
		  res+=vowel.charAt(0);
		  return formStringWithAlternateVowelAndConsonant(vowel,consonant,1,0,res,!flag);
		}
	    else if(c>v)
	    {
	    	res+=consonant.charAt(0);
	    	return formStringWithAlternateVowelAndConsonant(vowel,consonant,0,1,res,flag);
	    }
	    else
	    {
	    	if(vowel.charAt(0)<consonant.charAt(0))
	    	{
	    		res+=vowel.charAt(0);
	    		return formStringWithAlternateVowelAndConsonant(vowel,consonant,1,0,res,!flag);
	    	}
	    	else
	    	{
	    		res+=consonant.charAt(0);
	    		return formStringWithAlternateVowelAndConsonant(vowel,consonant,0,1,res,flag);
	    	}
	    }
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr string :");
		String str=s.nextLine();
		String res=findString(str);
		System.out.println(res);
	}
	
}
