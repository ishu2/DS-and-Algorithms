//  Special stack is a stack ehich has an additional property of giving minimum element in O(1).

package Stack;

public class DesignSpecialStack {
	int[] arr;
	int[] auxiliary;
	int top;
	int minTop;
	int min;
	int data;
	public DesignSpecialStack()
	{
		arr=new int[100];
		auxiliary=new int[100];
		top=-1;
		minTop=-1;
		min=Integer.MAX_VALUE;
	}
	
	public void push(int data)
	{
		if(top+1==arr.length)
		{
			System.out.println("Stack overflow..");
			return;
		}
		top+=1;
		arr[top]=data;
		minTop+=1;
		if(minTop==0 || data<auxiliary[minTop-1])
		{
			auxiliary[minTop]=data;
		}
		else
		{
			auxiliary[minTop]=auxiliary[minTop-1];
		}
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow..");
			return -1;
		}
		int temp=arr[top];
		top--;
		return temp;
	}
	
	public int getMin()
	{
		if(minTop==-1)
		{
			System.out.println("Stack underflow..");
			return Integer.MAX_VALUE;
		}
		int temp=auxiliary[minTop];
		minTop--;
		return temp;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		DesignSpecialStack s=new DesignSpecialStack();
		s.push(12);
		s.push(6);
		s.push(4);
		s.push(-2);
		s.push(11);
		s.push(23);
		s.push(-5);
		while(!s.isEmpty())
		{
			System.out.println(s.pop()+" --> "+s.getMin());
		}
	}
	

}
