package BinaryTree;

public class CreateCompleteBinaryTreeFromLinkedListRepresentation {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(12);
		list.add(15);
		list.add(25);
		list.add(30);
		list.add(36);
		Node<Integer> root=constructCBT(list);
		printTree(root);
	}
	
	public static Node<Integer> constructCBT(LinkedList<Integer> list)
	{
		if(list==null)
		{
			return null;
		}
		
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
	
}
