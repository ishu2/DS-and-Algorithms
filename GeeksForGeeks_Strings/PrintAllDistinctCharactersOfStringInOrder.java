//  Input : Geeks for Geeks           Output : for
//  Input : Geeks Quiz                Output:  GksQuiz

package GeeksForGeeks_Strings;

import java.util.Scanner;

public class PrintAllDistinctCharactersOfStringInOrder {
	
	public static String distinctCharacters(String str)
	{
		if(str.length()<2)
		{
			return str;
		}
		int[] arr=new int[256];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=-1;
		}
		for(int i=0;i<str.length();i++)
		{
			if(arr[str.charAt(i)]==-1)
			{
				arr[str.charAt(i)]=i;
			}
			else
			{
				arr[str.charAt(i)]=Integer.MAX_VALUE;
			}
		}
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(arr[str.charAt(i)]!=-1 && arr[str.charAt(i)]!=Integer.MAX_VALUE && str.charAt(i)!=' ')
			{
				res+=str.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String res=distinctCharacters(str);
		System.out.println("Distict characters of '"+str+"' are : ");
		System.out.println(res);
	}
	
}
