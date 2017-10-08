/*    1
      11
      121
      1221
      12221
 */

package Print_Patterns;

public class Pattern_6 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int  j=0;j<=i;j++)
			{
				if(j==0 || j==i)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("2");
				}
			}
			System.out.println();
		}
	}
	
}
