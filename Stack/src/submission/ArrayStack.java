package submission;

import adt.Stack;

public class ArrayStack<T> implements Stack<T> {
	private T[] data;
	private int top;
	private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 10;

	
	public ArrayStack() {
		data = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	public ArrayStack(int capacity) {
		data = (T[]) new Object[capacity];
	}
	
	@Override
	public void push(T newEntry) {
		data[top +1] = newEntry;
		top++;
	}

	@Override
	public T pop() {
		T topIndex = data[top];
		data[top] = null;
		top--;
		return topIndex;
	}

	@Override
	public T peek() {
		return data[top];
	}

	@Override
	public boolean isEmpty() {

		return top < 0;
	}

	@Override
	public void clear() {
		top = 0;
		
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
		s+= "+++++";
		return s;
	}
	public static void main(String[] args) {
		Stack<String> g = new ArrayStack<String>();
		g.push("A");
		g.push("B");
		g.push("C");
		g.push("D");		
		g.pop();
		g.peek();
		System.out.println(g);
	}

}
