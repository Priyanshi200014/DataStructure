import java.util.*;

class CreateBST
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data = d;
			left = null;
			right = null;
		}
		
	}
	
	public  Node createTree(Node root , int d)
	{
		if(root == null)
		{
			return new Node(d);
		}
		
		if(root.data > d)
		{
			if(root.left != null)
			{
				createTree(root.left,d);
			}
			else
			{
				root.left = new Node(d);
			}
		}
		else
		{
			if(root.right != null)
			{
				createTree(root.right,d);
			}
			else
			{
				root.right = new Node(d);
			}
			
		}
		
		return root;
		
	}
	
	public void inOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		inOrder(root.left);
		
		System.out.print(root.data + "  ");
		
		inOrder(root.right);
			
	}
	
	public static void main(String args[])
	{
		Node root = new Node(10);
		
		CreateBST tree = new CreateBST();
		
		root = tree.createTree(root , 7);
		root = tree.createTree(root , 3);
		root = tree.createTree(root , 17);
		root = tree.createTree(root , 20);
		root = tree.createTree(root , 4);
		root = tree.createTree(root , 13);

		tree.inOrder(root);
		
		
	}
	
	
	
}