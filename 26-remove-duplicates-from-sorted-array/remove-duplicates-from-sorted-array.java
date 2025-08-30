class Solution {
    public int removeDuplicates(int[] nums) {
        int lp =0;
        for(int rp =1;rp<nums.length;rp++){
            if(nums[rp] != nums[lp]){
                lp++;
                nums[lp] =nums[rp];

            }
        }
        return lp+1;
    }
}