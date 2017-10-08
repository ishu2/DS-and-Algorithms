package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListAsValueInHashmap {
	
	public static HashMap<String,ArrayList<Integer>> func(String[] a)
	{
		HashMap<String,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
        	if(map.containsKey(a[i]))
        	{
        		ArrayList<Integer> list=map.get(a[i]);
        		list.add(i);
        		map.put(a[i], list);
        	}
        	else
        	{
        		ArrayList<Integer> list=new ArrayList<>();
        		list.add(i);
        		map.put(a[i], list);
        	}
        }
        return map;
	}
	
	public static void main(String[] args) {
		String[] arr={"may","student","students","dog","god","cat","act","tab","bat",
				"flow", "wolf", "lambs","amy", "yam", "balms", "looped", "poodle"};
		
		String[] a={"a","b","c","d","b","c","b","a","a"};
		HashMap<String,ArrayList<Integer>> res=func(a);
		for(String set:res.keySet())
		{
			ArrayList<Integer> val=res.get(set);
			System.out.print(set+" : ");
			for(Integer i:val)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
