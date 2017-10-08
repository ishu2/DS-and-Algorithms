package January_27;

public class Question_15_FirstNonRepeatingCharacter {
	
	public static char firstNonRepeatingCharacter(String str)
	{
		if(str.length()==0)
		{
			return ' ';
		}
		int res=Integer.MAX_VALUE;
		int[] arr=new int[26];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=-1;
		}
		for(int i=0;i<str.length();i++)
		{
			int index=str.charAt(i)-'a';
			if(arr[index]==-1)
			{
				arr[index]=i;
			}
			else
			{
				arr[index]=-2;
			}
		}
		// Now , find smallest +ve value from array.
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0 && arr[i]<res)
			{
				res=arr[i];
			}
		}
		return str.charAt(res);
	}
	
    public static void main(String[] args) {
		String str="afgfkltabcglmocnn";
		char res=firstNonRepeatingCharacter(str);
		if(res==' ') 
		{
			System.out.println("either all the character are repeating or the string is null.");
		}
		else
		{
		System.out.println("first non repeating character is :"+res);
		}
	}

}
