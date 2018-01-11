package q1_5;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution solution;

    private String case1_a = "";
    private String case1_b = "pale";

    private String case2_a = null;
    private String case2_b = "pale";

    private String case3_a = "pale";
    private String case3_b = "";

    private String case4_a = "pales";
    private String case4_b = null;

    private String case5_a = "pale";
    private String case5_b = "take";

    private String case6_a = "pale";
    private String case6_b = "pales";

    private String case7_a = "ple";
    private String case7_b = "pale";

    private String case8_a = "aaa";
    private String case8_b = "aaaa";

    private String case9_a = "a";
    private String case9_b = "a";

    private String case10_a = "pale";
    private String case10_b = "pale";

    private String case11_a = "pale";
    private String case11_b = "PALE";

    private String case12_a = "tale";
    private String case12_b = "pale";


    @Before
    public void setup() {
        solution = new MySolution();
    }

    @Test
    public void test(){
        assertThat(solution.isSameChars(case1_a, case1_b)).isFalse();
        assertThat(solution.isSameChars(case2_a, case2_b)).isFalse();
        assertThat(solution.isSameChars(case3_a, case3_b)).isFalse();
        assertThat(solution.isSameChars(case4_a, case4_b)).isFalse();
        assertThat(solution.isSameChars(case5_a, case5_b)).isFalse();
        assertThat(solution.isSameChars(case6_a, case6_b)).isTrue();
        assertThat(solution.isSameChars(case7_a, case7_b)).isTrue();
        assertThat(solution.isSameChars(case8_a, case8_b)).isTrue();
        assertThat(solution.isSameChars(case9_a, case9_b)).isTrue();
        assertThat(solution.isSameChars(case10_a, case10_b)).isTrue();
        assertThat(solution.isSameChars(case11_a, case11_b)).isFalse();
        assertThat(solution.isSameChars(case12_a, case12_b)).isTrue();
    }

}
