/*  A Cullen Number is a number of the form is 2n * n + 1 where n is an integer. The first few Cullen 
     numbers are 1, 3, 9, 25, 65, 161, 385, 897, 2049, 4609 . . . . . .                               */

package GeeksForGeeks_Arrays;

public class FindCullenNumber {
	
	 public static int powerOfTwo(int n)
	    {
	        if(n==0)
	        {
	            return 1;
	        }
	        if(n==1)
	        {
	            return 2;
	        }
	        int p=powerOfTwo(n/2);
	        if(n%2==0)
	        {
	            return p*p;
	        }
	        else{
	            return p*p*2;
	        }
	    }
	    
		public static void main (String[] args) {
			int n=5;
			int pow=powerOfTwo(n);
			int res=(pow*n)+1;
			System.out.println(res);
		}

}
