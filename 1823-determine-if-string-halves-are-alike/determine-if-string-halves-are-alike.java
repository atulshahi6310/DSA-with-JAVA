class Solution {
    static int vowels_count(String str) {
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    public boolean halvesAreAlike(String s) {
        // question says that a string off even length we  have to make two string a ,b and cheak if the vowels count is same than  retun true if not then return false 
        int n = s.length();

        int count1 = vowels_count(s.substring(0, n / 2));

        int count2 = vowels_count(s.substring(n / 2, n));
        return count1 == count2;
    }
}