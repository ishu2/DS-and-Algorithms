package January_27;

import java.util.ArrayList;

public class Question_1_ReturnPermutations {
	
	public static String[] returnPermutation(String str)
	{
		if(str.length()==1)
		{
			String[] res={str};
			return res;
		}
		String[] res=returnPermutation(str.substring(1));
		int size=res.length*(res[0].length()+1);
		String[] finalRes=new String[size];
		int k=0;
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<=res[i].length();j++)
			{
				finalRes[k]=res[i].substring(0, j)+str.charAt(0)+res[i].substring(j);
				k++;
			}
		}
		return finalRes;
	}

	public static void main(String[] args) {
		String str="abc";
		String[] res=returnPermutation(str);
		for(String s:res)
		{
			System.out.println(s);
		}
	}
	
}
