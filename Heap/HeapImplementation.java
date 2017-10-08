package Heap;

import java.util.ArrayList;

import java.util.Scanner;

public class HeapImplementation {
	
	static int size;
	static int[] arr;
	static int count;
	public HeapImplementation()
	{
		size=1000;
		arr=new int[size];
		count=0;
	}
	
	public static int leftChildIndex(int i)
	{
		int index=2*i+1;
		if(index>0 && index<count)
		{
			return index;
		}
		return -1;
	}
	
	public static int rightChildIndex(int i)
	{
		int index=2*i+2;
		if(index>0 && index<count)
		{
			return index;
		}
		return -1;
	}
	
	public static int parentIndex(int i)
	{
		int index=(i-1)/2;
		if(index<0)
		{
			return -1;
		}
		return index;
	}

	public static void insert()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter element you want to insert :");
		int data=s.nextInt();
		if(data==-1)
		{
			return;
		}
        if(count<size)
        {
		arr[count]=data;
		heapifyBottomToTop(count,arr);
		count++;
        }
        insert();
	}
	
	public static int delete(int count,int[] arr)
	{
		int temp=arr[0];
		arr[0]=arr[count];
		count--;
		heapifyTopToBottom(count,arr,0);
		return temp;
	}
	
	public static void heapifyBottomToTop(int count,int[] arr)
	{
		if(count==0)
		{
			return ;
		}
		int indexOfParent=parentIndex(count);
		if(indexOfParent<0)
		{
			return;
		}
		if(arr[count]<arr[indexOfParent])
		{
			int temp=arr[count];
			arr[count]=arr[indexOfParent];
			arr[indexOfParent]=temp;
		}
		heapifyBottomToTop(indexOfParent,arr);
	}
	
	public static void heapifyTopToBottom(int count,int[] arr,int i)
	{
		int leftIndex=leftChildIndex(i);
		int rightIndex=rightChildIndex(i);
		int index=-1;
		if(leftIndex!=-1 && rightIndex!=-1)
		{
			index=(arr[leftIndex]<arr[rightIndex] ? leftIndex : rightIndex);
		}
		else if(leftIndex!=-1)
		{
			index=leftIndex;
		}
		else if(rightIndex!=-1)
		{
			index=rightIndex;
		}
		if(index==-1)
		{
			return;
		}
		int temp=arr[i];
		arr[i]=arr[index];
		arr[index]=temp;
		heapifyTopToBottom(count,arr,index);
	}
	
	public static int[] returnArray()
	{
		return arr;
	}
	
	public static int size()
	{
		return count;
	}
	
	public static void printHeap(int[] arr,int count)
	{
		int i=0;
		while(i<count)
		{
			System.out.println(arr[i]);
			i++;
		}
	}
	
	
}
