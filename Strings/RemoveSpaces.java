package Strings;

public class RemoveSpaces {
	
	public static void main(String[] args) {
		String str="Hi, How are you?";
		for(int i=0;i<str.length();)
		{
			if(str.charAt(i)==' ')
			{
				str=str.substring(0, i)+str.substring(i+1);
			}
			else
			{
				i++;
			}
		}
		System.out.println(str);
	}

}
