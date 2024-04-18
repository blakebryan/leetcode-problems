class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(', '[', '{':
                    stack.push(c);
                    break;
                case ')', ']', '}':
                    if (stack.empty()) {
                        return false;
                    }
                    char c2 = stack.pop();
                    if (c2 != c - 1 && c2 != c - 2) {
                        return false;
                    }
                    break;
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}