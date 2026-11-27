class Solution {
    public int maximumSaleItems(int[][] items, int b) {
        int n = items.length;
        int [] fc = new int[n];
        int mp =Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            mp = Math.min(mp,items[i][1]);

            
            int count =0;
            for(int j=0;j<n;j++){
                if(items[j][0]%items[i][0] ==0){
                    count++;
                }
            }
            fc[i] = count;
        }
        int []dp = new int[b+1];
        for(int i=0;i<n;i++){
            int p =items[i][1];
            int gain = fc[i];
            for(int w = b; w>= p;w--){
                dp[w] = Math.max(dp[w],dp[w -p]+gain);
            }
        }
        int mx =0;
        for(int w =0; w<=b;w++){
            int tg =dp[w] +(b-w) /mp;
            mx = Math.max(mx,tg);
        }
        return mx;
    }
}