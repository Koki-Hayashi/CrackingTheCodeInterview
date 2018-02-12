package practice.stack_queue.q1_1;


import org.junit.Before;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class TestSolution {

    private MyQueue myQueue;

    @Before
    public void setup(){
        myQueue = new MyQueue<Integer>();
    }

    @Test(expected = IllegalStateException.class)
    public void test(){
        myQueue.remove();
    }

    @Test
    public void test2(){
        int[] entries = new int[]{0,1,2,3,4,5};

        Arrays.stream(entries).forEach(e -> myQueue.add(e));

        for (int i = 0 ; i < entries.length ; i++) {
            assertThat(myQueue.remove()).isEqualTo(entries[i]);
        }
    }

    @Test
    public void test3(){
        int[] entries1 = new int[]{0,1,2};

        Arrays.stream(entries1).forEach(e -> myQueue.add(e));

        assertThat(myQueue.remove()).isEqualTo(0);

        int[] entries2 = new int[]{3,4,5};

        Arrays.stream(entries2).forEach(e -> myQueue.add(e));

        assertThat(myQueue.remove()).isEqualTo(1);
        assertThat(myQueue.remove()).isEqualTo(2);
        assertThat(myQueue.remove()).isEqualTo(3);
        assertThat(myQueue.remove()).isEqualTo(4);
        assertThat(myQueue.remove()).isEqualTo(5);

        try {
            assertThat(myQueue.remove());
            fail("should throw an exception");
        } catch (Exception e) {
            // pass
        }
        
    }

}
