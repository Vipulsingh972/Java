public class StackWithLL 
{	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	static class Stack 
	{
		public static Node head;
		
		public static boolean isempty()
		{
			return head == null;
		}
		
		public static void push(int data)
		{
			Node newNode = new Node(data);
			
			if(isempty())
			{
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		public static int pop()
		{
			int top = head.data;
			if(isempty())
			{
				return -1;
			}
			
			head = head.next;
			return top;
		}
		
		public static int peek()
		{
			if(isempty())
			{
				return -1;
			}
			
			return head.data;
		}
		
	}

	public static void main(String[] args) 
	{
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		while(!s.isempty())
		{
			System.out.println(s.peek());
			s.pop();
		}

	}

}
