class Solution {
    public int reverse(int x) {
    
        int a = x;
        int digits = 0;
        while (a != 0) {
            digits++;
            a /= 10;
        }
         long reverse = 0;

        while (x != 0) {
            int digit = x % 10;

            reverse += digit * (long)Math.pow(10, digits - 1);

            x /= 10;
            digits--;
        }
       if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) reverse;
    }
}