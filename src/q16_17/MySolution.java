package q16_17;

public class MySolution {
    public int solve(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array shouldn't be null");
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (max < sum) {
                max = sum;
                continue;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;

    }


}
