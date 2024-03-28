class Solution {
    public int romanToInt(String s) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int pointer = 0, value = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.substring(i, i + 2).equals(numerals[pointer])) {
                value += values[pointer];
                i++;
            } else if (s.substring(i, i + 1).equals(numerals[pointer])) {
                value += values[pointer];
            } else {
                pointer++;
                i--;
            }
        }
        return value;
    }
}