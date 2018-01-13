package practice.sort.bubblesort;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSolution {

    private MySolution mySolution;

    @Before
    public void setup(){
        mySolution = new MySolution();
    }

    @Test
    public void test(){
        int[] array = {1,7,8,2,4,3,6,9,5,10};

        int[] sorted = mySolution.bubbleSort(array);
        assertThat(sorted).isSorted();
    }

    @Test
    public void test2(){
        int[] array = {9,1,7,8,2,4,3,6,9,5,10};

        int[] sorted = mySolution.bubbleSort(array);
        assertThat(sorted).isSorted();
    }

}
