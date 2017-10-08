package HackerEarth;

import java.util.Random;
import java.util.Scanner;

public class MonkAndTheBoxOfCookies {
	
	 public static void main(String args[] ) throws Exception {
	     
	     Scanner s=new Scanner(System.in);
	     int T=s.nextInt();
	     while(T>0)
	     {
	         int N=s.nextInt();
	         int[] arr=new int[N];
	         for(int i=0;i<N;i++)
	         {
	             arr[i]=s.nextInt();
	         }
	         Random random=new Random();
	             /*    int i=arr[random.nextInt(arr.length)];
	                 int j=arr[random.nextInt(arr.length)];
	                 int k=i | j;
	                 int count=0;
	                 while(((k&1)==0) && k!=0)
	                 {
	                     count++;
	                     k=k>>1;
	                 }
	                 System.out.println(count); */
	         System.out.println(arr[random.nextInt(arr.length)]);
	         System.out.println(arr[random.nextInt(arr.length)]);
	         T--;
	     }
	        
	    }

}


