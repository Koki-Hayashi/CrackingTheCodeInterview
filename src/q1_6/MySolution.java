package q1_6;

public class MySolution {

    public String compress(String str) {
        // assume string containing space is invalid
        if (str == null || str.isEmpty() || str.contains(" ")) return str;

        StringBuilder result = new StringBuilder();

        char[] chars = str.toCharArray();
        char lastChar = chars[0];
        int counter = 1;
        for (int i = 1 ; i < chars.length ; i++) {
            char c = chars[i];
            if (lastChar == c) {
                counter++;
                continue;
            }

            result.append(Character.toString(lastChar) + counter);

            lastChar = c;
            counter = 1;
        }
        result.append(Character.toString(lastChar) + counter);

        return str.length() > result.toString().length() ? result.toString() : str;
    }


}
