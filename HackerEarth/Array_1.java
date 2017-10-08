package HackerEarth;

import java.util.Scanner;

public class Array_1 {
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        int Q=s.nextInt();
	        int[] arr=new int[N];
	        for(int i=0;i<N;i++)
	        {
	            arr[i]=s.nextInt();
	        }
	        int i=0;
	        int res=0;
	        int q1=1;
	        int q2=0;
	        while(i<Q)
	        {
	            int query=s.nextInt();
	            if(query==q1)
	            {
	              int X=s.nextInt();
	              if(arr[X-1]==1)
	              {
	                arr[X-1]=0;
	              }
	              else
	              {
	                  arr[X-1]=1;
	              }
	            }
	            else
	            {
	              int L=s.nextInt();
	              int R=s.nextInt();
	              int k=L-1;
	              while(L-1<R-1)
	              {
	                res+=arr[L-1]*Math.pow(2,k);
	                L++;
	                k--;
	              }
	            }
	            i++;    
	        }
	        if(res%2==0)
	        {
	            System.out.println("EVEN");
	        }
	        else
	        {
	            System.out.println("ODD");
	        }

	}

}
