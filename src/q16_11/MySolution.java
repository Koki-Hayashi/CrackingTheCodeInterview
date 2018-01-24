package q16_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MySolution {

    private static final int SHORT = 1;
    private static final int LONG = 100;

    public int listUp(int k) {
        if (k == 0) {
            return 0;
        }

        int[] memo = new int[k * LONG + 1]; // max possible

        listUp(k, 0, SHORT, memo);
        listUp(k, 0, LONG, memo);

        return Arrays.stream(memo).filter(m -> m != 0).boxed().collect(Collectors.toList()).size();
    }

    public void listUp(int k, int soFar, int nextBoard, int[] memo) {
        if (k == 0) {
            memo[soFar] = 1;
            return;
        }

        soFar += nextBoard;

        if (memo[soFar] == 0) {
            listUp(k - 1, soFar, SHORT, memo);
            listUp(k - 1, soFar, LONG, memo);
        }
    }

}