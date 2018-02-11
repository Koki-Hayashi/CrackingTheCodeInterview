package practice.linkedList.q1_2;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution
{

    private MySolution solution = new MySolution();

    @Before
    public void setup() {
        //
    }

    @Test(expected = IllegalArgumentException.class)
    public void test(){
        solution.merge(null, null);
    }

    @Test
    public void test2(){
        Node result = solution.merge(new Node(1), null);
        assertThat(solution.traversal(result)).isEqualTo("1");
    }

    @Test
    public void test3(){
        Node n1_a = new Node(1);

        Node n1_b = new Node(2);

        Node result = solution.merge(n1_a, n1_b);
        assertThat(solution.traversal(result)).isEqualTo("1 2");
    }

    @Test
    public void test4(){
        Node n1_a = new Node(1);

        Node n1_b = new Node(1);

        Node result = solution.merge(n1_a, n1_b);
        assertThat(solution.traversal(result)).isEqualTo("1 1");
    }

    @Test
    public void test5(){
        Node n3_a = new Node(3);
        Node n2_a = new Node(2, n3_a);
        Node n1_a = new Node(1, n2_a);

        Node n1_b = new Node(0);

        Node result = solution.merge(n1_a, n1_b);
        assertThat(solution.traversal(result)).isEqualTo("0 1 2 3");
    }

    @Test
    public void test6(){
        Node n3_a = new Node(4);
        Node n2_a = new Node(2, n3_a);
        Node n1_a = new Node(1, n2_a);

        Node n1_b = new Node(3);

        Node result = solution.merge(n1_a, n1_b);
        assertThat(solution.traversal(result)).isEqualTo("1 2 3 4");
    }

    @Test
    public void test7(){
        Node n3_a = new Node(3);
        Node n2_a = new Node(2, n3_a);
        Node n1_a = new Node(1, n2_a);

        Node n1_b = new Node(4);

        Node result = solution.merge(n1_a, n1_b);
        assertThat(solution.traversal(result)).isEqualTo("1 2 3 4");
    }

    @Test
    public void test8(){
        Node n3_a = new Node(5);
        Node n2_a = new Node(3, n3_a);
        Node n1_a = new Node(1, n2_a);

        Node n3_b = new Node(8);
        Node n2_b = new Node(6, n3_b);
        Node n1_b = new Node(4, n2_b);

        Node result = solution.merge(n1_a, n1_b);
        assertThat(solution.traversal(result)).isEqualTo("1 3 4 5 6 8");
    }

}
