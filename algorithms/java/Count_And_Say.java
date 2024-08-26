class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        return rle(countAndSay(n - 1));
    }

    private String rle(String input) {
        StringBuilder output = new StringBuilder();
        int consec;
        int i, j;
        for (i = 0; i < input.length(); i++) {
            consec = 1;
            j = i + 1;
            while (j < input.length() && input.charAt(i) == input.charAt(j)) {
                consec++;
                j++;
            }
            output.append(consec);
            output.append(input.charAt(i));
            i = j - 1;
        }
        return output.toString();
    }
}