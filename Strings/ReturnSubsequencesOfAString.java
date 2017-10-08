package Strings;

public class ReturnSubsequencesOfAString {
	
	public static String[] returnSubsequence(String str)
	{
		if(str.length()==0)
		{
			String[] s={""};
			return s;
		}
		String[] res=returnSubsequence(str.substring(1));
		String[] res2=new String[res.length*2];
		for(int i=0;i<res.length;i++)
		{
			res2[i]=res[i];
		}
		int k=0;
		for(int j=res.length;j<res2.length;j++)
		{
			res2[j]=str.charAt(0)+res[k];
			k++;
		}
		return res2;
	}
	
	public static void main(String[] args) {
		String str="abc";
		String[] res=returnSubsequence(str);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

}
