class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        int minLen = 201;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLen) {
                minLen = strs[i].length();
            }
        }
        for (int i = 0; i < minLen && minLen < 201; i++) {
            sb.append(strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != sb.charAt(sb.length() - 1)) {
                    sb.deleteCharAt(sb.length() - 1);
                    i = minLen;
                    break;
                }
            }
        }
        return sb.toString();
    }
}