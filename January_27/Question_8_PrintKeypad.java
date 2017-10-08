package January_27;

public class Question_8_PrintKeypad {

	public static void printKeypad(int num,String[] resultSoFar)
	{
		if(num==0)
		{
			for(String s:resultSoFar)
			{
				System.out.println(s);
			}
			return;
		}
		int n=num%10;
		num=num/10;
		String res=correspondingCharacters(n);
		String[] newResultSoFar=new String[resultSoFar.length*res.length()];
		int k=0;
		for(int i=0;i<res.length();i++)
		{
			for(int j=0;j<resultSoFar.length;j++)
			{
				newResultSoFar[k]=res.charAt(i)+resultSoFar[j];
				k++;
			}
		}
		printKeypad(num,newResultSoFar);
	}
	
	public static String correspondingCharacters(int n)
	{
		String res=" ";
		switch(n)
		{
		case 1: res=" ";
		        return res;
		case 2: res="abc";
		        return res;
		case 3: res="def";
		        return res;
		case 4: res="ghi";
		        return res;
		case 5: res="jkl";
		        return res;
		case 6: res="mno";
		        return res;
		case 7: res="pqrs";
		        return res;
		case 8: res="tuv";
		        return res;
		case 9: res="wxyz";
		        return res;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int num=1234;
		String[] res=new String[1];
		res[0]="";
		printKeypad(num,res);
	}
	
}
