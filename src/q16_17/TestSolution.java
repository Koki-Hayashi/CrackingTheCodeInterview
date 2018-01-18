package q16_17;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestSolution {

    private MySolution solution = new MySolution();

    @Before
    public void setup() {
        //
    }

    @Test
    public void test() {
        assertThat(solution.solve(new int[]{2, -1, 3, 4, -5})).isEqualTo(8);
        assertThat(solution.solve(new int[]{2})).isEqualTo(2);
        assertThat(solution.solve(new int[]{0, 0, 0, 0})).isEqualTo(0);
        assertThat(solution.solve(new int[]{1, 2, 3, 4, 5})).isEqualTo(15);
        assertThat(solution.solve(new int[]{-1, -2, -3, -4, -5})).isEqualTo(-1);
    }

}
