class Solution {
    public String intToRoman(int num) {
        String romNum = "";

        while (num >= 1000) {
            romNum += "M";
            num -= 1000;
        }
        if (num >= 900) {
            romNum += "CM";
            num -= 900;
        }
        if (num >= 500) {
            romNum += "D";
            num -= 500;
        }
        if (num >= 400) {
            romNum += "CD";
            num -= 400;
        }
        while (num >= 100) {
            romNum += "C";
            num -= 100;
        }
        if (num >= 90) {
            romNum += "XC";
            num -= 90;
        }
        if (num >= 50) {
            romNum += "L";
            num -= 50;
        }
        if (num >= 40) {
            romNum += "XL";
            num -= 40;
        }
        while (num >= 10) {
            romNum += "X";
            num -= 10;
        }
        if (num == 9) {
            romNum += "IX";
            num -= 9;
        }
        if (num >= 5) {
            romNum += "V";
            num -= 5;
        }
        if (num == 4) {
            romNum += "IV";
            num -= 4;
        }
        while (num > 0) {
            romNum += "I";
            num--;
        }
        return romNum;
    }
}