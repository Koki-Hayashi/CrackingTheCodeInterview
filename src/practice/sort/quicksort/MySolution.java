package practice.sort.quicksort;

public class MySolution {

    public int[] solution(int[] array) {
        if (array.length <  2) return array;

        quickSort(array, 0, array.length -1);

        return array;
    }

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
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

    }

}
