package GeeksForGeeks_LinkedLists;

public class Node<T> {
	int data;
	Node<T> next;
	Node<T> arbitrary;  // used only in arbitrary pointer wala question
	Node(int data)
	{
		this.data=data;
		next=null;
		arbitrary=null;
	}

}
