package Matrix_2dArrays;

public class PrintMatrixDiagonally {

	public static void main(String[] args) {
		int[][] arr={{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}};
		printDiagonally(arr,4,5);
	}
	
	public static void printDiagonally(int[][] arr,int m,int n)
	{
		if(arr.length==0)
			return;
		int i=0;
		int j=0;
		int k=0;
		while(i<m)
		{
			k=i;
			j=0;
			while(k>=0 && j<n)
			{
				System.out.print(arr[k][j]+" ");
				k--;
				j++;
			}
			System.out.println();
			i++;
		}
		j=1;
		while(j<n)
		{
			k=j;
			i=m-1;
			while(i>=0 && k<n)
			{
				System.out.print(arr[i][k]+" ");
				i--;
				k++;
			}
			System.out.println();
			j++;
		}
	}
	
}
