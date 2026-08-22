class Solution {
    static int isvalid(int num){
        int digit =0;
        int n = num;
        int sum =0;
        int product =1;
        while(n!=0){
            digit = n%10;
            sum += digit;
            product *= digit;
            n = n/10;
        }
        return sum+product;
    }
    public boolean checkDivisibility(int n) {
        int nums = isvalid(n);
        return n%nums ==0;
    }
}