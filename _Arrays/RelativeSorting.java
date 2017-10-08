package GeeksForGeeks_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class RelativeSorting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		while(T>0)
		{
		    int n1=s.nextInt();
		    int[] a1=new int[n1];
		    for(int i=0;i<n1;i++)
		    a1[i]=s.nextInt();
		    int n2=s.nextInt();
		    int[] a2=new int[n2];
		    for(int i=0;i<n2;i++)
		    a2[i]=s.nextInt();
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n1;i++)
		    {
		        if(map.containsKey(a1[i]))
		        map.put(a1[i],map.get(a1[i])+1);
		        else
		        map.put(a1[i],1);
		    }
		    int[] res=new int[n1];
		    int t=0;
		    for(int i=0;i<n2;i++)
		    {
		        int k=map.get(a2[i]);
		        while(k>0)
		        {
		        	res[t++]=a2[i];
		        	k--;
		        }
		        
		        map.remove(a2[i]);
		    }
		    Set<Integer> set=map.keySet();
		    int[] arr=new int[set.size()];
		    int a=0;
		    for(Integer i:set)
		    arr[a++]=i;
		    Arrays.sort(arr);
		    for(int i=0;i<arr.length;i++)
		    {
		    	int k=map.get(arr[i]);
		    	while(k>0)
		    	{
		    		 res[t++]=arr[i];
		    		 k--;
		    	}
		    }
		   
		    for(int i=0;i<res.length;i++)
		    System.out.print(res[i]+" ");
		    System.out.println();
		    T--;
		}
	}
	
}
