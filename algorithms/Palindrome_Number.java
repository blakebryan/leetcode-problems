class Solution {
    public boolean isPalindrome(int x) {
        int d1, d2, tens;
        double numDigits;

        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        numDigits = Math.log10(x);
        if (numDigits == (int)numDigits) {
            numDigits++;
        }
        if (numDigits % 1 > 0) {
            numDigits = (int)numDigits + 1;
        }
        for (int i = 0; i < (int)(numDigits / 2); i++) {
            tens = 1;
            for (int j = 0; j < i; j++) {
                tens *= 10;
            }
            d1 = (x / tens) % 10;
            tens = 1;
            for (int j = 0; j < numDigits - (i + 1); j++) {
                tens *= 10;
            }
            d2 = (x / tens) % 10;
            if (d1 != d2) {
                return false;
            }
        }
        return true;
    }
}