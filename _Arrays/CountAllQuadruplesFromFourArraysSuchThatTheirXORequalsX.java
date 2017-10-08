package GeeksForGeeks_Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountAllQuadruplesFromFourArraysSuchThatTheirXORequalsX {
	
	public static void findQuadruples(int[] a,int[] b,int[] c,int[] d,int x)
	{
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				int key=a[i]^b[j];
				ArrayList<Integer> list=new ArrayList<>();
				list.add(a[i]);
				list.add(b[j]);
				map.put(key, list);
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<d.length;j++)
			{
				if(map.containsKey(c[i]^d[j]^x))
				{
					ArrayList<Integer> res=map.get(c[i]^d[j]^x);
					for(Integer k:res)
					{
						System.out.print(k+" , ");
					}
					System.out.print(c[i]+" , "+d[j]);
				}
				System.out.println();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of 1st array :");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements of 1st array :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter size of 2nd array :");
		n=s.nextInt();
		int[] b=new int[n];
		System.out.println("Enter elements of 2nd array :");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		System.out.println("Enter size of 3rd array :");
		n=s.nextInt();
		int[] c=new int[n];
		System.out.println("Enter elements of 3rd array :");
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.nextInt();
		}
		System.out.println("Enter size of 4th array :");
		n=s.nextInt();
		int[] d=new int[n];
		System.out.println("Enter elements of 4th array :");
		for(int i=0;i<d.length;i++)
		{
			d[i]=s.nextInt();
		}
		System.out.println("Enter x :");
		int x=s.nextInt();
		findQuadruples(a,b,c,d,x);
	}

}
