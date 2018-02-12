package practice.stack_queue.q1_1;

import java.util.LinkedList;

public class MyQueue<T> {

    LinkedList<T> stack1 = new LinkedList<>();
    LinkedList<T> stack2 = new LinkedList<>();

    public void add(T entry){
        stack1.push(entry);
    }

    public T remove(){
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }

        if (stack1.isEmpty()) {
            throw new IllegalStateException();
        }

        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }

}