package GeeksForGeeks_Arrays;

public class Rotate_Array_By_90_Degree {
	
	public static void rotateArray(int[][] arr)
	{
	  int[][] res=new int[7][4];
	  for(int i=0;i<7;i++)
	  {
		  for(int j=0;j<4;j++)
		  {
			res[i][j]=arr[4-j-1][i];  
		  }
	  }
	  for(int i=0;i<res.length;i++)
	  {
		  for(int j=0;j<res[i].length;j++)
		  {
			  System.out.print(res[i][j]+"  ");
		  }
		  System.out.println();
	  }
	}
	
	public static void main(String[] args) {
		int[][] arr={{1,2,3,4,5,6,7},
				     {8,9,10,11,12,13,14},
				     {15,16,17,18,19,20,21},
				     {22,23,24,25,26,27,28}};
		
		rotateArray(arr);
		
	}

}
