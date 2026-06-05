class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int num = nums[n-k];
        // for(int i=0;i<n;i++){
            
        // }
        return num;
        
    }
}