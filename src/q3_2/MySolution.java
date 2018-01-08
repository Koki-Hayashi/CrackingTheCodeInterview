package q3_2;

import java.util.LinkedList;

public class MySolution {

    private LinkedList<Integer> stack = new LinkedList<>();
    private LinkedList<Integer> minStack = new LinkedList<>();

	public synchronized void push(int value)
	{
		if (value <= min()) {
			minStack.push(value);
		}

		stack.push(value);
	}

	public synchronized int pop()
	{
		int value = stack.pop(); // throw exception when no contents is in stack
		if (value == min()) {
			minStack.pop();
		}
		return value;
	}

	public synchronized int min(){
		if (minStack.isEmpty()) {
			return Integer.MAX_VALUE; // error
	 	}

		return minStack.peek();
	}
}
