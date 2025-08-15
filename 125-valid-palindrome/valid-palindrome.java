class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        // s = s.trim();
        int lp =0;
        int rp =s.length()-1;
        while(lp < rp){
            if(s.charAt(lp) != s.charAt(rp)){
                return false;
            }
                lp++;
                rp--;
        }
        return true;
    }
}