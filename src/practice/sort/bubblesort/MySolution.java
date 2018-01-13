package practice.sort.bubblesort;

import java.util.Arrays;

public class MySolution {

    public int[] bubbleSort(int[] array) {
        if (array.length <  2) return array;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
        return array;
    }

}
