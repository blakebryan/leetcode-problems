class Solution {
    public int reverse(int x) {
        int output = 0;

        for (int i = 0; i < Math.ceil(Math.log10(Math.abs(x * 1.000001))); i++) {
            output += ((int) (x / Math.pow(10, i)) % 10)
                    * Math.pow(10, Math.ceil(Math.log10(Math.abs(x * 1.000001))) - i - 1);
        }
        if (output == Integer.MAX_VALUE || output == Integer.MIN_VALUE) {
            return 0;
        }
        return output;
    }
}