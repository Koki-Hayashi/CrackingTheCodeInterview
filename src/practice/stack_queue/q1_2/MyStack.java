package practice.stack_queue.q1_2;

import java.util.LinkedList;

public class MyStack<T> {

    LinkedList<T> queue1;
    LinkedList<T> queue2;

    boolean activeQueue; // true: queue1, false: queue2

    public MyStack() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
        this.activeQueue = true;
    }

    private void toggleActiveQueue(){
        activeQueue = !activeQueue;
    }

    private LinkedList<T> getActiveQueue(){
        return activeQueue ? queue1 : queue2;
    }

    private LinkedList<T> getInactiveQueue(){
        return activeQueue ? queue2: queue1;
    }

    public void push(T entry){
        getActiveQueue().add(entry);
    }


    public T pop(){
        LinkedList<T> activeQueue = getActiveQueue();
        if (activeQueue.isEmpty()) {
            throw new IllegalStateException();
        }

        LinkedList<T> inactiveQueue = getInactiveQueue();
        while (activeQueue.size() > 1) {
            inactiveQueue.add(activeQueue.remove());
        }

        toggleActiveQueue();
        return activeQueue.remove();
    }

}