package practice.stack_queue.q1_3;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class TestSolution {

    private MyStack myStack;

    @Before
    public void setup(){
        myStack = new MyStack<Integer>(5);
    }

    @Test(expected = IllegalStateException.class)
    public void test(){
        myStack.pop();
    }

    @Test
    public void test2(){
        int[] entries = new int[]{0,1,2,3,4};

        Arrays.stream(entries).forEach(e -> myStack.push(e));

        for (int i = entries.length - 1; i >= 0; i--) {
            assertThat(myStack.pop()).isEqualTo(entries[i]);
        }
    }

    @Test
    public void test3(){
        int[] entries1 = new int[]{0,1,2};

        Arrays.stream(entries1).forEach(e -> myStack.push(e));

        assertThat(myStack.pop()).isEqualTo(2);

        int[] entries2 = new int[]{3,4,5};

        Arrays.stream(entries2).forEach(e -> myStack.push(e));

        try {
            myStack.push(6);
            fail("should throw an exception");
        } catch (Exception e) {
            // pass
        }

        assertThat(myStack.pop()).isEqualTo(5);
        assertThat(myStack.pop()).isEqualTo(4);
        assertThat(myStack.pop()).isEqualTo(3);
        assertThat(myStack.pop()).isEqualTo(1);
        assertThat(myStack.pop()).isEqualTo(0);

        try {
            assertThat(myStack.pop());
            fail("should throw an exception");
        } catch (Exception e) {
            // pass
        }
        
    }

}
