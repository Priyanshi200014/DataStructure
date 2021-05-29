import java.util.*;
import java.util.LinkedList;


class BreadthFirstTraversal
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
	
	public void levelOrder(Node root)
	{
		Queue<Node> que = new LinkedList<Node>();
		
		que.add(root);
		
		while(!que.isEmpty())
		{
			Node tempNode = que.poll();
			
			System.out.println(tempNode.data + "   ");
			
			if(tempNode.left != null )
			{
				que.add(tempNode.left);
			}
			
			if(tempNode.right != null)
			{
				que.add(tempNode.right);
			}
			
			
			
		}
		
		
		
	}
	
	public static void main(String args[])
	{
		BreadthFirstTraversal bft = new BreadthFirstTraversal();
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		bft.root = bft.createTree(bft.root , arr , 0);
		
		bft.levelOrder(bft.root);
		
	}



}
