class Solution {
    static  int cheak_smallest_divisor(int[] arr,int n, int mid){
        int ans =0;
        for(int i=0;i<n;i++){
            ans += (arr[i]+mid -1)/mid;
        }
        return  ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        //easy
        // calculate the divisor from here and passs to the function of the sumationa and division of the  array 
        int n = nums.length;
        int min_divisor =1;
        int max_divisor =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] > max_divisor){
                max_divisor = nums[i];
            }
        }
        int smallest_divisor =-1;
        while(min_divisor<=max_divisor){
            int mid = min_divisor +(max_divisor-min_divisor)/2;
            int sum = cheak_smallest_divisor(nums,n,mid);
            if(sum <=threshold){
                smallest_divisor =mid;
                max_divisor = mid-1;
            }else{
                min_divisor = mid+1;
            }
        }
        return smallest_divisor;
    }
}