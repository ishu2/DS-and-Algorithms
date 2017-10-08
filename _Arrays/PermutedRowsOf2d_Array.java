package GeeksForGeeks_Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PermutedRowsOf2d_Array {
	
	public static ArrayList<Integer> findPermutedRows(int[][] arr,int k,int rows,int cols)
    {
    	if(k>=rows)
    	{
    		ArrayList<Integer> res=new ArrayList<>();
    		return res;
    	}
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<cols;i++)
	{
	    if(map.containsKey(arr[k][i]))
	    {
	        map.put(arr[k][i],map.get(arr[k][i])+1);
	    }
	    else
	    {
	        map.put(arr[k][i],i);
	    }
	}
	for(int i=0;i<rows && i!=k;i++)
	{
		int j=0;
		for(j=0;j<cols;j++)
		{
			
		}
	}
	
    }
	
	public static void main(String[] args) {
		int[][] arr={{7,1,4,2,6},
				     {3,5,9,0,8},
				     {5,4,1,2,3},
				     {1,2,6,7,4},
				     {4,6,2,1,7}};
		int row=4;
		int no_of_rows=5;
		int no_of_columns=5;
		ArrayList<Integer> res=findPermutedRows(arr,row,no_of_rows,no_of_columns);
		for(Integer i:res)
		{
			System.out.println(i);
		}
	}

}
