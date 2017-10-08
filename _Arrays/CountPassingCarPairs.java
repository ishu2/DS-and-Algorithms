/*
       
  A non-empty binary array A consisting of size N is given where,
  0 represents a car traveling east,
   1 represents a car traveling west. 

  The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 <= P < Q < N, is passing
  when P is traveling to the east and Q is traveling to the west. Examples: 
    Input  : arr[] = {0, 1, 0, 1, 1}
    Output : 5

      The 5 pairs are (A[0], A[1]), (A[0], A[3]), (A[0], A[4]),   
      (A[2], A[3]) and (A[3], A[4]). Note that in all pairs
      first element is 0, second element is 1 and index of
      first element is smaller than index of second element.

    Input  : arr[] = {1, 0, 0, 0, 1}
    Output : 3

    Input : arr[] = {0, 0, 1, 0, 0}
    Output : 2
 
 * */

package GeeksForGeeks_Arrays;

public class CountPassingCarPairs {

	public static void main (String[] args) {
	    int[] arr={0,0,1,0,0};
	    int one=0;
	    int res=0;
	    for(int i=arr.length-1;i>=0;i--)
	    {
	        if(arr[i]==1)
	        {
	            one++;
	        }
	        else
	        {
	            res=res+one;
	        }
	    }
	    System.out.println(res);
		}
	
}
