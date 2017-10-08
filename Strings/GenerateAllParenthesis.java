/*   Input : 3
 *   Output :  ((())) , (()()) , (())() , ()(()) , ()()()
 * */

package Strings;

import java.util.Scanner;

public class GenerateAllParenthesis {
	

	public static void printParenthesis(int m,int n,String res,int k)
	{
		 if(res.length()==2*k)
		    {
		        System.out.println(res);
		        return;
		    }
		 if(m<k)
		 {
		     printParenthesis(m+1,n,res+'(',k);
		 }
		 if(m>n)
		 {
			 printParenthesis(m,n+1,res+")",k);
		 }
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=s.nextInt();
		printParenthesis(0,0,"",n);
	}
	
}
