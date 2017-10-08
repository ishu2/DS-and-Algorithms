package Stack;

import java.util.Stack;

public class StockSpanProblem {
	
	public static int[] findSpans(int[] arr)
	{
		if(arr.length==0)
		{
			int[] res=null;
			return res;
		}
		if(arr.length==1)
		{
			int[] res=new int[1];
			res[0]=1;
			return res;
		}
		Stack s=new Stack();
		int[] res=new int[arr.length];
		res[0]=1;
		s.push(0);
		for(int i=1;i<arr.length;i++)
		{
			int index=(int) s.pop();
			while(arr[i]>arr[index] && !(s.isEmpty()))
			{
				index=(int) s.pop();
			}
			if(arr[i]>arr[index])
			{
				s.push(index);
				res[i]=i-index+1;
			}
			else
			{
			s.push(index);
			res[i]=i-index;
			}
			s.push(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr={10,4,5,90,120,80};
		int[] res=findSpans(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

}
