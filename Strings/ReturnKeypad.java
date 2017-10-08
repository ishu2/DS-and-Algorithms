package Strings;

public class ReturnKeypad {
	
	public static String[] returnKeypad(int num)
	{
		if(num<10)
		{
			String r=correspondingString(num);
			String[] res=new String[r.length()];
			for(int i=0;i<res.length;i++)
			{
				res[i]=r.charAt(i)+"";
			}
			return res;
		}
		String[] res=returnKeypad(num/10);
		String key=correspondingString(num%10);
		String[] finalRes=new String[res.length*key.length()];
		int k=0;
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<key.length();j++)
			{
				finalRes[k]=res[i]+key.charAt(j);
				k++;
			}
		}
		return finalRes;
	}
	
	public static String correspondingString(int num)
	{
		String res=null;
		switch(num)
		{
		case 1 :  res="*&^";
		          return res;
		case 2 :  res="abc";
		          return res;
		case 3:   res="def";
		          return res;
		case 4:   res="ghi";
		          return res;
		case 5:   res="jkl";
		          return res;
		case 6:   res="mno";
		          return res;
		case 7:   res="pqrs";
		          return res;
		case 8:   res="tuv";
		          return res;
		case 9:   res="wxyz";
		          return res;
		case 0:   res="_";
		          return res;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int num=23;
		String[] res=returnKeypad(num);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

}
