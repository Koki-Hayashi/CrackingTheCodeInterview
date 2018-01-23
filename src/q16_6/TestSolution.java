package q16_6;

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
        assertThat(solution.minSubtraction(null,new int[]{4,5,6})).isEqualTo(-1);
        assertThat(solution.minSubtraction(new int[]{1,2,3},null )).isEqualTo(-1);
        assertThat(solution.minSubtraction(new int[0],new int[]{4,5,6})).isEqualTo(-1);
        assertThat(solution.minSubtraction(new int[]{1,2,3},new int[0])).isEqualTo(-1);

        assertThat(solution.minSubtraction(new int[]{1,2,3},new int[]{4,5,6})).isEqualTo(1);
        assertThat(solution.minSubtraction(new int[]{7,1,11,3},new int[]{41,15,23})).isEqualTo(4);
        assertThat(solution.minSubtraction(new int[]{26,5,23,192,382},new int[]{15,182,45,754,391,47})).isEqualTo(8);

    }




}
