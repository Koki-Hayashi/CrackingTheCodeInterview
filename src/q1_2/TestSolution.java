package q1_2;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution solution = new MySolution();

    private String case1_a = "";
    private String case1_b = "123abc";

    private String case2_a = null;
    private String case2_b = "123abc";

    private String case3_a = "abc123";
    private String case3_b = "";

    private String case4_a = "abc123";
    private String case4_b = null;

    private String case5_a = "abc123";
    private String case5_b = "abc";

    private String case6_a = "abc123";
    private String case6_b = "a1b2c3";

    private String case7_a = "aaaa";
    private String case7_b = "aaa";

    private String case8_a = "aaaa";
    private String case8_b = "aaaa";

    private String case9_a = "a";
    private String case9_b = "a";

    private String case10_a = "abc123";
    private String case10_b = "A1B2C3";

    private String case11_a = "abc123a";
    private String case11_b = "a1b2c3a";


    @Before
    public void setup() {
        //
    }

    @Test
    public void test(){
        assertThat(solution.isSameChars(case1_a, case1_b)).isFalse();
        assertThat(solution.isSameChars(case2_a, case2_b)).isFalse();
        assertThat(solution.isSameChars(case3_a, case3_b)).isFalse();
        assertThat(solution.isSameChars(case4_a, case4_b)).isFalse();
        assertThat(solution.isSameChars(case5_a, case5_b)).isFalse();
        assertThat(solution.isSameChars(case6_a, case6_b)).isTrue();
        assertThat(solution.isSameChars(case7_a, case7_b)).isFalse();
        assertThat(solution.isSameChars(case8_a, case8_b)).isTrue();
        assertThat(solution.isSameChars(case9_a, case9_b)).isTrue();
        assertThat(solution.isSameChars(case10_a, case10_b)).isFalse();
        assertThat(solution.isSameChars(case11_a, case11_b)).isTrue();
    }

}
