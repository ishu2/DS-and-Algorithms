// Hamming distance is the number of character which are different at corresponding positions in the 2 strings.

package GeeksForGeeks_BitManipulation;

import java.util.Scanner;

public class HammingDistanceBetween2StringsOfEqualLength {
	
	public static int findHammingDistance(String s1,String s2)
	{
		if(s1.length()==0 && s2.length()==0)
		{
			return 0;
		}
		if(s1.length()==1 && s2.length()==1)
		{
			if( s1.charAt(0)==s2.charAt(0))
			    return 0;
			else
				return 1;
		}
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if((s1.charAt(i)!=s2.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first string :");
		String s1=s.next();
		System.out.println("Enter second string :");
		String s2=s.next();
		int res=findHammingDistance(s1,s2);
		System.out.println("These 2 strings differ in '"+res+"' characters");
	}

}
