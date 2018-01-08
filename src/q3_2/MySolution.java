package q3_2;

import java.util.LinkedList;

public class MySolution {

    private LinkedList<Integer> stack = new LinkedList<>();
    private LinkedList<Integer> sortedList = new LinkedList<>();

    private void insertIntoSortedList(int num){
    	if (sortedList.size() == 0) {
    		sortedList.add(num);
    		return;
	    }

    	for (int i = 0 ; i < sortedList.size() ; i++) {
    		if (sortedList.get(i) > num) {
    			sortedList.add(i, num);
    			break;
		    }
	    }
    }

    private int popFromSortedList(){
    	return sortedList.removeFirst(); // throw exception when no contents is in stack
    }

	public synchronized void push(int num)
	{
		stack.push(num);
		insertIntoSortedList(num);
	}

	public synchronized int pop()
	{
		return stack.pop(); // throw exception when no contents is in stack
	}

	public synchronized int min(){
		return popFromSortedList();
	}
}
