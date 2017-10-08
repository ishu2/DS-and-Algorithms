package GeeksForGeeks_Strings;

public class KMP_AlgorithmForPatternSearching {
	
	public static void searchPattern(String pattern,String txt)
	{
		if(pattern.length()>txt.length())
		{
			System.out.println("Pattern is not present in the text..");
			return;
		}
		int[] arr=new int[pattern.length()];
		int i=0;
		int j=1;
		arr[0]=0;
		int k=1;
		while(j<arr.length)
		{
			if(pattern.charAt(i)==pattern.charAt(j))
			{
				arr[j]=k;
				k++;
				i++;
				j++;
			}
			else
			{
				i=0;
				arr[j]=0;
				k=1;
				j++;
			}
		}
		i=0;
		j=0;
		System.out.println("Pattern is found at indexes :-");
		while(i<txt.length())
		{
			if(pattern.length()-1==j)
			{
				System.out.println(i-j);
				j=arr[j-1];
			}
			else if(pattern.charAt(j)==txt.charAt(i))
			{
				i++;
				j++;
			}
			else if(pattern.charAt(j)!=txt.charAt(i))
			{
				
				if(j!=0)
				{
					j=arr[j-1];
				}
				else
				{
					i++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String pattern="aaba";
		String txt="aabaacaadaabaaba";
		searchPattern(pattern,txt);
	}

}
