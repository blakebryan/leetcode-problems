class Solution {
    public int lengthOfLongestSubstring(String s) {
        String substring = "";
        int longest = 0, j;

        if (s.length() == 1) {
            return 1;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.length() - i < longest) {
                return longest;
            }
            substring += s.charAt(i);
            for (j = i + 1; j < s.length(); j++) {
                if (!substring.contains("" + s.charAt(j))) {
                    substring += s.charAt(j);
                } else {
                    if (substring.length() > longest) {
                        longest = substring.length();
                    }
                    substring = "";
                    break;
                }
            }
            if (j == s.length()) {
                break;
            }
        }
        if (substring.length() > longest) {
            return substring.length();
        }
        return longest;
    }
}