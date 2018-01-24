package q16_11;

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
    public void test() {
        assertThat(solution.listUp(0)).isEqualTo(0);
        assertThat(solution.listUp(1)).isEqualTo(2);
        assertThat(solution.listUp(2)).isEqualTo(3);
        assertThat(solution.listUp(3)).isEqualTo(4);
        assertThat(solution.listUp(20)).isEqualTo(21);

    }




}
