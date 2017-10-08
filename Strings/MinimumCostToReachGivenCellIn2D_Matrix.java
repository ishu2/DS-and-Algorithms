package Strings;

public class MinimumCostToReachGivenCellIn2D_Matrix {
	
	public static int minimumCost(int m,int n,int[][] arr)
	{
		if(m==0 && n==0)
		{
			return arr[0][0];
		}
		int[][] res=new int[4][3];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==0 && j==0)
				{
					res[i][j]=arr[i][j];
				}
				else if(i==0)
				{
					res[i][j]=arr[i][j]+res[i][j-1];
				}
				else if(j==0)
				{
					res[i][j]=arr[i][j]+res[i-1][j];
				}
				else
				{
					res[i][j]=arr[i][j]+Math.min(Math.min(res[i-1][j], res[i][j-1]), res[i-1][j-1]);
				}
			}
		}
		return res[m][n];
	}
	
	public static void main(String[] args) {
		int[][] arr={ {3,2,8},
				      {1,9,7},
				      {0,5,2},
				      {6,4,3}  };
		int m=3;
		int n=2;
		int res=minimumCost(m,n,arr);
		System.out.println("Minimum cost required to reach arr["+m+"]["+n+"] is :");
		System.out.println(res);
		
	}

}
