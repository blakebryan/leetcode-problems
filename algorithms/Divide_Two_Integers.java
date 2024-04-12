class Solution {
    public int divide(int dividend, int divisor) {
        int result = 0, carry1 = 0, carry2 = 0, sign = 1;

        if (divisor == 1) {
            return dividend;
        }

        if (dividend == Integer.MIN_VALUE) {
            dividend = Integer.MAX_VALUE;
            carry1 = 1;
            sign *= -1;
        } else if (dividend < 0) {
            dividend *= -1;
            sign *= -1;
        }

        if (divisor == Integer.MIN_VALUE) {
            divisor = Integer.MAX_VALUE;
            carry2 = 1;
            sign *= -1;
        } else if (divisor < 0) {
            divisor *= -1;
            sign *= -1;
        }
        if (divisor == 1) {
            return dividend * sign;
        }

        while (dividend - carry2 >= divisor - carry1) {
            dividend -= divisor;
            result++;
        }

        if (result == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return result * sign;
    }
}