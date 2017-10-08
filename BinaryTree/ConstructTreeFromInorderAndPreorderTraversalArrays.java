package BinaryTree;

public class ConstructTreeFromInorderAndPreorderTraversalArrays {

	public static void printInorder(Node<Character> root)
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
	
	public static Node<Character> constructTree(char[] preorder,char[] inorder,int f,int l)
	{
		if(i<preorder.length && f<=l)
		{
		  int index=index(inorder,f,l,preorder[i]);
		  Node<Character> root=new Node<>(inorder[index]);
		  i+=1;
		  root.left=constructTree(preorder,inorder,f,index-1);
		  root.right=constructTree(preorder,inorder,index+1,l);
		  return root;
		}
		return null;
	}
	
	public static int index(char[] inorder,int f,int l,int val)
	{
		while(f<=l)
		{
			if(inorder[f]==val)
			{
				return f;
			}
			f++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		char[] inorder={'d','b','e','a','f','c'};
		char[] preorder={'a','b','d','e','c','f'};
		Node<Character> root=constructTree(preorder,inorder,0,inorder.length-1);
		printInorder(root);
	}
	
}
