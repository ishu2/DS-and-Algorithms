package Strings;

public class DecodeTheIntegerIntoString {
	
	public static void main(String[] args) {
		int num=1234;
		func(num,"");
	}
	
	public static void func(int num,String res)
	{
		if(num<=0)
		{
			System.out.println(res);
			return;
		}
		int i=num%10;
		char ch=(char)(i-1+'a');
		func(num/10,ch+res);
		if(num%100<26)
		{
			ch=(char)(num%100-1+'a');
			func(num/100,ch+res);
		}
	}
	
}
