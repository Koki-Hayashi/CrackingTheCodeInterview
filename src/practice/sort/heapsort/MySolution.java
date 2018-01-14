package practice.sort.heapsort;

public class MySolution {

    public int[] solution(int[] array) {
        if (array.length == 2) return array;

        int heapSize = array.length;
        for (int i = heapSize / 2 - 1; i >= 0; i--) { // For all heap nodes which have at least one leaf
            heapify(array, i, heapSize);
        }

        heapSort(array, heapSize);

        return array;
    }

    private void heapify(int[] array, int parent, int heapSize) {
        int max = array[parent];
        int maxIndex = parent;

        int leftChild = parent * 2 + 1;
        if (leftChild < heapSize && max < array[leftChild]) {
            max = array[leftChild];
            maxIndex = leftChild;
        }

        int rightChild = leftChild + 1;
        if (rightChild < heapSize && max < array[rightChild]) {
            maxIndex = rightChild;
        }

        if (maxIndex == parent) {
            return;
        }

        swap(array, parent, maxIndex);
        heapify(array, maxIndex, heapSize);
    }

    private void heapSort(int[] array, int heapSize) {
        for (int i = 0 ; i < array.length ; i++) {
            swap(array, 0, heapSize - 1 - i);
            heapify(array, 0, heapSize - 1 - i);
        }
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
