package q4_1;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution solution;

    @Before
    public void setup() {
        solution = new MySolution();
    }

    @Test
    public void test1(){
        Node from = null;
        Node to = new Node();

        assertThat(solution.findPathByDFSRecursive(from, to)).isFalse();
        assertThat(solution.findPathByDFSStack(from, to)).isFalse();
        assertThat(solution.findPathByBFS(from, to)).isFalse();
    }

    @Test
    public void test2(){
        Node from = new Node();
        Node to = null;

        assertThat(solution.findPathByDFSRecursive(from, to)).isFalse();
        assertThat(solution.findPathByDFSStack(from, to)).isFalse();
        assertThat(solution.findPathByBFS(from, to)).isFalse();
    }

    @Test
    public void test3(){
        Node from = new Node(1, null);
        Node to = new Node(2, new Node[0]);

        assertThat(solution.findPathByDFSRecursive(from, to)).isFalse();
        assertThat(solution.findPathByDFSStack(from, to)).isFalse();
        assertThat(solution.findPathByBFS(from, to)).isFalse();
    }

    @Test
    public void test4(){
        Node from = new Node(1, new Node[0]);
        Node to = new Node(2, null);

        assertThat(solution.findPathByDFSRecursive(from, to)).isFalse();
        assertThat(solution.findPathByDFSStack(from, to)).isFalse();
        assertThat(solution.findPathByBFS(from, to)).isFalse();
    }

    @Test
    public void test5(){
        Node from = new Node(1, new Node[0]);
        Node to = new Node(2, new Node[0]);

        assertThat(solution.findPathByDFSRecursive(from, to)).isFalse();
        assertThat(solution.findPathByDFSStack(from, to)).isFalse();
        assertThat(solution.findPathByBFS(from, to)).isFalse();
    }

    // node1(from) -> node2(to)
    @Test
    public void test6(){
        Node node2 = new Node(2, new Node[0]);
        Node node1 = new Node(1, new Node[]{node2});

        assertThat(solution.findPathByDFSRecursive(node1, node2)).isTrue();
        assertThat(solution.findPathByDFSStack(node1, node2)).isTrue();
        assertThat(solution.findPathByBFS(node1, node2)).isTrue();
    }

    // node1(from) -> node2 -> node3(to)
    @Test
    public void test7(){
        Node node3 = new Node(3, new Node[0]);
        Node node2 = new Node(2, new Node[]{node3});
        Node node1 = new Node(1, new Node[]{node2});

        assertThat(solution.findPathByDFSRecursive(node1, node3)).isTrue();
        assertThat(solution.findPathByDFSStack(node1, node3)).isTrue();
        assertThat(solution.findPathByBFS(node1, node3)).isTrue();
    }

    // node1(from) -> node2
    //             -> node3(to)
    @Test
    public void test8(){
        Node node3 = new Node(3, new Node[0]);
        Node node2 = new Node(2, new Node[0]);
        Node node1 = new Node(1, new Node[]{node2, node3});

        assertThat(solution.findPathByDFSRecursive(node1, node3)).isTrue();
        assertThat(solution.findPathByDFSStack(node1, node3)).isTrue();
        assertThat(solution.findPathByBFS(node1, node3)).isTrue();
    }

    // node1(from) -> node2 -> node4
    //             -> node3 -> node5
    //                      -> node6
    //             -> node7 -> node8 (to)
    //             -> node9
    @Test
    public void test9(){
        Node node9 = new Node(9, new Node[0]);
        Node node8 = new Node(8, new Node[0]);
        Node node7 = new Node(7, new Node[]{node8});
        Node node6 = new Node(6, new Node[0]);
        Node node5 = new Node(5, new Node[0]);
        Node node4 = new Node(4, new Node[0]);
        Node node3 = new Node(3, new Node[]{node5, node6});
        Node node2 = new Node(2, new Node[]{node4});
        Node node1 = new Node(1, new Node[]{node2, node3, node7, node9});

        assertThat(solution.findPathByDFSRecursive(node1, node8)).isTrue();
        assertThat(solution.findPathByDFSStack(node1, node8)).isTrue();
        assertThat(solution.findPathByBFS(node1, node8)).isTrue();
    }

    // node1 -> node2(from) -> node4
    //       -> node3       -> node5
    //                      -> node6
    //       -> node7       -> node8 (to)
    //       -> node9
    @Test
    public void test10(){
        Node node9 = new Node(9, new Node[0]);
        Node node8 = new Node(8, new Node[0]);
        Node node7 = new Node(7, new Node[]{node8});
        Node node6 = new Node(6, new Node[0]);
        Node node5 = new Node(5, new Node[0]);
        Node node4 = new Node(4, new Node[0]);
        Node node3 = new Node(3, new Node[]{node5, node6});
        Node node2 = new Node(2, new Node[]{node4});
        Node node1 = new Node(1, new Node[]{node2, node3, node7, node9});

        assertThat(solution.findPathByDFSRecursive(node2, node8)).isFalse();
        assertThat(solution.findPathByDFSStack(node2, node8)).isFalse();
        assertThat(solution.findPathByBFS(node2, node8)).isFalse();
    }

    //                  -<---<---<---<-
    //                  |             |
    // node1(from) -> node2 -> node4 -|
    //    |
    //    |-<---<---<---<
    //                  |
    //             -> node3 -> node5
    //                      -> node6
    //             -> node7 -> node8 (to)
    //             -> node9
    @Test
    public void test11(){
        Node node9 = new Node(9, new Node[0]);
        Node node8 = new Node(8, new Node[0]);
        Node node7 = new Node(7, new Node[]{node8});
        Node node6 = new Node(6, new Node[0]);
        Node node5 = new Node(5, new Node[0]);
        Node node4 = new Node(4, new Node[0]);
        Node node3 = new Node(3, new Node[0]);
        Node node2 = new Node(2, new Node[]{node4});
        Node node1 = new Node(1, new Node[]{node2, node3, node7, node9});

        node4.children = new Node[]{node2};
        node3.children = new Node[]{node1, node5, node6};

        assertThat(solution.findPathByDFSRecursive(node1, node8)).isTrue();
        assertThat(solution.findPathByDFSStack(node1, node8)).isTrue();
        assertThat(solution.findPathByBFS(node1, node8)).isTrue();
    }



}
