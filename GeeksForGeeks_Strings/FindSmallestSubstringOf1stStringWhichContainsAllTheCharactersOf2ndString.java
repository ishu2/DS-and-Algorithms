package GeeksForGeeks_Strings;

import java.util.Arrays;

public class FindSmallestSubstringOf1stStringWhichContainsAllTheCharactersOf2ndString {
	
	public static String minimum(String large,String small)
	{
		int[] arrSmall=new int[256];
		int[] arrLarge=new int[256];
		Arrays.fill(arrSmall,0);
		Arrays.fill(arrLarge,0);
		for(int i=0;i<small.length();i++)
		{
		    arrSmall[small.charAt(i)]+=1;
		}
		int start=0;
		int end=0;
		int len=0;
		String res="";
		while(end<large.length())
		{
		    arrLarge[large.charAt(end)]+=1;
		    
		    if(arrLarge[large.charAt(end)]<=arrSmall[large.charAt(end)])
		    len+=1;
		    
		    if(len==small.length())
		    {
		        
		        while(arrLarge[large.charAt(start)]>arrSmall[large.charAt(start)] && start<end)
		        {
		        arrLarge[large.charAt(start)]--;
		         start++;
		        }
		        String str=large.substring(start,end+1);
		        if(res=="")
		        res=str;
		        if(str.length()<res.length())
		        res=str;
		    }
		    end++;
		}
			return res;

	}
	
	public static void main(String[] args) {
		String s1="Looking for minimum string";
		String s2="mums";
		System.out.println(minimum(s1,s2));
	}

}
