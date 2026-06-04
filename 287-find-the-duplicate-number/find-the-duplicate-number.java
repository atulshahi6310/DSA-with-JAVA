class Solution {
    public int findDuplicate(int[] nums) {
        // int m = nums.length;
        // int n = m-1;
        // int sofn = (n*(n+1))/2;
        // int sum =0;
        // for(int i=0; i<m;i++){
        //         sum += nums[i];
        // }
        // sum = sofn -sum;
        // return sum*-1;
        Arrays.sort(nums);
        int lp =0;
        int rp = 1;
        while(rp<nums.length){
            if(nums[lp] == nums[rp]) return nums[rp];
            lp++;
            rp++;
        }
        return -1;
    }
}