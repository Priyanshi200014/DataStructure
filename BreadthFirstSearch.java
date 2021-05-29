import java.util.*;
import java.util.LinkedList;

class BreadthFirstSearch
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
	int level = 0;
	
	public Node createTree(Node root1 , int arr[] , int ind)
	{
		if(ind < arr.length)
		{
			Node temp = new Node(arr[ind]);
			root1 =temp;
			root1.left = createTree(root1.left , arr , 2 * ind + 1);
			root1.right = createTree(root1.right , arr , 2 * ind + 2);
			
		}
		
		return root1;
		
	}
	
	public int getLevelOrder(Node root, int key , int level)
	{
		if(root == null)
		{
			return 0;
		}
		
		if(root.data == key)
		{
			return level;
		}
		
		int result = getLevelOrder(root.left , key , level + 1);
		
		if(result != 0)
		{
			return result;
		}
		
		result = getLevelOrder(root.right , key , level + 1);
		
		return result;	
		
	}
	
	
	public static void main(String args[])
	{
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		
		int arr[] = { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 9, 1};
		
		bfs.root = bfs.createTree(bfs.root , arr , 0);
		
		//bfs.levelOrder(bfs.root , 6);
		
		//bfs.root.left.left.left.left = new Node(10);
		
		System.out.println("level = " + bfs.getLevelOrder(bfs.root , 9 , 0));
		
		
	}

}