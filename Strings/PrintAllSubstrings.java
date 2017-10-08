package Strings;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		String str="abcd";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				String res=str.substring(i,j+1);
				System.out.println(res);
			}
		}
	}
	
}
