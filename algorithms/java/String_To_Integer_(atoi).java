class Solution {
    public int myAtoi(String s) {
        int val = 0;
        boolean negative = false, sign = false, numFound = false, whitespaceAllowed = true;

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (curChar == ' ' && whitespaceAllowed) {
                continue;
            } else if (curChar == '+' && !sign && !numFound) {
                sign = true;
                whitespaceAllowed = false;
                continue;
            } else if (curChar == '-' && !sign && !numFound) {
                negative = true;
                sign = true;
                whitespaceAllowed = false;
                continue;
            } else if (curChar == '0' || curChar == '1' || curChar == '2'
                    || curChar == '3' || curChar == '4' || curChar == '5'
                    || curChar == '6' || curChar == '7' || curChar == '8'
                    || curChar == '9') {
                numFound = true;
                whitespaceAllowed = false;
                if (negative) {
                    if (val < Integer.MIN_VALUE / 10
                            || (val == Integer.MIN_VALUE / 10 && Integer.parseInt(curChar + "") > 8)) {
                        return Integer.MIN_VALUE;
                    }
                    val *= 10;
                    val -= Integer.parseInt(curChar + "");
                } else {
                    if (val > Integer.MAX_VALUE / 10
                            || (val == Integer.MAX_VALUE / 10 && Integer.parseInt(curChar + "") > 7)) {
                        return Integer.MAX_VALUE;
                    }
                    val *= 10;
                    val += Integer.parseInt(curChar + "");
                }
            } else {
                return val;
            }
        }
        return val;
    }
}