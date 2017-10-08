package GeeksForGeeks_Strings;

import java.util.Scanner;

public class ReturnPermutationOfString {
	
	public static String[] returnPermutation(String str)
	{
		if(str.length()==0 || str==null)
		{
			String[] res={""};
			return res;
		}
		String[] res=returnPermutation(str.substring(1));
		String[] res2=new String[(res[0].length()+1)*res.length];
		int k=0;
		for(int i=0;i<res.length;i++)
		{
			char ch=str.charAt(0);
			for(int j=0;j<=res[i].length();j++)
			{
				res2[k]=res[i].substring(0,j)+ch+res[i].substring(j);
				k++;
			}
		}
		return res2;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.next();
		String[] res=returnPermutation(str);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

}
