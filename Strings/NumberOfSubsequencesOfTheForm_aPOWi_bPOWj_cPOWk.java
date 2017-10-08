/*  Given a string, count number of subsequences of the form aibjck, where i >= 1, j >=1 and k >= 1.

 * 
 *    Input  : abbc
      Output : 3
      Subsequences are abc, abc and abbc

      Input  : abcabc
      Output : 7
      Subsequences are abc, abc, abbc, aabc, abcc, abc and abc

                                    Asked in : Amazon 
*/


package Strings;

public class NumberOfSubsequencesOfTheForm_aPOWi_bPOWj_cPOWk {

	public static int count(String str)
	{
		if(str.length()<3)
		{
			return 0;
		}
		int res=0;
		int[] arr=new int[26];
		for(int i=0;i<str.length();i++)
		{
			int index=str.charAt(i)-'a';
			arr[index]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
			{
				res=res+arr[i];
			}
		}
		return res+1;
	}
	
	public static void main(String[] args) {
		String str="aaabbc";
		int res=count(str);
		System.out.println(res);
	}
	
}
