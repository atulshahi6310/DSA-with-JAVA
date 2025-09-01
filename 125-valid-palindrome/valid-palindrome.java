class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s =s.trim();
        s = s.replaceAll("[^a-z0-9]", "");
        int lp =0;
        int rp = s.length()-1;
            while(lp<rp){
                if(s.charAt( lp) != s.charAt( rp)){
                    return false;
                }
                lp++;
                rp--;
            }
        return true;
    }
}