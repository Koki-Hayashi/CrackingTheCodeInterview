package q2_2;

import java.util.HashSet;
import java.util.Set;

public class MySolution {

    public Node findKthToLast(Node head, int k) {
        if (head == null ) return new Node();

	    Node current = head;
        Node keep = head;

        int loopCount = 0;
        while(current != null) {
            if(loopCount > k  ) {
                keep = keep.getNext();
            }

            loopCount++;
            current = current.getNext();
        }


        return keep;
    }




}
