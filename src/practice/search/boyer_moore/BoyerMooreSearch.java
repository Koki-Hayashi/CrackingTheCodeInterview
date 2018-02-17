package practice.search.boyer_moore;

import javafx.beans.property.MapProperty;

import java.util.HashMap;
import java.util.Map;

public class BoyerMooreSearch {

    public boolean search(String target, String query) {
        if (target == null || target.isEmpty() || query == null) {
            throw new IllegalArgumentException();
        }

        if (query.isEmpty()) {
            return false;
        }

        Map<Character, Integer> shiftTable = genShiftTable(query);

        char[] targetChars = target.toCharArray();
        char[] queryChars = query.toCharArray();
        int queryLength = queryChars.length;
        int targetIndex = queryLength - 1;

        while (targetIndex < targetChars.length) {

            int i = 0;
            while (i < queryLength) {
                // compare from end of the query char
                if (queryChars[queryLength - 1 - i] != targetChars[targetIndex - i]) {
                    break;
                }
                i++;
            }

            if (i == queryLength) {
                return true;
            }

            Integer shift = shiftTable.get(targetChars[targetIndex]);


            targetIndex += shift == null ? queryLength : shift - i;
        }

        return false;
    }

    private Map<Character, Integer> genShiftTable(String query) {
        Map<Character, Integer> shiftTable = new HashMap<>();

        char[] queryCharrs = query.toCharArray();

        int queryLength = queryCharrs.length;
        for (int i = 0; i < queryLength - 1; i++) { // except last char
            int shiftNum = queryLength - i - 1;
            shiftTable.put(queryCharrs[i], shiftNum);
        }

        return shiftTable;
    }

}
