class Solution {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                open.push(ch);
            } else {
                if (open.isEmpty()) {
                    return false;
                }
                if ((open.peek() == '(' && ch == ')') || (open.peek() == '[' && ch == ']')
                        || (open.peek() == '{' && ch == '}')) {
                    open.pop();
                }else{
                    return false;
                }
            }
        }
        if (open.isEmpty()) {
            return true;
        }
        return false;
    }
}