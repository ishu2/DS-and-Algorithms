// Input : String = amazon  SmallString = oazn (Check if SmallString is anagram of any of the substrings of String) 

package GeeksForGeeks_Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckWhetherAStringIsAnagramOfSubstringOfAGivenString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.nextLine();
		System.out.println("Enter smallString which u want to check :");
		String smallString=s.nextLine();
		boolean res=check(str,smallString);
		System.out.println(res);
	}
	
	public static boolean check(String str,String smallString)
	{
		if(smallString.length()>str.length())
			return false;
		int k=smallString.length();
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<=str.length()-k;i++)
			list.add(str.substring(i, i+k));
		boolean res=false;
		for(String s:list)
		{
			res=isAnagram(s,smallString);
			if(res)
				return true;
		}
		return res;
	}
	
	public static boolean isAnagram(String str,String smallString)
	{
		int[] arr=new int[256];
		for(int i=0;i<str.length();i++)
			arr[str.charAt(i)]++;
		for(int i=0;i<smallString.length();i++)
		{
			if(arr[smallString.charAt(i)]==0)
				return false;
			arr[smallString.charAt(i)]--;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				return false;
		}
		return true;
	}
	
}
