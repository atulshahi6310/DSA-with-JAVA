class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int np = 0;
        int tp = 0;

        while (tp < typed.length()) {

            if (np < name.length() && name.charAt(np) == typed.charAt(tp)) {
                np++;
                tp++;
            }
            else if (tp > 0 && typed.charAt(tp) == typed.charAt(tp - 1)) {
                tp++;
            }
            else {
                return false;
            }
        }

        return np == name.length();
    }
}