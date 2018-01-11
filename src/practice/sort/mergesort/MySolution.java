package practice.sort.mergesort;

import java.util.Arrays;

public class MySolution {

    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];

        int indexLeft = 0;
        int indexRight = 0;

        while (indexLeft < left.length && indexRight < right.length) {
            int nextLeft = left[indexLeft];
            int nextRight = right[indexRight];

            if (nextLeft < nextRight){
                merged[indexLeft + indexRight] = nextLeft;
                indexLeft++;
            } else {
                merged[indexLeft + indexRight] = nextRight;
                indexRight++;
            }
        }

        while(indexLeft < left.length) {
            merged[indexLeft + indexRight] = left[indexLeft];
            indexLeft++;
        }

        while(indexRight < right.length) {
            merged[indexLeft + indexRight] = right[indexRight];
            indexRight++;
        }

        return merged;
    }

    public int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

        int [] sortedLeft = mergeSort(left);
        int [] sortedRight = mergeSort(right);

        return merge(sortedLeft, sortedRight);

    }

}
