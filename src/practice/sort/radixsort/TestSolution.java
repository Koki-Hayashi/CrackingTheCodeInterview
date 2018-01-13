package practice.sort.radixsort;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution mySolution;

    @Before
    public void setup() {
        mySolution = new MySolution();
    }

    @Test
    public void test() {
        int[] array = {3925, 4456, 5035, 5053, 4658, 1490, 9200, 6985, 9715, 4233, 5718, 4463, 179, 303, 8806, 3192, 721, 4236, 5892, 1867,
                4193, 6113, 7054, 8339, 92, 7357, 6562, 2234, 3158, 2728, 1622, 6249, 2956, 4791, 9870, 2255, 5254, 2309, 7291, 9125,
                1526, 2137, 9865, 7395, 9682, 2529, 1979, 991, 3597, 1254, 4480, 5492, 1267, 3808, 4656, 408, 4197, 1608, 4348, 9474,
                2851, 4793, 8143, 5724, 6155, 387, 8104, 8587, 4932, 358, 8484, 5248, 8916, 9555, 2070, 6204, 7675, 6000, 4992, 120,
                9640, 4226, 9286, 8761, 8548, 5865, 79, 2091, 4384, 2679, 5440, 4896, 1393, 9842, 6760, 4960, 7790, 1602, 9971, 6561,
        };
        int[] sorted = mySolution.radixSort(array);
        assertThat(sorted).isSorted();
    }

}
