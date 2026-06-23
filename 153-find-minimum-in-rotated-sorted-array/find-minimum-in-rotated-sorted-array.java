class Solution {
    static int pivote(int[] arr){
        int n = arr.length;
        int s =0;
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid] <= arr[n-1]){
                e = mid-1;
            }else{
                s = mid +1;
                ans = mid;
            }
        }
        return ans;
    }
    public int findMin(int[] nums) {
        int result = pivote(nums);
        int n = nums.length;
       if(result == n-1){
            return nums[0];
        }
        return nums[result+1];
        
    }
}