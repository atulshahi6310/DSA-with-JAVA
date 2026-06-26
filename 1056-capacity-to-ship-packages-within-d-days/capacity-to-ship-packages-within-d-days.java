class Solution {
    static int dayneed(int[] weights , int cap,int n){
        // brute force for the  calculate the days acc to capacity
        int days =1;
        int crr_load =0;
        for(int i=0;i<n;i++){
            if(crr_load + weights[i] > cap){
                days++;
                crr_load = weights[i];
            }else{
                crr_load += weights[i];
            }
        }
        return days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max =-1;
        int sum =0;
        for(int i =0;i<n;i++){
            if(weights[i] > max){
                max = weights[i];

            }
            sum += weights[i];
        }
        int low = max;
        int heigh = sum;
        int ans =-1;
        
        while(low <= heigh){
            int mid = low +(heigh - low)/2;
            int need_days = dayneed(weights , mid ,n);
            if(need_days <= days){
                ans = mid;
                heigh = mid-1;
            }else{
                low =mid+1;
            }
        }
        return ans;


    }/// this solutuin take o(n) +o(n)*o(n) = n+n^2 ~= n^2;
}

/* 
    static int dayneed(int[] weights , int cap,int n){
        // brute force for the  calculate the days acc to capacity
        int days =1;
        int crr_load =0;
        for(int i=0;i<n;i++){
            if(crr_load + weights[i] > cap){
                days++;
                crr_load = weights[i];
            }else{
                crr_load += weights[i];
            }
        }
        return days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max =-1;
        int sum =0;
        for(int i =0;i<n;i++){
            if(weights[i] > max){
                max = weights[i];

            }
            sum += weights[i];
        }
        int low = max;
        int heigh = sum;

        for(int i =low ;i<heigh;i++){
            int number_of_days = dayneed(weights ,i,n);
            if(number_of_days <= days){
                return i;
            }
        }
        return heigh;
    }/// this solutuin take o(n) +o(n)*o(n) = n+n^2 ~= n^2;
*/ 