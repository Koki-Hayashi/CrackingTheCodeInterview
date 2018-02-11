package practice.q1_1;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution solution = new MySolution();

    @Before
    public void setup() {
        //
    }

    @Test(expected = IllegalArgumentException.class)
    public void test() {
        solution.findPairSumUpTarget(null, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        solution.findPairSumUpTarget(new int[]{0}, 0);
    }

    @Test
    public void test3()
    {
        int[] array = new int[]{1,4,3,5,6,7,8,10,2};
        assertThat( solution.findPairSumUpTarget(array, 14)).isEqualTo("4 10");
    }

    @Test
    public void test4()
    {
        int[] array = new int[]{100, 200};
        assertThat( solution.findPairSumUpTarget(array, 15)).isEqualTo("");
    }

    @Test
    public void test5()
    {
        int[] array = new int[]{10, 20};
        assertThat( solution.findPairSumUpTarget(array, 150)).isEqualTo("");
    }


}
