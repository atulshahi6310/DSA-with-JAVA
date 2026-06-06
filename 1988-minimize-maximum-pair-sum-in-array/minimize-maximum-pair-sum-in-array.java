class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int lp =0;
        int rp = n-1;
        int max_sum =0;
        int  cr =0;
        while(lp<=rp){
            cr = nums[lp] + nums[rp];
            max_sum =Math.max(max_sum,cr);
            lp++;
            rp--;
        }
        return max_sum;
    }
}