package January_27;

public class Question_6_PrintSubsetsSumToK {
	
	public static void printSubsetsWhichSumToK(int[] arr,int index,int sum,int[] resultSoFar)
	{
		if(index==arr.length)
		{
			if(sum==0)
			{
				for(int i=0;i<resultSoFar.length;i++)
				{
					System.out.print(resultSoFar[i]+" ");
				}
				System.out.println();
			}
			return;
		}
		printSubsetsWhichSumToK(arr,index+1,sum,resultSoFar);
		int[] newResultSoFar=new int[resultSoFar.length+1];
		for(int i=0;i<resultSoFar.length;i++)
		{
			newResultSoFar[i]=resultSoFar[i];
		}
		newResultSoFar[newResultSoFar.length-1]=arr[index];
		printSubsetsWhichSumToK(arr,index+1,sum-arr[index],newResultSoFar);
	}
	
	public static void main(String[] args) {
		int[] arr={9,1,3,0,5,6,2,2,12};
		int[] resultSoFar={};
		int index=0;
		int sum=12;
		printSubsetsWhichSumToK(arr,index,sum,resultSoFar);
	}

}
