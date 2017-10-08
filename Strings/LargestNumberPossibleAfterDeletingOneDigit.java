package Strings;

public class LargestNumberPossibleAfterDeletingOneDigit {
	
	public static void main(String[] args) {
		int num=4135;
		String str=String.valueOf(num);
		String res="";
		int i=1;
		while(i<str.length())
		{
			if(str.charAt(i-1)>str.charAt(i))
			{
				res+=str.charAt(i-1);
			}
			else
			{
				res=res+str.substring(i);
				break;
			}
			i++;
		}
		int result=Integer.parseInt(res);
		System.out.println(result);
	}

}
