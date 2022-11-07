package agacSilmeIslemi;

public class Tree {
	
	Node root;

	public Tree() {
		root=null;
	}
	
	Node newNode(int x)
	{
		root=new Node(x);
		return root;
	}
	Node insert (Node root,int x)
	{
		if (root!=null) 
		{
			if (x<root.data)
				root.left=insert(root.left, x);
			else
				root.right=insert(root.right, x);
		}
		else
			root=newNode(x);
		
		return root;
	}
	
	void inOrder(Node root)
	{
		if (root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	
	Node delete(Node root,int x)
	{
		Node t1, t2;
		if (root==null)
			return null;
		if (root.data==x)
		{
			if (root.left==root.right) //silinecek düğüm altında düğün yoksa
			{
				root=null;
				return null;
			}
			else if (root.left==null)
			{
				t1=root.right;
				return t1;
			}
			else if (root.right==null)
			{
				t1=root.left;
				return t1;
			}
			else 
			{
				t1=t2=root.right;
				
				while (t1.left!=null)
				{
					t1=t1.left;
				}
				
				t1.left=root.left;
				
				return t2;
			}
		}
		
		else
		{
			if (x<root.data)
			{
				root.left=delete(root.left,x);
			}
			else
				root.right=delete(root.right,x);
		}
		return root;
	}
}
