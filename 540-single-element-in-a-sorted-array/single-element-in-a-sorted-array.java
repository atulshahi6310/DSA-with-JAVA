class Solution {
    public int singleNonDuplicate(int[] arr) {
       
        int n = arr.length;
        int s = 0;
        int e =arr.length-1;
        int ans =-1;
        if(arr.length <2){
            return arr[0];
        }
        while(s<=e){
            int mid = s +(e-s)/2;

            int current_value = arr[mid];
            int prev =-1;

            if(mid-1 >=0){
                prev = arr[mid-1];
            }

            int next_value =-1;
            if(mid+1<n){
                next_value = arr[mid+1];
            }

            if(current_value != prev && current_value != next_value){
                return current_value;
            }
            else if(current_value != prev && current_value == next_value){

                int idx_of_pair = mid;
                if(idx_of_pair %2 !=0){
                    e = mid -1;
                }
                else{
                    s = mid +1;
                }
            }
           else if(current_value == prev && current_value != next_value){
                 int idx_of_pair = mid - 1;   // FIX

                if(idx_of_pair % 2 == 0){
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }

        }
        return -1;
    }
}