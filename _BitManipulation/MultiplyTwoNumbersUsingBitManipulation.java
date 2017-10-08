package GeeksForGeeks_BitManipulation;

public class MultiplyTwoNumbersUsingBitManipulation {
	
	public static int multiply(int m,int n)
	{
		if(m==0 || n==0)
		{
			return 0;
		}
		if(m==1)
		{
			return n;
		}
		if(n==1)
		{
			return m;
		}
		int res=0;
		int count=0;
		while(m!=0)
		{
			if(m%2==1)
			{
				res+=n<<count;
			}
			count++;
			m=m/2;
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		int m=25;
		int n=13;
		int res=multiply(m,n);
		System.out.println(res);
	}

}
