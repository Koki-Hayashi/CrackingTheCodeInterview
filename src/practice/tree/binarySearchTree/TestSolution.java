package practice.tree.binarySearchTree;

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
    	Node head = solution.buildUpBinarySearchTree(new int[]{2,4,5,1,7,5,8,9,4,5,6,11});
    	solution.inorderTraversal(head);

	    assertThat(solution.search(head, 7)).isNotNull();

	    assertThat(solution.search(head, 100)).isNull();
    }

}
