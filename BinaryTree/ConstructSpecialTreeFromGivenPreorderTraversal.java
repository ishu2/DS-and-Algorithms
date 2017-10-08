package BinaryTree;

public class ConstructSpecialTreeFromGivenPreorderTraversal {

	public static void printInorder(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);
	}
	
	static int i=0;
	
	public static Node<Integer> constructTree(int[] preorder,char[] isLeaf)
	{
		if(i<preorder.length)
		{
			Node<Integer> root=new Node<>(preorder[i]);
			if(isLeaf[i]=='L')
			{
				return root;
			}
			i+=1;
			root.left=constructTree(preorder,isLeaf);
			i+=1;
			root.right=constructTree(preorder,isLeaf);
			return root;
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] preorder={10,30,20,5,15};
		char[] isLeaf={'N','N','L','L','L'};
		Node<Integer> root=constructTree(preorder,isLeaf);
		printInorder(root);
	}
	
}
