package practice.sort.radixsort;

import java.util.List;
import java.util.stream.IntStream;

public class MySolution {

    public int[] radixSort(int[] array) {
        int max = IntStream.of(array).max().getAsInt();

        int[][] buckets = new int[10][array.length];
        buckets[0] = array; // put it into one of the bucket

        for (int digit = 1; max / digit > 0; digit++) {
            buckets = sortByDigit(buckets, digit, array.length);
        }

        return bucketsToArray(buckets, array.length);
    }

    private int[][] sortByDigit(int[][] buckets, int digit, int arrayLength) {
        int[][] newBucket = new int[10][arrayLength];
        int[] bucketIndices = new int[10];

        for (int i = 0; i < 10; i++) {
            int[] bucket = buckets[i];

            for (int j = 0; j < bucket.length; j++) {
                int value = bucket[j];

                int newBucketIndex = value / ((int) Math.pow(10, digit)) % 10;
                newBucket[newBucketIndex][bucketIndices[i]] = 0;

                bucketIndices[i]++;
            }
        }

        return newBucket;
    }


    private int[] bucketsToArray(int[][] buckets, int arrayLength) {
        int[] array = new int[arrayLength];
        int index = 0;

        for(int i = 0 ; i < 10 ; i++) {
            int[] bucket = buckets[i];
            for (int j = 0 ; j < bucket.length ; j++) {
                array[index] = bucket[j];
            }
        }

        return array;
    }

}