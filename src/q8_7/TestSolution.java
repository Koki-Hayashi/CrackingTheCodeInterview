package q8_7;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution solution;

    @Before
    public void setup() {
        solution = new MySolution();
    }

    @Test
    public void test1() {
        assertThat(solution.permutation(null)).isEmpty();
        assertThat(solution.permutation("a")).contains("a");
        assertThat(solution.permutation("ab")).contains("ab", "ba");
        assertThat(solution.permutation("abc")).containsOnly("abc", "acb", "bca", "bac", "cab", "cba");
    }

}
