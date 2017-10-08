package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupsWordsWithSameSetOfStrings {
	
	public static String getKey(String str)
	{
		if(str.length()==1)
		{
			return str;
		}
		int[] arr=new int[26];
		for(int i=0;i<str.length();i++)
		{
			int index=str.charAt(i)-'a';
			arr[index]++;
		}
		String res="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=1)
			{
				res=res+(i+'a');
			}
		}
		return res;
	}
	
	public static HashMap<String,ArrayList<Integer>> func(String[] a)
	{
		HashMap<String,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
        	String key=getKey(a[i]);
        	if(map.containsKey(key))
        	{
        		ArrayList<Integer> list=map.get(key);
        		list.add(i);
        		map.put(key, list);
        	}
        	else
        	{
        		ArrayList<Integer> list=new ArrayList<>();
        		list.add(i);
        		map.put(key, list);
        	}
        }
        return map;
	}
	
	public static void main(String[] args) {
		String[] arr={"may","student","students","dog","god","cat","act","tab","bat",
				"flow", "wolf", "lambs","amy", "yam", "balms", "looped", "poodle"};
		
		String[] a={"abcd","abc","abce", "acd","abdc"};
		HashMap<String,ArrayList<Integer>> res=func(arr);
		for(String set:res.keySet())
		{
			ArrayList<Integer> val=res.get(set);
			for(Integer i:val)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

}
