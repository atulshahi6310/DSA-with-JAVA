class Solution {
    static int find_pivote(int[] nums ,int n){
        int s = 0;
        int e = n-1;
        int ans =n-1;
        while(s<=e){
            int mid = s +(e -s)/2;
            if(nums[mid]>nums[n-1]){
                s = mid+1;
                ans = mid;
            }else{
                
                e = mid -1;
            }
        }
        return ans;
    }
    public int findMin(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int pivote = find_pivote(nums,n);
        
        if(pivote == n-1){
            return nums[0];
        }
        return nums[pivote+1];
        
    }
}