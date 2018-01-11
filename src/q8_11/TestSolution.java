package q8_11;

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
    public void test1() {
        assertThat(solution.listUpCombinations(1)).isEqualTo(1);
        assertThat(solution.listUpCombinations(2)).isEqualTo(1);
        assertThat(solution.listUpCombinations(5)).isEqualTo(2);
        assertThat(solution.listUpCombinations(6)).isEqualTo(2);
        assertThat(solution.listUpCombinations(10)).isEqualTo(4);
        assertThat(solution.listUpCombinations(25)).isEqualTo(13);
        assertThat(solution.listUpCombinations(100)).isEqualTo(242);
        assertThat(solution.listUpCombinations(1000)).isEqualTo(142511);
    }


    @Test
    public void test2() {
        assertThat(solution.listUpCombinationsByBFS(1)).isEqualTo(1);
        assertThat(solution.listUpCombinationsByBFS(2)).isEqualTo(1);
        assertThat(solution.listUpCombinationsByBFS(5)).isEqualTo(2);
        assertThat(solution.listUpCombinationsByBFS(6)).isEqualTo(2);
        assertThat(solution.listUpCombinationsByBFS(10)).isEqualTo(4);
        assertThat(solution.listUpCombinationsByBFS(25)).isEqualTo(13);
        assertThat(solution.listUpCombinationsByBFS(100)).isEqualTo(242);
        assertThat(solution.listUpCombinationsByBFS(1000)).isEqualTo(142511);
    }


    @Test
    public void test3() {
        assertThat(solution.listUpCombinationsByDP(1)).isEqualTo(1);
        assertThat(solution.listUpCombinationsByDP(2)).isEqualTo(1);
        assertThat(solution.listUpCombinationsByDP(5)).isEqualTo(2);
        assertThat(solution.listUpCombinationsByDP(6)).isEqualTo(2);
        assertThat(solution.listUpCombinationsByDP(10)).isEqualTo(4);
        assertThat(solution.listUpCombinationsByDP(25)).isEqualTo(13);
        assertThat(solution.listUpCombinationsByDP(100)).isEqualTo(242);
        assertThat(solution.listUpCombinationsByDP(1000)).isEqualTo(142511);
        assertThat(solution.listUpCombinationsByDP(10000)).isEqualTo(134235101);
        assertThat(solution.listUpCombinationsByDP(100000)).isEqualTo(279364825);
    }



}
