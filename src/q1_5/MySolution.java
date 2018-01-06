package q1_5;

public class MySolution {

    public boolean isSameChars(String str1, String str2) {
        if (str1 == null || str1.isEmpty() ||
                str2 == null || str2.isEmpty()) return false;

        int len1 = str1.length();
        int len2 = str2.length();
        if (Math.abs(len1 - len2) > 2 ) return false;

        if (len1 == len2) {
            return isSameOrOneCharDiff(str1, str2);
        } else {
            String shorter = (len1 < len2) ? str1 : str2;
            String longer = (len1 < len2) ? str2 : str1;

            return isOneCharDiff(shorter, longer);

        }
    }

    // abcd
    // abd

    private boolean isOneCharDiff(String shorter, String longer) {
        int indexShorter = 0;
        int indexLonger = 0;

        boolean mismatchedOnce = false;
        while(indexShorter < shorter.length() && indexLonger < longer.length()) {
            // keep processing while matching
            if(shorter.charAt(indexShorter) == longer.charAt(indexLonger)) {
                indexShorter++;
                indexLonger++;
                continue;
            }

            // -- if not matched -- //
            if (mismatchedOnce) { // second mismatch
                return false;
            }

            mismatchedOnce = true;
            indexLonger++;
            continue;
        }

        return true;
    }

    private boolean isSameOrOneCharDiff(String str1, String str2) {

        int diffCounter = 0;
        for (int i = 0 ; i < str1.length() ; i++) {
            if (str1.charAt(i) != str2.charAt(i)) diffCounter++;
        }

        return diffCounter <= 1;
    }




}
