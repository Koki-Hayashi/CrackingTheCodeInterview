package q1_2;

import java.util.HashMap;
import java.util.Map;

public class MySolution {

    public boolean isSameChars(String str1, String str2) {
        if (str1 == null || str1.isEmpty() ||
                str2 == null || str2.isEmpty()) return false;

        if (str1.length() != str2.length()) return false;


        Map<Character, Integer> map = new HashMap<>();

        // set up map of conuting each char occurrence on str1
        for (char c : str1.toCharArray()) {
            Integer count = map.get(c);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(c, count);
        }

        for (char c : str2.toCharArray()) {
            Integer count = map.get(c);

            if (count == null) {
                return false;
            }

            count--;
            if(count < 0) {
                return false;
            }

            if (count == 0) {
                map.remove(c);
                continue;
            }

            map.put(c, count);
        }


        return true;
    }


}
