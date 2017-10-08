package Strings;

public class PrintPermutationsOfAString {
	
	public static void printPermutation(String str,String resultSoFar)
	{
		if(str.length()==0)
		{
			System.out.println(resultSoFar);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			printPermutation(str.substring(0,i)+str.substring(i+1),resultSoFar+str.charAt(i));	
		}
	}

	public static void main(String[] args) {
		String str="abc";
		printPermutation(str," ");
	}
	
}
