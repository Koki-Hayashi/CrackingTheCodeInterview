package q1_6;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution solution = new MySolution();

    private String case1_input = null;
    private String case1_output= null;

    private String case2_input = "";
    private String case2_output = "";

    private String case3_input = "a";
    private String case3_output = "a";

    private String case4_input = "aa";
    private String case4_output = "aa";

    private String case5_input = "aaa";
    private String case5_output = "a3";

    private String case6_input = "aabb";
    private String case6_output = "aabb";

    private String case7_input = "aabcccccaaa";
    private String case7_output = "a2b1c5a3";



    @Before
    public void setup() {
        //
    }

    @Test
    public void test(){
        assertThat(solution.compress(case1_input)).isEqualTo(case1_output);
        assertThat(solution.compress(case2_input)).isEqualTo(case2_output);
        assertThat(solution.compress(case3_input)).isEqualTo(case3_output);
        assertThat(solution.compress(case4_input)).isEqualTo(case4_output);
        assertThat(solution.compress(case5_input)).isEqualTo(case5_output);
        assertThat(solution.compress(case6_input)).isEqualTo(case6_output);
        assertThat(solution.compress(case7_input)).isEqualTo(case7_output);
    }

}
