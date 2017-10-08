/*
 *   Eg:-  Pattern ="ideserve"
 *         Text ="veer"
 *         
 *   Output : true (erve is anagram of veer is it is substring of pattern)
 */

package GeeksForGeeks_Strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FinfIfAnySubstringOfPatternIsAnagramOfGivenTextString {
	
	public static String findIfSubstringExists(String pattern,String text)
	{
		if(text.length()>pattern.length())
		{
			String res="";
			return res;
		}
		int index=-1;
		int t=0;
		for(int i=0;i<=pattern.length()-text.length();)
		{
			HashMap<Character,Integer> map=new HashMap<>();
			for(t=0;t<text.length();t++)
			{
				if(map.containsKey(text.charAt(t)))
				{
					map.put(text.charAt(t),map.get(text.charAt(t)+1));
				}
				else
				{
					map.put(text.charAt(t), 1);
				}
			}
			while(!(map.containsKey(pattern.charAt(i))) && i<=pattern.length()-text.length())
			{
				i++;
			}
			if(i>pattern.length()-text.length())
			{
				return "";
			}
			index=i;
			int k=0;
			for(k=0;k<text.length() && k<pattern.length();k++)
			{
				if(map.containsKey(pattern.charAt(i)))
				{
					int val=map.get(pattern.charAt(i));
					if(val==1)
					{
					map.remove(pattern.charAt(i));
					}
					else
					{
						map.put(pattern.charAt(i), val-1);
					}
					i++;
				}
				else
				{
					break;
				}
			}
			if(k==text.length())
			{
				return pattern.substring(index, index+text.length());
			}
			i++;
		}
		return "";
	}
	
	public static String findIfSubstringExists2(String pattern,String text)
	{
		if(text.length()>pattern.length())
		{
			return "";
		}
		HashMap<Character,Integer> t=new HashMap<Character,Integer>();
		for(int i=0;i<text.length();i++)
		{
			if(t.containsKey(text.charAt(i)))
			{
				t.put(text.charAt(i), t.get(text.charAt(i))+1);
			}
			else
			{
				t.put(text.charAt(i),1);
			}
		}
		HashMap<Character,Integer> p=new HashMap<>();
		int i=0;
		int index=-1;
		for(i=0;i<text.length();i++)
		{
			if(p.containsKey(pattern.charAt(i)))
			{
				p.put(pattern.charAt(i), p.get(pattern.charAt(i))+1);
			}
			else
			{
				p.put(pattern.charAt(i),1);
			}
		}
		while(i<pattern.length())
		{
			
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the PATTERN string :");
		String pattern=s.next();
		System.out.println("enter the TEXT string :");
		String text=s.next();
		String res=findIfSubstringExists(pattern,text);
		if(res.length()==0)
		{
			System.out.println("No such substring exists !!");
		}
		else
		{
			System.out.println(res);
		}
	}

}
