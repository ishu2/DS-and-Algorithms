package GeeksForGeeks_BitManipulation;

public class CountTrailingZerosInABinaryNumber {
	
	public static int countTrailingZeros(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int count=0;
		while((n&1)==0)
		{
			count++;
			n=n>>1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int n=0;
		int res=countTrailingZeros(n);
		System.out.println("number of trailing zeros are :-");
		System.out.println(res);
	}

}
