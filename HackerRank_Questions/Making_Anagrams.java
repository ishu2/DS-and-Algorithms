/*   Q- Find number of deletions required from both the strings to make anagrams of each other.



 *  
 *      Input:   s1="abc"   
 *               s2="cde"
 * 
 *      Output:4
 * 
 * */

package HackerRank_Questions;

import java.util.HashMap;

import java.util.Scanner;
import java.util.Set;

public class Making_Anagrams {

	public static int deletionsRequired(String s1,String s2)
	{
		if(s1.length()==0)
		{
			return s2.length();
		}
		if(s2.length()==0)
		{
			return s1.length();
		}
		HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++)
		{
		   if(map1.containsKey(s1.charAt(i)))
		   {
			   map1.put(s1.charAt(i), map1.get(s1.charAt(i))+1);
		   }
		   else
		   {
			   map1.put(s1.charAt(i),1);
		   }
		}
		for(int i=0;i<s2.length();i++)
		{
			if(map2.containsKey(s2.charAt(i)))
			{
				map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
			}
			else
			{
				map2.put(s2.charAt(i),1);
			}
		}
		int count=0;
		Set<Character> set1=map1.keySet();
		Set<Character> set2=map2.keySet();
		for(Character c:set1)
		{
			if(map1.containsKey(c) && map2.containsKey(c))
			{
				if(map1.get(c)>=map2.get(c))
				{
					count=count+map1.get(c)-map2.get(c);
					map2.remove(c);
				}
				else if(map2.get(c)>map1.get(c))
				{
					count=count+map2.get(c)-map1.get(c);
					map2.put(c, map2.get(c)-(map2.get(c)-map1.get(c)));	
				}
			}
			else
			{
				count=count+map1.get(c);
			}
		}
		for(Character c:set2)
		{
			count=count+map2.get(c);
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int res=deletionsRequired(s1,s2);
		System.out.println(res);
	}
	
}
