/*   Calculate difficulty of a given sentence. Here a Word is considered hard if it has 4 consecutive 
 *   consonants or number of consonants are more than number of vowels. Else word is easy. Difficulty of 
 *   sentence is defined as 5*(number of hard words) + 3*(number of easy words).

     Examples:
               Input : str = "Difficulty of sentence"
               Output : 13
               Hard words = 2(Difficulty and sentence)
               Easy words = 1(of)
               So, answer is 5*2+3*1 = 13

 * */


package GeeksForGeeks_Strings;

import java.util.Scanner;

public class CalculateDifficultyOfASentence {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=s.nextLine();
		System.out.println("Difficulty = "+func(str));
	}
	
	public static int func(String str)
	{
       if(str==null || str.length()==0)
    	   return 0;
       int t=0;
       int k=0;
       int cons=0;
       int vow=0;
       int hard=0;
       int easy=0;
       for(int i=0;i<str.length();i++)
       {
    	   if(str.charAt(i)==' ')
    	   {
    		   if(cons>vow || t>=4)
    			   hard++;
    		   else
    			   easy++;
    		   k=0;
    		   t=0;
    		   cons=0;
    		   vow=0;
    	   }
    	   else if(isVowel(str.charAt(i)))
    	   {
               vow++;
               t=Math.max(t, k);
               k=0;
    	   }
    	   else
    	   {
    		   cons++;
    		   k++;
    	   }
       }
		   if(cons>vow || t>=4)
			   hard++;
		   else
			   easy++;
       int res=(5*hard)+(3*easy);
       return res;
	}
	
	public static boolean isVowel(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			return true;
		return false;
	}

}
