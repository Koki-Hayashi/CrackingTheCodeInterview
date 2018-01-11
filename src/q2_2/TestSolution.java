package q2_2;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution solution;

    @Before
    public void setup() {
        solution  = new MySolution();
    }


    private Node getNth(Node first, int n) {
        Node result = first;
        for (int i = 1 ; i < n ; i++) {
            result = result.getNext();

            if (result == null) {
                throw new RuntimeException(n + "th node is not existing");
            }
        }

        return result;
    }

    @Test
    public void test(){
        Node node = null;
        int k = 5;

        Node actual = solution.findKthToLast(node, k);
        assertThat(actual).isEqualTo(new Node());
    }

    @Test
    public void test2(){
        Node node = new Node(null, "1");
        int k = 5;

        Node actual = solution.findKthToLast(node, k);
        assertThat(actual).isEqualTo(node);
    }

    @Test
    public void test3(){
        Node node2 = new Node(null, "2");
        Node node = new Node(node2, "1");
        int k = 5;

        Node actual = solution.findKthToLast(node, k);
        assertThat(actual).isEqualTo(node);
    }

    @Test
    public void test4(){
        Node node3 = new Node(null, "3");
        Node node2 = new Node(node3, "2");
        Node node = new Node(node2, "1");
        int k = 5;

        Node actual = solution.findKthToLast(node, k);
        assertThat(actual).isEqualTo(node);
    }

    @Test
    public void test5(){
        Node node4 = new Node(null, "4");
        Node node3 = new Node(node4, "3");
        Node node2 = new Node(node3, "2");
        Node node = new Node(node2, "1");
        int k = 1;

        Node actual = solution.findKthToLast(node, k);
        assertThat(actual).isEqualTo(node3);
    }


}
