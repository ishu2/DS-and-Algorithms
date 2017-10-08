package January_27;

public class Question_4_PrintSubsets {
	
	public static void printSubsets(int[] arr,int[] resultSoFar)
	{
		if(arr.length==0)
		{
			for(int i:resultSoFar)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		int[] newArr=new int[arr.length-1];
		for(int i=0;i<newArr.length;i++)
		{
			newArr[i]=arr[i+1];
		}
		printSubsets(newArr,resultSoFar);
		int[] newResultSoFar=new int[resultSoFar.length+1];
		for(int i=0;i<resultSoFar.length;i++)
		{
			newResultSoFar[i]=resultSoFar[i];
		}
		newResultSoFar[newResultSoFar.length-1]=arr[0];
		printSubsets(newArr,newResultSoFar);
	}
	
	public static void main(String[] args) {
	int[] arr={1,2,3};
	int[] resultSoFar={};
	printSubsets(arr,resultSoFar);
	}

}
