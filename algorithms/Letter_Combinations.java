class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<String>();
        List<String> restOfResult = new LinkedList<String>();
        if (digits.length() == 0) {
            return result;
        }
        char c = digits.charAt(digits.length() - 1);
        int rorSize = 0;

        if (digits.length() > 1) {
            restOfResult = letterCombinations(digits.substring(0, digits.length() - 1));
            rorSize = restOfResult.size();
        }

        switch (c) {
            case '2':
                if (rorSize == 0) {
                    result.add("a");
                    result.add("b");
                    result.add("c");
                    return result;
                }
                for (int i = 0; i < restOfResult.size(); i++) {
                    result.add(restOfResult.get(i) + "a");
                    result.add(restOfResult.get(i) + "b");
                    result.add(restOfResult.get(i) + "c");
                }
                break;
            case '3':
                if (rorSize == 0) {
                    result.add("d");
                    result.add("e");
                    result.add("f");
                    return result;
                }
                for (int i = 0; i < restOfResult.size(); i++) {
                    result.add(restOfResult.get(i) + "d");
                    result.add(restOfResult.get(i) + "e");
                    result.add(restOfResult.get(i) + "f");
                }
                break;
            case '4':
                if (rorSize == 0) {
                    result.add("g");
                    result.add("h");
                    result.add("i");
                    return result;
                }
                for (int i = 0; i < restOfResult.size(); i++) {
                    result.add(restOfResult.get(i) + "g");
                    result.add(restOfResult.get(i) + "h");
                    result.add(restOfResult.get(i) + "i");
                }
                break;
            case '5':
                if (rorSize == 0) {
                    result.add("j");
                    result.add("k");
                    result.add("l");
                    return result;
                }
                for (int i = 0; i < restOfResult.size(); i++) {
                    result.add(restOfResult.get(i) + "j");
                    result.add(restOfResult.get(i) + "k");
                    result.add(restOfResult.get(i) + "l");
                }
                break;
            case '6':
                if (rorSize == 0) {
                    result.add("m");
                    result.add("n");
                    result.add("o");
                    return result;
                }
                for (int i = 0; i < restOfResult.size(); i++) {
                    result.add(restOfResult.get(i) + "m");
                    result.add(restOfResult.get(i) + "n");
                    result.add(restOfResult.get(i) + "o");
                }
                break;
            case '7':
                if (rorSize == 0) {
                    result.add("p");
                    result.add("q");
                    result.add("r");
                    result.add("s");
                    return result;
                }
                for (int i = 0; i < restOfResult.size(); i++) {
                    result.add(restOfResult.get(i) + "p");
                    result.add(restOfResult.get(i) + "q");
                    result.add(restOfResult.get(i) + "r");
                    result.add(restOfResult.get(i) + "s");
                }
                break;
            case '8':
                if (rorSize == 0) {
                    result.add("t");
                    result.add("u");
                    result.add("v");
                    return result;
                }
                for (int i = 0; i < restOfResult.size(); i++) {
                    result.add(restOfResult.get(i) + "t");
                    result.add(restOfResult.get(i) + "u");
                    result.add(restOfResult.get(i) + "v");
                }
                break;
            case '9':
                if (rorSize == 0) {
                    result.add("w");
                    result.add("x");
                    result.add("y");
                    result.add("z");
                    return result;
                }
                for (int i = 0; i < restOfResult.size(); i++) {
                    result.add(restOfResult.get(i) + "w");
                    result.add(restOfResult.get(i) + "x");
                    result.add(restOfResult.get(i) + "y");
                    result.add(restOfResult.get(i) + "z");
                }
                break;
        }
        return result;
    }
}