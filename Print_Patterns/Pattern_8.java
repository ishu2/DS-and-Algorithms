/*
     5432*
     543*1
     54*21
     5*321
     *4321
 */

package Print_Patterns;

public class Pattern_8 {
	
	public static void main(String[] args) {
		int k=5;
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>0;j--)
			{
		       if(j==k)
		       {
		    	   System.out.print("*");
		       }
		       else
		       {
		    	   System.out.print(j);
		       }
			}
			System.out.println();
			k--;
		}
	}

}
