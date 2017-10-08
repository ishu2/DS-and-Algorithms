package Strings;

public class TwistTheString {

	public static void main(String[] args) {
		String str="yyy";
		int i=0;
		String res="";
		while(i<str.length())
		{
			char ch=str.charAt(i);
			res+=ch;
			int count=1;
			i+=1;
			while(i<str.length() && str.charAt(i)==ch)
			{
				i++;
				count++;
			}
			int elt=(int) (ch+count);
			if(elt>122)
			{
			elt=(elt%122)-1;
			char ca=(char) (elt+'a');
			res+=ca;
			}
			else
			{
				char ca=(char)elt;
				res+=ca;
			}
		}
		System.out.println(res);
		
	}
	
}
