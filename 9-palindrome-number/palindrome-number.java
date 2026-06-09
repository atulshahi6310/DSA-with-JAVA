class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int new_digit =0;
        if(n<0) return false;
        while(n !=0){
            int digit = n%10;
            new_digit  =  (new_digit*10) + digit;
            n = n/10;
        }

        if(x ==new_digit){
            return true;
        }
        return false;
    }
}