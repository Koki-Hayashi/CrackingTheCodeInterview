package q1_1;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution solution = new MySolution();

    private String case1 = "abcdefg";
    private String case2 = "abcdefa";
    private String case3 = "aaaa";
    private String case4 = "a";
    private String case5 = "";
    private String case6 = null;


    @Before
    public void setup() {
        //
    }

    @Test
    public void test(){
        assertThat(solution.checkAllUniqueChar(case1)).isTrue();
        assertThat(solution.checkAllUniqueChar(case2)).isFalse();
        assertThat(solution.checkAllUniqueChar(case3)).isFalse();
        assertThat(solution.checkAllUniqueChar(case4)).isTrue();
        assertThat(solution.checkAllUniqueChar(case5)).isFalse();
        assertThat(solution.checkAllUniqueChar(case6)).isFalse();
    }

}
