class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        Stack<Character> st = new Stack<>();
        int i = 0;
        for (i = 0; i < n; i++) {
            char cha = word.charAt(i);
            if (cha == ch) {
                break;
            } else {
                st.push(cha);
            }
        }
        if(i==n) return word;
        String strr = "";

        strr += ch;
        while (!st.isEmpty()) {
            strr += st.pop();
        }
        for (int j = i + 1; j < n; j++) {
            strr += word.charAt(j);
        }

        return strr;

    }
}