/*
       11111
       0000
       111
       00
       1
 */

package Print_Patterns;

public class Pattern_9 {

	public static void main(String[] args) {
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(i%2!=0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	
}
