import java.util.*;

class ArrayToBinaryTree
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
	
	Node root;
	
	public  Node createTree(Node root , int arr[] , int ind)
	{
		if(ind < arr.length)
		{
			Node temp = new Node(arr[ind]);
			root = temp;
			root.left = createTree(root.left , arr , 2 * ind + 1);
			root.right = createTree(root.right , arr , 2 * ind + 2);
		
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
		int grid[][] = {{1, 2, 3} , 
						{4, 5, 6} , 
						{7, 8, 9}
						};
						
						
		int arr[] = new int[grid.length * grid.length];
		
		int k = 0 ;
		
		for(int i = 0; i < grid.length ; i++)
		{
			for(int j = 0 ; j < grid.length ; j++)
			{
				arr[k] = grid[i][j];
				k++;
			}
		
		}
		
		
				
		ArrayToBinaryTree tree = new ArrayToBinaryTree();
		
		tree.root = tree.createTree(tree.root , arr , 0);

		tree.inOrder(tree.root);
		
		
	}
	
	
	
}