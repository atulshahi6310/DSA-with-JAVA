class Solution {
    public void moveZeroes(int[] nums) {
        int lp = 0;
        int rp =0;
        int n = nums.length;
        for(rp=0;rp<n;rp++){
            if(nums[rp]!=0){
                int temp = nums[lp];
                nums[lp] = nums[rp];
                nums[rp] = temp;
                lp++;
            }
        }
        
    }
}