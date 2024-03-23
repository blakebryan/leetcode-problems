class Solution {
    public String convert(String s, int numRows) {
        String output = "" + s.charAt(0);
        int index = 0;

        if (numRows == 1 || s.length() == 1) {
            return s;
        }
        while (index < s.length()) {
            index += 2 * numRows - 2;
            if (index < s.length()) {
                output += s.charAt(index);
            }
        }
        for (int r = 1; r < numRows - 1; r++) {
            index = r;
            if (index < s.length()) {
                output += s.charAt(index);
            }
            while (index < s.length()) {
                index += 2 * (numRows - r - 1);
                if (index < s.length()) {
                    output += s.charAt(index);
                }
                index += 2 * r;
                if (index < s.length()) {
                    output += s.charAt(index);
                }
            }
        }
        index = numRows - 1;
        if (index < s.length()) {
            output += s.charAt(index);
        }
        while (index < s.length()) {
            index += 2 * numRows - 2;
            if (index < s.length()) {
                output += s.charAt(index);
            }
        }
        return output;
    }
}