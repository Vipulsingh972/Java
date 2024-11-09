import java.util.Stack;

public class StackReverse {

	public static void pushAtBottom(int data, Stack<Integer> s) 
	{
		if(s.empty())
		{
			s.push(data);
			return;
		}
		
		int top = s.pop();
		pushAtBottom(data, s);
		s.push(top);
	}
	
	public static void reverse(Stack<Integer> s)
	{
		if(s.empty())
		{
			return;
		}
		int top = s.pop();
		reverse(s);
		pushAtBottom(top, s);
	}
	
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		reverse(s);
		
		while(!s.empty())
		{
			System.out.println(s.peek());
			s.pop();
		}

	}

}
