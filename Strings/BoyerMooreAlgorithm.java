package Strings;

public class BoyerMooreAlgorithm {
	
	public static int indexOfPattern(String str,char ch)
	{
		int[] arr=new int[26];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=str.length()-1;
		}
		int i=str.length()-1;
		int k=0;
		while(i>=0)
		{
			int index=str.charAt(i)-'a';
			arr[index]=k;
			k++;
			i--;
		}
		int index=ch-'a';
		return arr[index];
	}
	
	public static void searchPattern(String pattern,String text)
	{
		if(pattern.length()>text.length())
		{
			System.out.println("-1");
			return ;
		}
		if(pattern.length()==0)
		{
			System.out.println("-1");
			return;
		}
		int i=0;
		int k=pattern.length()-1;
		while(i<=text.length()-pattern.length())
		{
			if(pattern.charAt(k)==text.charAt(i+k))
			{
				k--;
			}
			else if(pattern.charAt(k)!=text.charAt(i+k))
			{
				int index=indexOfPattern(pattern.substring(0,k+1),text.charAt(i+k));
				i=i+index;
				k=pattern.length()-1;
			}
			if(k<0)
			{
				System.out.println(i);
				k=pattern.length()-1;
				i=i+k;
			}
		}
	}
	
    public static void main(String[] args) {
	String pattern="sahil";
	String text="this sahil is a beautiful girl";
	searchPattern(pattern,text);
    }
	
}
