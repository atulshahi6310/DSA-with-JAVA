class Solution {
    public int findMin(int[] nums) {
        int n= nums.length;
        int s = 0;
        int e = n-1;
        int ans =-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(nums[mid]>nums[e]){
                s = mid+1;
            }else if(nums[mid]<nums[e]){
                e = mid;
            }else{
                e--;
            }
        }
        return nums[e];
    }
}

 