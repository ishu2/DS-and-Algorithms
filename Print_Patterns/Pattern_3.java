/*

       1
      232
     34543
    4567654
   567898765

*/
package Print_Patterns;

public class Pattern_3 {
	
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++)
		{
			k=i;
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			k=k-1;
			for(int j=1;j<i;j++)
			{
				k--;
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
