package Stack;

public class Implement2StacksIn1Array {
	
	int lowerIndex;
	int higherIndex;
	int size;
	int[] arr;
	Implement2StacksIn1Array()
	{
		size=20;
		lowerIndex=-1;
		higherIndex=20;
		arr=new int[20];
	}
	
	public  boolean isEmpty()
	{
		return (lowerIndex+1!=higherIndex);
	}
	
	public void pushInStack1(int data)
	{
		if(lowerIndex+1==higherIndex)
		{
			System.out.println("Stack overflow..");
			return;
		}
		lowerIndex+=1;
		arr[lowerIndex]=data;
	}
	
	public void pushInStack2(int data)
	{
		if(lowerIndex+1==higherIndex)
		{
			System.out.println("Stack overflow..");
			return;
		}
		higherIndex-=1;
		arr[higherIndex]=data;
	}
	
	public int popFromStack1()
	{
		if(lowerIndex<0)
		{
			System.out.println("Stack underflow..");
			return -1;
		}
		int res=arr[lowerIndex];
		lowerIndex-=1;
		return res;
	}
	
	public int popFromStack2()
	{
		if(higherIndex>=arr.length)
		{
			System.out.println("Stack underflow..");
			return -1;
		}
		int res=arr[higherIndex];
		higherIndex+=1;
		return res;
	}
	
	public int peekOfStack1()
	{
		if(lowerIndex<0)
		{
			System.out.println("Stack underflow..");
			return -1;
		}
		return arr[lowerIndex];
	}
	
	public int peekOfStack2()
	{
		if(higherIndex>=arr.length)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		return arr[higherIndex];
	}
	
	
	
}
