class Solution {
    public boolean isPowerOfTwo(int n) {
        // for(long i=0;i*i<=n+1;i++){
            
        //     if(Math.pow(2,i) == n){
        //         return true;
        //     }
        // }
        // return false;
        if(n==0) return false;
        while(n%2==0){
            n/=2;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}