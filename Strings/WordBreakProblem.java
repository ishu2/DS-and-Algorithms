package Strings;

public class WordBreakProblem {
	
	public static boolean checkIfValidWord(String[] arr,String str)
	{
		if(arr.length==0 || str.length()==0)
		{
			return false;
		}
		int i=0;
		while(i<arr.length && str.length()!=0)
		{
			if(arr[i].charAt(0)==str.charAt(0))
			{
				int len=arr[i].length();
				if(str.substring(0, len)==arr[i])
				{
					str=str.substring(len);
					i=0;
				}
				else
				{
					i++;
				}
			}
			else
			{
			  i++;
			}
		}
		if(str.length()==0)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String[] arr={"arrays","dynamic","heaps","ideserve","learning","linked","list","platform","programming",
				       "stacks","trees"};
	
		String str="ideservelearning";
		boolean res=checkIfValidWord(arr,str);
		System.out.println(res);
		}
	}
