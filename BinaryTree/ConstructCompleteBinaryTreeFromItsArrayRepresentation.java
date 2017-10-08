package BinaryTree;

public class ConstructCompleteBinaryTreeFromItsArrayRepresentation {
	
	public static Node<Integer> constructCBT(int[] arr,int index)
	{
		if(index>=arr.length)
		{
			return null;
		}
		Node<Integer> l=constructCBT(arr,2*index+1);
		Node<Integer> r=constructCBT(arr,2*index+2);
		Node<Integer> root=new Node<Integer>(arr[index]);
		root.left=l;
		root.right=r;
		return root;
		
	}
	
	public static void printTree(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		printTree(root.left);
		System.out.println(root.data);
		printTree(root.right);
	}
	
	public static void main(String[] args) {
		int[] arr={10,12,15,25,30,36};
		Node<Integer> root=constructCBT(arr,0);
	    printTree(root);
	}

}
