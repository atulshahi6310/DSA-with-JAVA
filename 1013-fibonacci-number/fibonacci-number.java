class Solution {
    public int fib(int n) {
        int result =0;
        int n1 =0;
        int n2 = 1;
        if(n==0) return 0;
        if(n==1) return 1;
        for(int i = n2;i<n;i++){
            result = n1+n2;
            n1 =n2;
            n2 =result;
        }   
        return n2 ;
    }
}