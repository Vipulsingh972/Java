public class LinkedListOp 
{
	Node head;
	private int size;
	
	LinkedListOp()
	{
		this.size=0;
	}
			
	
	class Node
	{
		String data; 
		Node next;
		
		Node(String data)
		{
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
	// add first node
	public void addFirst(String data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}

	// add last node
	public void addLast(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	// Print list 
	public void printlist()
	{
		if(head == null)
		{
			System.out.println("List is empty.");
			return;
		}
		Node currNode = head;
		while(currNode != null)
		{
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	//Delete first node of list 
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is epmty.");
			return;			
		}
		size--;
		
		head = head.next;
	}
	
	//Delete last node of list 
	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("List is epmty.");
			return;			
		}
		
		size--;
		if(head.next == null)
		{
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null)
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	//calculate size of list
	public int getSize()
	{
		return size;
	}
	
	
	public static void main(String[] args) 
	{
		LinkedListOp list = new LinkedListOp();
		list.addFirst("hello");
		list.addLast("vipul");
		list.addFirst("hi");
		list.printlist();
		System.out.println("Size = "+ list.getSize());
		
		list.deleteFirst();
		list.printlist();
		
		list.deleteLast();
		list.printlist();
		System.out.println("Size = "+ list.getSize());
	}

}
