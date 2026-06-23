class Solution {
    public boolean search(int[] arr, int target) {
        if (arr == null || arr.length == 0) return false;
        
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return true;
            }

          
            if (arr[s] == arr[mid] && arr[mid] == arr[e]) {
                s++;
                e--;
                continue;
            }

            
            if (arr[s] <= arr[mid]) {
                if (target >= arr[s] && target < arr[mid]) {
                    e = mid - 1; 
                } else {
                    s = mid + 1; 
                }
            } 
            
            else {
                if (target > arr[mid] && target <= arr[e]) {
                    s = mid + 1; 
                } else {
                    e = mid - 1; 
                }
            }
        }
        return false;
    }
}

//  // brute force
//         int  n = arr.length;
//         for(int i =0;i<n;i++){
//             if(arr[i] == target){
//                 return true;
//             }
//         }
//         return false; // time complexity o(n)  linear search 