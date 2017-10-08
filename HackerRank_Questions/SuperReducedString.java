/*
     Steve has a string, , consisting of  lowercase English alphabetic letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "aabcc" would become either "aab" or "bcc" after operation.

Steve wants to reduce  as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Steve out by finding and printing 's non-reducible form!

Note: If the final string is empty, print Empty String .

Input Format

A single string, .

Constraints

Output Format

If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

Sample Input 0

aaabccddd
Sample Output 0

abd
Sample Case 0

Steve can perform the following sequence of operations to get the final string:

aaabccddd → abccddd
abccddd → abddd
abddd → abd
Thus, we print abd.

Sample Input 1

baab
Sample Output 1

Empty String
Explanation 1

Steve can perform the following sequence of operations to get the final string:

baab → bb
bb → Empty String
Thus, we print Empty String.

Sample Input 2

aa
Sample Output 2

Empty String
Explanation 2

Steve can perform the following sequence of operations to get the final string:

aa → Empty String
Thus, we print Empty String. 
 */

package HackerRank_Questions;

public class SuperReducedString {

	public static void superReducedString(String str)
	{
		if(str.length()==0)
		{
			System.out.println("Empty String");
			return;
		}
		if(str.length()==1)
		{
			System.out.println(str);
			return;
		}
		String res="";
		int i=0;
		while(i<str.length()-1)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				i=i+2;
			}
			else
			{
				if(res=="")
				{
					res=res+str.charAt(i);
				}
				else if(res!="" && res.charAt(res.length()-1)!=str.charAt(i))
				{
				res=res+str.charAt(i);
				}
				else if(res.length()==1 && res.charAt(res.length()-1)==str.charAt(i))
				{
					res="";
				}
				else if(res.length()==1 && res.charAt(res.length()-1)==str.charAt(i))
				{
					res=res.substring(0,res.length()-1);
				}
				i++;
			}
		}
		if(res=="" && str.length()%2!=0)
		System.out.println(str.charAt(str.length()-1));
		else if(res=="" && str.length()%2==0)
		{
			System.out.println("Empty String");
		}
		else
		{
			if(res.charAt(res.length()-1)==str.charAt(str.length()-1))
			{
				res=res.substring(0, res.length()-1);
				if(res.length()==0)
				{
					System.out.println("Empty String");
				}
				else
				{
					System.out.println(res);
				}
			}
			else
			{
				System.out.println(res+str.charAt(str.length()-1));
			}
		}
	}
	
	public static void main(String[] args) {
		String str="baab";
		superReducedString(str);	
	}
	
}
