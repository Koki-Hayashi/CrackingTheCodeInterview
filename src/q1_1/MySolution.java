package q1_1;

import java.util.*;

public class MySolution {

    public boolean checkAllUniqueChar(String str) {
        if (str == null || str.isEmpty()) return false;

        Map<Character, Boolean> existenceMap = new HashMap<>();

        for(char c : str.toCharArray()) {
            Boolean isExist = existenceMap.get(c);
            if (isExist != null) {
                return false;
            }

            existenceMap.put(c, true);
        }

        return true;
    }


}
