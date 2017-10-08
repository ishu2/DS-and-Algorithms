package Stack;

import java.util.Scanner;

public class UseOf2StacksIn1Array {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Implement2StacksIn1Array stack=new Implement2StacksIn1Array();
		for(int i=0;i<15;i++)
		{
			stack.pushInStack1(i);
		}
		for(int i=0;i<10;i++)
		{
			stack.pushInStack2(i);
		}
		System.out.println();
		System.out.println("Stack 1 content is :");
		while(stack.lowerIndex!=-1)
		{
			System.out.println(stack.popFromStack1());
		}
		System.out.println("stack 2 content is :");
		while(stack.higherIndex!=20)
		{
			System.out.println(stack.popFromStack2());
		}
		
	}

}
