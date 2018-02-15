package practice.tree.binaryTree.q1_1;

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

    @Test
    public void test(){
    	Node root = null;
	    assertThat(solution.isBinarySearchTree(root)).isFalse();
        assertThat(solution.isBinarySearchTree2(root)).isFalse();
    }

    @Test
    public void test2(){
        Node root = new Node(1);
        assertThat(solution.isBinarySearchTree(root)).isTrue();
        assertThat(solution.isBinarySearchTree2(root)).isTrue();
    }

    @Test
    public void test3(){
        Node n2 = new Node(2);
        Node n1 = new Node(1);
        n2.left = n1;
        assertThat(solution.isBinarySearchTree(n2)).isTrue();
        assertThat(solution.isBinarySearchTree2(n2)).isTrue();
    }

    @Test
    public void test4(){
        Node n2 = new Node(2);
        Node n1 = new Node(1);
        n2.right = n1;
        assertThat(solution.isBinarySearchTree(n2)).isFalse();
        assertThat(solution.isBinarySearchTree2(n2)).isFalse();
    }

    @Test
    public void test5(){
        Node n8 = new Node(8);
        Node n7 = new Node(7);
        Node n6 = new Node(6);
        Node n5 = new Node(5);
        Node n4 = new Node(4);
        Node n3 = new Node(3);
        Node n2 = new Node(2);
        Node n1 = new Node(1);
        n5.left= n3;
        n3.left = n2;
        n2.left = n1;
        n3.right = n4;

        n5.right = n8;
        n8.left = n6;
        n6.right = n7;

        assertThat(solution.isBinarySearchTree(n5)).isTrue();
        assertThat(solution.isBinarySearchTree2(n5)).isTrue();
    }

}
