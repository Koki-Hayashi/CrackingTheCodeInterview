package q16_6;

import java.util.Arrays;

public class MySolution {

	public int minSubtraction(int[] array1, int[] array2) {
		if (array1 == null || array1.length == 0 || array2 == null || array2.length == 0) {
			return -1;
		}

		Arrays.sort(array1);
		Arrays.sort(array2);

		int index1 = 0;
		int index2 = 0;

		int min = Integer.MAX_VALUE;
		while (index1 < array1.length && index2 < array2.length) {
			int diff = Math.abs(array1[index1] - array2[index2]);
			if (min > diff) {
				min = diff;
			}

			if (array1[index1] < array2[index2]) {
				index1++;
			} else {
				index2++;
			}

		}

		return min;
	}

}