class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
       int s =0;
       int e =n-1;
       int ans = n;
       if(n<3) return -1;
       while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] >arr[mid+1]){
                ans = mid;
                e = mid -1;
            }else{
                s = mid+1;
            }
       }
       return ans;
       
    }
}

// brute force 
//  int max_index =0;
//         int n=arr.length;
//             for(int i=0;i<n;i++){
//                 if(arr[i] > arr[max_index]){
//                     max_index = i;
//                 }
//             }
//         return max_index;