class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int max_index =0;
        for(int i=0;i<n;i++){
            if(nums[i] > max){
                max = nums[i];
                max_index =i;
            }
        }
        return max_index;
    }
}