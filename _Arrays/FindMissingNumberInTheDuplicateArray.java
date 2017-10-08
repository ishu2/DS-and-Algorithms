package GeeksForGeeks_Arrays;

public class FindMissingNumberInTheDuplicateArray {

	public static int missingNumber(int[] arr1,int[] arr2)
	{
		int xor1=0;
		int xor2=0;
		for(int i=0;i<arr1.length;i++)
		{
			xor1=xor1^arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			xor2=xor2^arr2[j];
		}
		return xor1^xor2;
	}
	
	public static void main(String[] args) {
		int[] arr1={9 ,7 ,8 ,5 ,4 ,6 ,2 ,3 ,1};
		int[] arr2={2 ,4 ,3 ,9 ,1 ,8 ,5 ,6};
		int res=missingNumber(arr1,arr2);
		System.out.println("Missing number is : "+res);
	}
	
}
