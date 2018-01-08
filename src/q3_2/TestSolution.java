package q3_2;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class TestSolution
{

    private MySolution solution = new MySolution();

    @Before
    public void setup() {
        //
    }

    @Test
    public void test(){
    	solution.push(1);
	    solution.push(2);
	    solution.push(3);

		assertThat(solution.pop()).isEqualTo(3);
	    assertThat(solution.pop()).isEqualTo(2);
	    assertThat(solution.pop()).isEqualTo(1);

	    try
	    {
		    assertThat(solution.pop());
		    fail("expected an exception");
	    } catch (NoSuchElementException e) {
	    	// path
	    }

	    solution.push(2);
	    solution.push(1);
	    solution.push(3);

	    assertThat(solution.min()).isEqualTo(1);
	    assertThat(solution.min()).isEqualTo(2);
	    assertThat(solution.min()).isEqualTo(3);

	    try
	    {
		    assertThat(solution.min());
		    fail("expected an exception");
	    } catch (NoSuchElementException e) {
		    // path
	    }
    }



}
