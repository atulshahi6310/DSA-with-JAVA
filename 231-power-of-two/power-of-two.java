class Solution {
    public boolean isPowerOfTwo(int n) {
        for(long i=0;i*i<=n+1;i++){
            
            if(Math.pow(2,i) == n){
                return true;
            }
        }
        return false;
    }
}