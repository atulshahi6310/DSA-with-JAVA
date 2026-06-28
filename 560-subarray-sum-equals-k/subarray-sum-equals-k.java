class Solution {
    public int subarraySum(int[] nums, int k) {
        int sub_array =0;
        for(int i=0;i<nums.length;i++){
            int crr_sum =0;
            for(int j=i;j<nums.length;j++){
                crr_sum+=nums[j];
                if(crr_sum == k) sub_array++;
            }
        }
        return sub_array;
    }
}