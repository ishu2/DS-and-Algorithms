/*
 * 1
   11
   202
   3003
   40004
 * 
 */

package Print_Patterns;

public class Pattern_5 {

	public static void main(String[] args) {
		System.out.println(1);
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				if(j==i+1 || j==1)
				{
					System.out.print(k);
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
			k++;
		}
	}
	
}
