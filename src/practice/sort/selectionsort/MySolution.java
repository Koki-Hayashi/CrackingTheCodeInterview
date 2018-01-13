package practice.sort.selectionsort;

public class MySolution {

    public int[] selectionSort(int[] array) {
        if (array.length < 2) return array;

        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = i; j < array.length; j++) {

                if (min > array[j]) {
                    minIndex = j;
                    min = array[j];
                }
            }

            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }

        return array;

    }
}