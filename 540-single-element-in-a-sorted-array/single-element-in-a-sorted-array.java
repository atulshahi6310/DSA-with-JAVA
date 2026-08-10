class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s =0;
        int e = n-2;
        if(n<2){
            return nums[0];
        }
        while(s<=e){
            int mid = s +(e-s)/2;
            mid -= (mid%2);
            if(nums[mid] == nums[mid+1]){
                s = mid +2;
            }else{
                e = mid -2;
            }
        }
        return nums[s];
    }
}