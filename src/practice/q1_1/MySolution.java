package practice.q1_1;

import java.util.Arrays;

public class MySolution
{
	public String findPairSumUpTarget(int[] array, int target) {
		if (array == null || array.length < 2) {
			throw new IllegalArgumentException();
		}

		Arrays.sort(array);

		for (int i = 0 ; i < array.length ; i++) {
			for (int j = i; j < array.length ; j ++) {
				int sum = array[i] + array[j];
				if (sum == target) {
					return array[i] + " " + array[j];
				}

				if (sum > target) break;
			}
		}

		return ""; // couldn't find

	}

}