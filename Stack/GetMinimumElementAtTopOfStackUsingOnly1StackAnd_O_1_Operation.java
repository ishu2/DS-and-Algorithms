//   Design a function such that we will get minimum element at the top of stack in O(N) time and to 
//   implement this function you can use only i stack.


package Stack;
import java.util.Stack;

public class GetMinimumElementAtTopOfStackUsingOnly1StackAnd_O_1_Operation {

	public static Stack getMinAtTopOfStack(Stack s)
	{
		if(s.isEmpty())
		{
			Stack res=new Stack();
			return res;
		}
		int elt=(int) s.pop();
		Stack res=getMinAtTopOfStack(s);
		putMinAtTop(res,elt);
		return res;
	}
	
	public static void putMinAtTop(Stack s,int elt)
	{
		if(s.isEmpty())
		{
			s.push(elt);
			return;
		}
		int a=(int) s.pop();
		if(a>=elt)
		{
			return;
		}
		putMinAtTop(s,elt);
		s.push(a);
		s.push(elt);
	}
	
	public static void main(String[] args) {
		int[] arr={18,19,29,15,16};
		Stack s=new Stack();
		for(int i=0;i<arr.length;i++)
		{
			s.push(arr[i]);
		}
		Stack res=getMinAtTopOfStack(s);
		while(!(res.isEmpty()))
		{
			System.out.println(res.pop());
		}
	}
	
}
