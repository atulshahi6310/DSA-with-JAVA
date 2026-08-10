class Solution {
    public int singleNonDuplicate(int[] arr) {
         int n = arr.length;
        int low = 0, high = n - 2; // search only even indices up to n-2
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            mid -= (mid % 2); // ensure mid is even
            
            if (arr[mid] == arr[mid + 1]) {
                // pair is intact, single element is after mid
                low = mid + 2;
            } else {
                // pair is broken, single element is at or before mid
                high = mid - 1;
            }
        }
        
        return arr[low]; 
    }
}