package q8_7;

import java.util.*;

public class MySolution {

    public List<String> permutation(String str) {
        if (str == null) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        if (str.length() == 0) {
            result.add("");
            return result;
        }

        for (int i = 0; i < str.length(); i++) {
            String first = str.substring(0, i);
            String second = str.substring(i + 1, str.length());

            List<String> partials = permutation(first + second);

            for (String s : partials) {
                result.add(str.charAt(i) + s);
            }

        }

        return result;
    }


}