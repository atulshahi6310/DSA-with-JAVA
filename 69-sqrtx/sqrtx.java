class Solution {
    public int mySqrt(int x) {
        int n = x;
        int start =1;
        int end = x/2;
        int ans = -1;
        if(x ==0) return 0;
        if(x ==1) return 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            long square = (long) mid * mid;
            if( square == n){
                return mid;
            }else if( square>n){
                end = mid -1;
            }else{
                ans = mid;
                start =mid+1;
            }
        }

        return ans;
        
    }
}