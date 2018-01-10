package q8_11;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MySolution {

	private static int[] coins = {25, 10, 5, 1};

	public int listUpCombinations(int n){
		int sum = 0;
		for (int i = 0 ; i < coins.length ; i++) {
			sum += findCombinations(n, i);
		}

		return sum;
	}

	private int findCombinations(int n, int coinIndex) {
		if (coinIndex >= coins.length) {
			return 0;
		}

		int rest = n - coins[coinIndex];
		if(rest < 0) { // too much
			return 0;
		}

		if (rest == 0) {
			return 1;
		}

		int sum = 0;
		for (int i = coinIndex ; i < coins.length; i++) {
			 sum += findCombinations(rest, i);
		}

		return sum;
	}

	private class Pattern {
		int n = 0;
		int coinIndex = 0;

		public Pattern(int n, int coinIndex) {
			this.n = n;
			this.coinIndex = coinIndex;
		}
	}

	public int listUpCombinationsByBFS(int n){
		int sum = 0;
		for (int i = 0 ; i < coins.length ; i++) {
			sum += findCombinationsByBFS(n, i);
		}

		return sum;
	}

	private int findCombinationsByBFS(int n, int coinIndex) {
		LinkedList<Pattern> queue = new LinkedList();

		queue.add(new Pattern(n, coinIndex));

		int sum = 0;
		while(!queue.isEmpty()) {
			Pattern pattern = queue.remove();

			int rest = pattern.n - coins[pattern.coinIndex];

			if(rest < 0) { // too much
				continue;
			}

			if (rest == 0) {
				sum += 1;
				continue;
			}

			for (int i = pattern.coinIndex ; i < coins.length; i++) {
				queue.add(new Pattern(rest, i));
			}
		}

		return sum;
	}

	public int listUpCombinationsByDP(int n){
		int sum = 0;

		Map<Integer, Map<Integer, Integer>> nCoinIndexSumMap = new HashMap<>();
		for (int i = 0 ; i < coins.length ; i++) {
			sum += findCombinationsByDP(n, i, nCoinIndexSumMap);
		}

		return sum;
	}

	private int findCombinationsByDP(int n, int coinIndex, Map<Integer, Map<Integer, Integer>> nCoinIndexSumMap) {
		if (coinIndex >= coins.length) {
			return 0;
		}

		int rest = n - coins[coinIndex];
		if(rest < 0) { // too much
			return 0;
		}

		if (rest == 0) {
			return 1;
		}

		int sum = 0;

		if (nCoinIndexSumMap.get(rest) != null && nCoinIndexSumMap.get(rest).get(coinIndex) != null) {
			sum = nCoinIndexSumMap.get(rest).get(coinIndex);
		} else {
			for (int i = coinIndex; i < coins.length; i++) {
				sum += findCombinationsByDP(rest, i, nCoinIndexSumMap);
			}
		}

		Map<Integer, Integer> coinIndexSumMap = new HashMap<>();
		coinIndexSumMap.put(coinIndex, sum);
		nCoinIndexSumMap.put(rest, coinIndexSumMap);
		return sum;
	}

}