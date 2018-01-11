package q2_1;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution solution;

    @Before
    public void setup() {
        solution = new MySolution();
    }


    private Node getNth(Node first, int n) {
        Node result = first;
        for (int i = 1; i < n; i++) {
            result = result.getNext();

            if (result == null) {
                throw new RuntimeException(n + "th node is not existing");
            }
        }

        return result;
    }

    private int getListLength(Node first) {
        int counter = 1;
        Node previous = first;
        while (previous.getNext() != null) {
            counter++;
            previous = previous.getNext();
        }

        return counter;
    }

    @Test
    public void test_removeDuplicated() {
        Node node = null;

        Node actual = solution.removeDuplicated(node);
        assertThat(actual).isNull();
    }

    @Test
    public void test_removeDuplicated_2() {
        Node node = new Node(null, "");

        Node actual = solution.removeDuplicated(node);
        assertThat(getListLength(actual)).isEqualTo(1);
        assertThat(getNth(actual, 1).getValue()).isEqualTo("");
    }

    @Test
    public void test_removeDuplicated_3() {
        Node node2 = new Node(null, "aaa");
        Node node = new Node(node2, null);

        Node actual = solution.removeDuplicated(node);
        assertThat(getListLength(actual)).isEqualTo(2);
        assertThat(getNth(actual, 1).getValue()).isNull();
        assertThat(getNth(actual, 2).getValue()).isEqualTo("aaa");
    }

    @Test
    public void test_removeDuplicated_4() {
        Node node3 = new Node(null, "aaa");
        Node node2 = new Node(node3, "aaa");
        Node node = new Node(node2, "aaa");

        Node actual = solution.removeDuplicated(node);
        assertThat(getListLength(actual)).isEqualTo(1);
        assertThat(getNth(actual, 1).getValue()).isEqualTo("aaa");
    }

    @Test
    public void test_removeDuplicated_5() {
        Node node5 = new Node(null, "bbb");
        Node node4 = new Node(node5, "aaa");
        Node node3 = new Node(node4, "ccc");
        Node node2 = new Node(node3, "bbb");
        Node node = new Node(node2, "aaa");

        Node actual = solution.removeDuplicated(node);
        assertThat(getListLength(actual)).isEqualTo(3);
        assertThat(getNth(actual, 1).getValue()).isEqualTo("aaa");
        assertThat(getNth(actual, 2).getValue()).isEqualTo("bbb");
        assertThat(getNth(actual, 3).getValue()).isEqualTo("ccc");
    }

    @Test
    public void test_removeDuplicatedWithoutBuffer() {
        Node node = null;

        Node actual = solution.removeDuplicatedWithoutBuffer(node);
        assertThat(actual).isNull();
    }

    @Test
    public void test_removeDuplicatedWithoutBuffer_2() {
        Node node = new Node(null, "");

        Node actual = solution.removeDuplicatedWithoutBuffer(node);
        assertThat(getListLength(actual)).isEqualTo(1);
        assertThat(getNth(actual, 1).getValue()).isEqualTo("");
    }

    @Test
    public void test_removeDuplicatedWithoutBuffer_3() {
        Node node2 = new Node(null, "aaa");
        Node node = new Node(node2, null);

        Node actual = solution.removeDuplicatedWithoutBuffer(node);
        assertThat(getListLength(actual)).isEqualTo(2);
        assertThat(getNth(actual, 1).getValue()).isNull();
        assertThat(getNth(actual, 2).getValue()).isEqualTo("aaa");
    }

    @Test
    public void test_removeDuplicatedWithoutBuffer_4() {
        Node node3 = new Node(null, "aaa");
        Node node2 = new Node(node3, "aaa");
        Node node = new Node(node2, "aaa");

        Node actual = solution.removeDuplicatedWithoutBuffer(node);
        assertThat(getListLength(actual)).isEqualTo(1);
        assertThat(getNth(actual, 1).getValue()).isEqualTo("aaa");
    }

    @Test
    public void test_removeDuplicatedWithoutBuffer_5() {
        Node node5 = new Node(null, "bbb");
        Node node4 = new Node(node5, "aaa");
        Node node3 = new Node(node4, "ccc");
        Node node2 = new Node(node3, "bbb");
        Node node = new Node(node2, "aaa");

        Node actual = solution.removeDuplicatedWithoutBuffer(node);
        assertThat(getListLength(actual)).isEqualTo(3);
        assertThat(getNth(actual, 1).getValue()).isEqualTo("aaa");
        assertThat(getNth(actual, 2).getValue()).isEqualTo("bbb");
        assertThat(getNth(actual, 3).getValue()).isEqualTo("ccc");
    }

}
