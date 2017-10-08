package GeeksForGeeks_Strings;

import java.util.Stack;

public class NormalizeThePathOfFile {
	
	public static void main(String[] args) {
		String str="/a/b/c/../../file.txt";
		String res=func(str);
		System.out.println("Result = "+res);
	}
	
	public static String func(String str)
	{
		String[] arr=str.split("/");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		Stack<String> s=new Stack<>();
		int i=0;
		while(i<arr.length)
		{
			if(!arr[i].equals(".."))
				s.push(arr[i]);
			else if(arr[i].equals("..") && !s.isEmpty())
				s.pop();
			else
				return null;
			i++;
		}
		if(s.isEmpty())
				return null;
		String res="";
		while(!s.isEmpty())
			res="/"+s.pop()+res;
		return res;
	}

}
