class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int prev =1;
        for(int i=0;i<n;i++){
            arr[i] =prev;
            prev *=nums[i];
        }
        int suff = 1;
        for(int i= n-1;i>=0;i--){
            arr[i]  *= suff;
            suff *=nums[i];
        }
        return arr;
    }
}

// brutr force
// int n = nums.length;
//         int[] arr = new int[n];
        
//         for(int i=0;i<n;i++){
//             int temp =1;
//             for(int j =0;j<n;j++){
//                 if(j==i){
//                     continue;
//                 }
//                 temp *=nums[j];
//             }
//             arr[i] = temp;
//         }
//         return arr;