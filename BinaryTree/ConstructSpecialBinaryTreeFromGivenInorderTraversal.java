package BinaryTree;

public class ConstructSpecialBinaryTreeFromGivenInorderTraversal {
	
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
	
	public static Node<Integer> constructTree(int[] inorder,int f,int l)
	{
		if(f<=l)
		{
			int index=findMax(inorder,f,l);
			Node<Integer> root=new Node<>(inorder[index]);
			root.left=constructTree(inorder,f,index-1);
			root.right=constructTree(inorder,index+1,l);
			return root;
		}
		return null;
	}
	
	public static int findMax(int[] inorder,int f,int l)
	{
		int index=f;
		int max=inorder[f];
		while(f<=l)
		{
			if(inorder[f]>max)
			{
				max=inorder[f];
				index=f;
			}
			f++;
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] inorder={1,5,10,40,30,15,28,20};
		Node<Integer> root=constructTree(inorder,0,inorder.length-1);
		printInorder(root);
	}

}
