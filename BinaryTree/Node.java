package BinaryTree;

public class Node<T> {
	public T data;
	public Node<T> left;
	public Node<T> right;
	public Node<T> nextRight;   // Used for "connect nodes at same level " question only.
    public Node(T data)
    {
    	this.data=data;
    	left=null;
    	right=null;
    	nextRight=null;
    }
}
