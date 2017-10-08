package GeeksForGeeks_Arrays;

import java.util.Scanner;

public class SmallestSubarrayWithSumGreaterThanX {
	
	public static void smallestSubarraySize(int[] A,int N,int x)
	{
	    int max=A[0];
	    int i=1;
	    int index=0;
	    while(i<N)
	    {
	        if(A[i]>max)
	        {
	            max=A[i];
	            index=i;
	        }
	        i++;
	    }
	    if(max>x)
	    {
	    	System.out.println("1");
	    	return;
	    }
	    int j=index-1;
	    int k=index+1;
	    int size=1;
	    while(j>=0 && k<N)
	    {
	        if(max+A[j]>x)
	        {
	        	max=max+A[j];
	            size++;
	            break;
	        }
	        else if(max+A[k]>x)
	        {
	        	max=max+A[k];
	            size++;
	            break;
	        }
	        else if(max+A[j]+A[k]>x)
	        {
	        	max=max+A[j]+A[k];
	            size=size+2;
	            break;
	        }
	        else
	        {
	            max=max+A[j]+A[k];
	            j=j-1;
	            k=k+1;
	        }
	    }
	    if(max>x)
	    {
	        System.out.println(size);
	    }
	    else
	    {
	        if(j>=0)
	        {
	            while(j!=0)
	            {
	                if(max+A[j]>x)
	                {
	                	max=max+A[j];
	                    size++;
	                    break;
	                }
	                else
	                {
	                    max=max+A[j];
	                    j--;
	                }
	            }
	            if(max>x)
	            {
	            System.out.println(size);
	            }
	            else
	            {
	                System.out.println(N+1);
	            }
	        }
	        else
	        {
	            while(k<N)
	            {
	                if(max+A[k]>x)
	                {
	                	max=max+A[k];
	                    size++;
	                    break;
	                }
	                else
	                {
	                    max=max+A[k];
	                    k=k+1;
	                }
	            }
	            if(max>x)
	            {
	                System.out.println(size);
	            }
	            else
	            {
	                System.out.println(N+1);
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		while(T>0)
		{
		    int N=s.nextInt();
		    int x=s.nextInt();
		    int[] A=new int[N];
		    for(int i=0;i<N;i++)
		    {
		        A[i]=s.nextInt();
		    }
		    smallestSubarraySize(A,N,x);
		    T--;
		}
	}

}
