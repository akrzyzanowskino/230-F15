package submission;

import LinkedQueue.Node;
import adt.Queue;

public class LinkedQueue<T> implements Queue<T> {
	private Node head, tail;
	
	@Override
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, head);
		head = newNode;
	}

	@Override
	public T dequeue() {
		assert head != null;
		head = head.next;
		return head.data;
	}

	@Override
	public T peek() {
		return head.data;
	}

	@Override
	public boolean isEmpty() {
		return (head == null) && (tail ==null);
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
	}
	
	public String toString() {
		String s = head.data.toString();
		for (Node i = head.next; i != null; i = i.next)
			s += " -> " + i.data;
		s+= "\n";
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
		LinkedQueue<String> a = new LinkedQueue<String>();
		a.enqueue("1");
		a.enqueue("2");
		a.enqueue("3");
		a.enqueue("4");
		a.dequeue();
		System.out.println(a);
	}
}
