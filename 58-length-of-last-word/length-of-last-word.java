class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int rp = n-1;
        while(rp >=0 && s.charAt(rp) == ' '){
                rp--;
        }
        if(rp <0) return 0;
        int lp = rp;
        while(lp>=0 && s.charAt(lp) != ' '){
           lp--;
        }

        int length_last_word = rp-lp;
        return length_last_word;
    }
}