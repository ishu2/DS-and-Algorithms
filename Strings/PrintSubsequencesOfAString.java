package Strings;

public class PrintSubsequencesOfAString {
	
	public static void printSubsequences(String str,String resultSoFar)
	{
		if(str.length()==0)
		{
			System.out.println(resultSoFar);
			return;
		}
		printSubsequences(str.substring(1),resultSoFar);
		printSubsequences(str.substring(1),resultSoFar+str.charAt(0));
	}
	
	public static void main(String[] args) {
		String str="abc";
		printSubsequences(str," ");
	}

}
