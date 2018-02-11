package practice.linkedList.q1_1;

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
        solution.insert(null, new Node(1));
    }

    @Test
    public void test2(){
        Node n1 = new Node(1);
        n1.next = n1;

        solution.insert(n1, new Node(2));

        assertThat(solution.traversal(n1)).isEqualTo("1 2");
    }

    @Test
    public void test3(){
        Node n4 = new Node(4);
        Node n2 = new Node(2, n4);
        Node n1 = new Node(1, n2);
        n4.next = n1;

        solution.insert(n1, new Node(3));

        assertThat(solution.traversal(n1)).isEqualTo("1 2 3 4");
    }

    @Test
    public void test4(){
        Node n3 = new Node(3);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        n3.next = n1;

        Node n0 = new Node(0);
        solution.insert(n1, n0);

        assertThat(solution.traversal(n0)).isEqualTo("0 1 2 3");
    }

    @Test
    public void test5(){
        Node n3 = new Node(3);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        n3.next = n1;

        solution.insert(n1, new Node(4));

        assertThat(solution.traversal(n1)).isEqualTo("1 2 3 4");
    }

    @Test
    public void test6(){
        Node n1 = new Node(1);
        n1.next = n1;

        Node n0 = new Node(0);
        solution.insert(n1, n0);

        assertThat(solution.traversal(n0)).isEqualTo("0 1");
    }

}
