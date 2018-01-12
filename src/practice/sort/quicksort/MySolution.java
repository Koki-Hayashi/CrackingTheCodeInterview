package practice.sort.quicksort;

import java.util.Arrays;

public class MySolution {

    public int[] solution(int[] array) {
        if (array.length <  2) return array;

        quickSort(array, 0, array.length -1);

        return array;
    }

    // {11,1,7,8,2,4,3,6,9,5,10}; p = 4
    // {3,1,7,8,2,4,11,6,9,5,10};
    // {3,1,4,8,2,7,11,6,9,5,10};
    // {3,1,4,2,8,7,11,6,9,5,10};
    private void quickSort(int[] array, int left, int right) {
        if(left > right) {
            return;
        }

        int pivot = array[(left + right) / 2];

        int leftIndex = left;
        int rightIndex = right;

        while(leftIndex <= rightIndex) {
            while(array[leftIndex] < pivot) {
                leftIndex++;
            }

            while(array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                int tmp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = tmp;
                leftIndex++;
                rightIndex--;
            }

        }

        quickSort(array, left, rightIndex);
        quickSort(array, leftIndex, right);



        ;
    }

}
