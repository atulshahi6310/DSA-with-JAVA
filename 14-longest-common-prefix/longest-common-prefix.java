class Solution {
    public String longestCommonPrefix(String[] strs) {

        int smallLength = Integer.MAX_VALUE;
        int idx = 0;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < smallLength) {
                smallLength = strs[i].length();
                idx = i;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < smallLength; i++) {

            char ch = strs[idx].charAt(i);

            for (int j = 0; j < strs.length; j++) {

                if (strs[j].charAt(i) != ch) {
                    return sb.toString();
                }

            }

            sb.append(ch);
        }

        return sb.toString();
    }
}