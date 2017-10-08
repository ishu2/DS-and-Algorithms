package GeeksForGeeks_BitManipulation;

public class Find2MissingNumbersFromNDistinctNumbers {

	public static void main(String[] args) {
		int[] arr={3,4,5,6,7};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int n=arr.length+2;
		int s=n*(n+1)/2;
		int diff=s-sum;
		int avg=diff/2;
		int s1=0;
		int i=0;
		while(arr[i]<=avg)
		{
			s1=s1+arr[i];
			i++;
		}
		int s2=avg*(avg+1)/2;
		int res=s2-s1;
		System.out.println("1st missing no. = "+res);
		res=res+sum;
		res=s-res;
		System.out.println("2nd missing no. = "+res);
		
	}
	
}
