package Heap;

public class HeapUse {
	
	public static void main(String[] args) {
		HeapImplementation heap=new HeapImplementation();
		heap.insert();
		int[] arr=heap.returnArray();
		int size=heap.size();
		while(size>0)
		{
			System.out.println(heap.delete(size-1, arr));
			size--;
		}
	}

}
