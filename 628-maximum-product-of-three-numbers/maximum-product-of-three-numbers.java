class Solution {
    static int solve(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 =  Integer.MIN_VALUE;
        int max3 =  Integer.MIN_VALUE;
        int min1 =0;
        int min2 =0;
        for (int digit : nums) {
            int temp_max = Math.abs(digit);
            if (digit >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = digit;
            } else if (max1 >= digit && max2 < digit && max3 < digit) {
                max3 = max2;
                max2 = digit;
            } else if (max1 >= digit && max2 >= digit && max3 < digit) {
                max3 = digit;
            }
            if(min1 >= digit){
                min2 = min1;
                min1 = digit;
            }
            else if(min2 >= digit){
                min2 = digit;
            }
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }

    public int maximumProduct(int[] nums) {
       int result = solve(nums);
       return result;
    }
}