class Solution {
    static boolean ispalandrome(String s ,int lp,int rp){
        while(lp <=rp){
            if(s.charAt(lp) != s.charAt(rp)){
                return false;
            }
            lp++;
            rp--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int lp =0;
        int rp = s.length()-1;
        while(lp<=rp){
            if(s.charAt(lp) != s.charAt(rp)){
                return ispalandrome(s,lp,rp-1) || ispalandrome(s,lp+1,rp);
            }
            lp++;
            rp--;
        }
        return true;
    }
}