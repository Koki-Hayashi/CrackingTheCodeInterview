package q2_1;

import java.util.HashSet;
import java.util.Set;

public class MySolution {

    public Node removeDuplicated(Node head) {
        if (head == null || head.getNext() == null) return head;

        Set<String> set = new HashSet<>();

        Node current = head;
        Node previous = head;
        while (current != null) {
            if(set.contains(current.getValue())) {
                previous.setNext(current.getNext());

            } else {
                set.add(current.getValue());
                previous = current;
            }

            current = current.getNext();
        }

        return head;
    }

    public Node removeDuplicatedWithoutBuffer(Node head) {
        if (head == null || head.getNext() == null) return head;

        Node current = head;

        while (current != null) {
            Node runner = current;

            while(runner.getNext() != null) {
                Node next = runner.getNext();
                if (next.getValue().equals(current.getValue())) {
                    runner.setNext(next.getNext());
                } else {
                    runner = next;
                }
            }

            current = current.getNext();
        }

        return head;

    }




}
