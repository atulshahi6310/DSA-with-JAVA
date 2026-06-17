class Solution {
    static int lowerbound(int[] arr , int target){
        int n = arr.length;
        int s =0;
        int e = n-1;
        int ans = n;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid] >=target){
                ans =mid;
                e = mid -1;
            }else{
                s = mid +1;
            }
        }
        return ans;
    }
    static int upperbond(int[] arr ,int target){
        int n = arr.length;
        int s =0;
        int e = n-1;
        int ans = n;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid] > target){
                ans =mid;
                e = mid -1;
            }else{
                s = mid +1;
            }
        }
        return ans;

    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int n = nums.length;
        
        int low = lowerbound(nums,target);
        int high = upperbond(nums,target) -1;

        arr[0] = low;
        arr[1] = high;
        if (arr[0] > arr[1]) {
            return new int[]{-1, -1};
        }   

        return arr;
        
        
    }
}