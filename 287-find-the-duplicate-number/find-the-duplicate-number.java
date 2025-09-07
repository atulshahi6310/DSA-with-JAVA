class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
        int lp =0;
        int n = nums.length;
        for(int rp =1 ; rp<n; rp++){
            if(nums[lp] == nums[rp]){
                return nums[lp];
            }
            lp++;
        }
        return -1;
    }
}