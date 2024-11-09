import java.util.*;

class StackWithArraylist 
{
	static class Stack 
	{
		static ArrayList<Integer> list = new ArrayList<Integer>();
		
		public static boolean isEmpty()
		{
			return list.size() == 0;
		}
		
		public static void push(int data) 
		{
			list.add(data);
		}
		
		public static int pop() 
		{
			int top = list.get(list.size()-1);
			if(isEmpty())
			{
				return 1;
			}
			
			list.remove(list.size()-1);
			return top;		
		}
		
		public static int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			
			return list.get(list.size()-1);
		}
		
	}
	

	public static void main(String[] args) 
	{
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}


	}

}
