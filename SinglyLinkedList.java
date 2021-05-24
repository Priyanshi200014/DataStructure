import java.util.*;

class LinkedList
{
	class Nodes  							
	{
		int data;
		Nodes next;
	
	}

	public Nodes createList(int n)
	{
		Nodes head = new Nodes();			// for storing reference of first node 
		Nodes temp = new Nodes();
		int val = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < n ; i++)
		{
			Nodes ptr = new Nodes();		// Single Node 
			System.out.print("Enter data for "+(i+1)+" node = ");
			val = sc.nextInt();
			
			ptr.data = val;
			ptr.next = null;
			
			if(i == 0)
			{
				head = ptr;
			}
			else
			{
				temp.next = ptr;			// Linking previous node with the current one 
			}
			
			temp = ptr;				

			
		}
		
		return head;
		
	}

	public void displayList(Nodes head)
	{
		Nodes temp = head;
		
		System.out.println("Linked List : ");
		
		while(temp != null)
		{
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
		
		System.out.println();
		
	}
	
	public void deleteNode(int val , Nodes head)
	{
		Nodes temp = head;
		Nodes temp1 = temp.next;
		
		boolean node_deleted = false;
		
		if(temp.data == val)			// checking head.data 
		{
			head = temp.next;
			node_deleted = true;
		}
		else
		{									// temp is previous node and temp1 is current node 
			while(temp1 != null)
			{
				if(temp1.data == val)
				{
					temp.next = temp1.next;		 	// pointing previous node to the next of the current node
					node_deleted = true;
					break;
				}
				
				temp = temp.next;
				temp1 = temp1.next;
				
			}
			
		}
		
		
		
		if(node_deleted)
		{
			System.out.println("Node Deleted !!!");
			displayList(head);
		}
		else
		{
			System.out.println("Value Not Found");
		}
		
		
	}

}


class SinglyLinkedList
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of Linked List : ");
		
		int n = sc.nextInt();
		
		LinkedList list1 = new LinkedList();
		
		LinkedList.Nodes head1 = list1.createList(n);			// OR list1.displayList(list1.createList(n));
		
		list1.displayList(head1);
		
		
		System.out.println("Enter Node's Value that you want to delete : ");
		
		int delVal =  sc.nextInt();
		
		list1.deleteNode(delVal,head1);
		
	}
	
}