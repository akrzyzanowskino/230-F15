package submission;

import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	private T[] data;
	private int head, tail = 0;
	private static final int DEFAULT_CAPACITY = 10;
	
	public ArrayQueue() {
		data = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	public ArrayQueue(int capacity) {
		data = (T[]) new Object[capacity];
	}
	
	
	@Override
	public void enqueue(T newEntry) {
		tail = (tail +1) % data.length;
		data[tail] = newEntry;
		
	}

	@Override
	public T dequeue() {
		T front = data[head];
		data[head] = null;
		head = (head + 1) % data.length;
		return front;
	}

	@Override
	public T peek() {
		return data[head];
	}

	@Override
	public boolean isEmpty() {
		return head == ((tail + 1) % data.length);
	}

	@Override
	public void clear() {
		head = 0;
		tail = data.length -1;
		
	}
	
	public String toString() {
		String s = "";
		if (!isEmpty())
			s = data[head].toString();
		for (int i =  (head+1) % data.length; 
				 i <= (tail + data.length) % data.length; 
				 i =  (i + 1) % data.length)
			s += " -> " + data[i];
		s+= "\n";
		return s;
	}
	
	public static void main(String[] args) {
		Queue<String> line = new ArrayQueue<String>();
		line.enqueue("C");
		line.enqueue("D");
		line.dequeue();
		line.peek();
		System.out.println(line);
	}

}
