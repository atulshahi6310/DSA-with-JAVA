class Solution {
    public static int max(int[] nums){
        int max1 =0;
        int max2 =0;
        for(int num:nums){
            if(num >=max1){
                max2 = max1;
                max1 = num;
            }else if(max1>num && max2 <num){
                 max2 = num;
            }
        }
        return (max1-1)*(max2-1);
    }
    public int maxProduct(int[] nums) {
        int result = max(nums);
        return result;
    }
}