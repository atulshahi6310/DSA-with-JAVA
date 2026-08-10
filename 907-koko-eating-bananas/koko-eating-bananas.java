class Solution {
    static long bananas(int[] piles, long mid,int n){
        // calculate is hourse she finished the total bananas in with that k;
        long hour = 0;
        long bananas = 0;
        for(int i = 0; i < n; i++){
            bananas =piles[i] + mid-1;
            hour += bananas/mid;
        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n =piles.length;
       
        long sum =0;
        for(int i =0;i<n;i++){
            sum = Math.max(sum ,piles[i]);
        }
        long low = 1;
        long heigh = sum;
        long ans =-1;
        while(low<=heigh){
            long mid = low +(heigh -low)/2;
            long bananasPerHour = bananas(piles,mid,n);
            if(bananasPerHour <= h){
                ans = mid;
                heigh = mid-1;
            }else{
                low = mid +1;
            }
        }
        return (int) ans;
        
        
    }
}