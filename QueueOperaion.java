public class QueueOperaion {

	static class Queue
	{
		static int arr[];
		static int size;
		static int rear = -1;
		
		Queue(int n)
		{
			arr = new int[n];
			this.size = n;
		}
		
		public static boolean isEmpty()
		{
			return rear == -1;
		}
		
		//Queue
		public static void add(int data)
		{
			if(rear == size-1)
			{
				System.out.println("Queue is full");
			}
			
			rear++;
			arr[rear] = data;
		}
		
		//Dequeue
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Queue is empty");
				return -1;
			}
			
			int front = arr[0];
			for(int i=0; i<rear; i++)
			{
				arr[i] = arr[i+1];
			}
			rear--;
			return front;
		}
		
		//Peek 
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Queue is empty");
				return -1;
			}
			
			return arr[0];
			
		}
	}
	
	public static void main(String[] args) 
	{
		Queue q = new Queue(5);
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}	
	}

}
