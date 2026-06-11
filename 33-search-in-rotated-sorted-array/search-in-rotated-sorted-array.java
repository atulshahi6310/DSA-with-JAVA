class Solution {
    static int pivote(int[] nums){
        int n = nums.length;
        int s = 0;
        int e =n-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] <= nums[n-1]){
                e = mid -1;
            }else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (nums.length == 0) {
        return -1;
        }
        int s1 =0;
        int pivote = pivote(nums);

        if (pivote == n) {
            pivote = n - 1;
        }

        int s2 = pivote + 1;
        int e = n-1;
        int ans =-1;


        if(target > nums[n-1]){
            // search in l1
            while(s1<=pivote){
                int mid = s1+(pivote-s1)/2;
                
                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] < target){
                    s1 = mid + 1;
                }else{
                    pivote = mid - 1;
                }
            }
            return ans;
        }else{
            // search in l2
            while(s2<=e){
                int mid = s2+(e-s2)/2;
                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] < target){
                    s2 = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
            return ans;

        }
        
    }
}


