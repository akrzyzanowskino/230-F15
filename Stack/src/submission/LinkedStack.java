package submission;

import adt.Stack;

public class LinkedStack<T> implements Stack<T> {
	private Node top;
	
	@Override
	public void push(T newEntry) {
		Node newNode = new Node(newEntry, top);
		top = newNode;
	}

	@Override
	public T pop() {
		T topNode = peek();
		assert top != null;
		top = top.next;
		return topNode;
		
	}

	@Override
	public T peek() {
		return top.data;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void clear() {
		top = null;
		
	}
	
	public String toString() {
		String s = "";
		for (Node n = top; n != null; n = n.next)
			s += "| " + n.data + " |\n";
		s+= "+++++\n";
		return s;
	}
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node
	
	public static void main(String[] args){
	LinkedStack<String> g = new LinkedStack<String>();
	g.push("A");
	g.push("B");
	g.push("C");
	g.pop();
	System.out.println(g);
	}
}
