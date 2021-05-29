import java.util.*;

class PriorityQueueTrial
{
	static int heap[];
	static int max;
	static int size = 0;
	
	
	public static void main(String args[])
	{
		PriorityQueueTrial pq = new PriorityQueueTrial();
		
		max = 10;
		heap = new int[max+1];
		
		heap[0] = Integer.MAX_VALUE;
		
		pq.insert(1);
		pq.insert(3);
		pq.insert(-1);
		pq.insert(-3);
		
			
		
			
		System.out.println(Arrays.toString(heap));		
			
		System.out.println(pq.extractMax());
		
		System.out.println(pq.extractMax());
		
		System.out.println(pq.extractMax());

		System.out.println(pq.extractMax());


		for(int  i = 0 ; i < size ; i++)
		{
			System.out.print(heap[i] + "  ");
		}
		
		
		System.out.println(Arrays.toString(heap));		

		
	}
	
	public void insert(int ele)
	{
		size++;
		heap[size] = ele;
		int current = size;
		while(heap[current] > heap[parent(current)])
		{
			swap(current,parent(current));
			current = parent(current);
		}
	}
	
	public int extractMax()
	{
		int pop = heap[1];
		heap[1] = heap[size--];
		maxHeapify(1);
		return pop;
	}
	
	public void maxHeapify(int pos)
	{
		if(isLeaf(pos))
			return;
		
		if(heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)])  
		{
			if(heap[leftChild(pos)] > heap[rightChild(pos)])
			{
				swap(pos,leftChild(pos));
				maxHeapify(leftChild(pos));
			}
			else
			{
				swap(pos,rightChild(pos));
				maxHeapify(rightChild(pos));
			}
			
		}
			
		
	}
	
	public int leftChild(int pos)
	{
		return pos * 2;
	}
	
	public int rightChild(int pos)
	{
		return (pos * 2) + 1;
	}
	
	
	public boolean isLeaf(int pos)
	{
		if( (size == 0) || ( pos > size/2 && pos <= size ) )
			return true;
		
		return false;
	}
	
	public void swap(int a , int b)
	{
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	public int parent(int pos)
	{
		return pos/2;
	}
	

}