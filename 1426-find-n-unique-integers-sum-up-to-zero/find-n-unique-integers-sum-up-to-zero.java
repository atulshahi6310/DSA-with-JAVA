class Solution {
    public int[] sumZero(int n) {
            int[] arr = new int[n]; 
            int lp =0;
            for(int i = 1 ; i <= n/2 ; i++){
                
                arr[lp++] = i;
                arr[lp++] = -i;
                
                if (n%2 == 1){
                    arr[lp] =0;
                }
                
            }
        return arr ;
    }
}