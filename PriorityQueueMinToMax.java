import java.util.*;

import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueMinToMax
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(20);
		pq.add(5);
		pq.add(2);
		pq.add(30);
		pq.add(2);
		pq.add(20);

		pq.remove(2);
		
		System.out.println("Min heap = " + pq.peek() + "    " + pq);
		
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>( new Comparator<Integer>(){
			
			public int compare(Integer a , Integer b)
			{
				return b.compareTo(a);
			}
			
		});
		//1,3,-1,-3,5,3,6,7
		
		pq1.add(1);
		pq1.add(3);
		pq1.add(-1);
		pq1.add(-3);
		pq1.add(5);
		pq1.add(3);
		pq1.add(6);
		pq1.add(7);
		
		
		 Integer ar1[] = new Integer[pq1.size()];
		 Integer arr[] = pq1.toArray(ar1);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println("Max heap = " + pq1.peek() + "    " + pq1);
		
		
		
		
	}

}