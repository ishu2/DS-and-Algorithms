/*   Given a string of both uppercase and lowercase alphabets, the task is to print the string with alternate 
 *   occurrences of any character dropped(including space and consider upper and lowercase as same).

     Examples:
              Input : It is a long day Dear.
              Output : It sa longdy ear.
              Print first I and then ignore next i.Similarly print first space then ignore next space.

             Input : Geeks for geeks
             Output : Geks fore

 * */

package GeeksForGeeks_Strings;

import java.util.Scanner;

public class PrintStringByIgnoringAlternateOccurencesOfAnyCharacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.nextLine();
		String res=func(str);
		System.out.println(res);
	}
	
	public static String func(String str)
	{
		if(str.length()<2)
			return str;
		int[] arr=new int[26];
		boolean space=true;   // means you can add this space in your result.
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='.')
				res+='.';
			else if(str.charAt(i)==' ')
			{
				if(space)
					res+=' ';
				space=!space;
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				if(arr[str.charAt(i)-65]==0)
				{
					res+=str.charAt(i);
					arr[str.charAt(i)-65]=1;
				}
				else
					arr[str.charAt(i)-65]=0;
			}
			else
			{
				if(arr[str.charAt(i)-97]==0)
				{
					res+=str.charAt(i);
					arr[str.charAt(i)-97]=1;
				}
				else
					arr[str.charAt(i)-97]=0;
			}
		}
		return res;
	}
	
}
