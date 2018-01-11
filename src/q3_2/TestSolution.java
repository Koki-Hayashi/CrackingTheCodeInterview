package q3_2;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution
{

    private MySolution solution;

    @Before
    public void setup() {
        solution = new MySolution();
    }

    @Test
    public void test(){
        solution.push(1);
	    solution.push(2);
	    solution.push(1);
	    solution.push(3);
        solution.push(-1);
        solution.push(2);
        solution.push(-3);


        assertThat(solution.min()).isEqualTo(-3);

    }



}
