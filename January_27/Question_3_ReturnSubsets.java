package January_27;

public class Question_3_ReturnSubsets {
	
	public static int[][] returnSubsets(int[] arr,int index)
	{
		if(arr.length==index)
		{
			int[][] res={{ }};
			return res;
		}
		int[][] res=returnSubsets(arr,index+1);
		int size=res.length*2;
		int[][] finalRes=new int[size][];
		for(int i=0;i<res.length;i++)
		{
			int len=res[i].length;
			finalRes[i]=new int[len];
			for(int j=0;j<len;j++)
			{
				finalRes[i][j]=res[i][j];
			}
		}
		for(int i=0;i<res.length;i++)
		{
			int len=res[i].length+1;
			finalRes[res.length+i]=new int[len];
			finalRes[res.length+i][0]=arr[index];
			for(int j=0;j<res[i].length;j++)
			{
				finalRes[res.length+i][j+1]=res[i][j];
			}
		}
		return finalRes;
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3};
		int[][] res=returnSubsets(arr,0);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
