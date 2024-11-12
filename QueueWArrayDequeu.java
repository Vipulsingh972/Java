import java.util.ArrayDeque;
import java.util.Queue;

public class QueueWArrayDequeu {

	public static void main(String[] args) 
	{
		Queue<Integer> q = new ArrayDeque<Integer>();
		
		q.add(10);
		q.add(20);
		q.add(40);
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}	
		

	}

}
