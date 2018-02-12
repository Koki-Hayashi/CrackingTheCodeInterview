package practice.stack_queue.q1_3;

public class MyStack<T> {

    T[] stack;
    int stackSize;
    int stackPointer;

    public MyStack(int stackSize) {
        this.stackSize = stackSize;
        this.stack = (T[]) new Object[stackSize];
        this.stackPointer = 0;
    }


    public void push(T entry) {
        if (stackPointer == stackSize) {
            throw new IllegalStateException("stack is full");
        }

        stack[stackPointer] = entry;
        stackPointer++;
    }

    public T pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException("stack is empty");
        }

        stackPointer--;
        return stack[stackPointer];

    }
}

