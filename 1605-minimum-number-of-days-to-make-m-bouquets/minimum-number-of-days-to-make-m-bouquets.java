class Solution {
    static int completed(int mid, int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int completed_bouquets = 0;
        int glow_flower = 0;
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= mid) {
                glow_flower++;
                if (glow_flower == k) {
                    completed_bouquets++;
                    glow_flower =0;
                }
            }else {
                glow_flower = 0;
            }

        }
        return completed_bouquets;

    }

    public int minDays(int[] bloomDay, int m, int k) {
        int start = Integer.MAX_VALUE;
        int end = 0;
        int days = -1;
        for (int num : bloomDay) {
            if (num >= end) {
                end = num;
            }
            if(num <= start){
                start = num;
            }
        }
        while (start <= end) {
            // the mid is the possible day when the all fllower required is bloomed 
            int mid = start + (end - start) / 2;
            // ans tell me that how much bouquets are made till that mid day 
            int ans = completed(mid, bloomDay, m, k);
            if (ans < m) { // this is the possible min day when our total m bpoquets are going to be ready 
                start = mid + 1;
                
            } else if (ans >= m) {
                days = mid;
                end = mid - 1;
            }
        }
        return days;
    }
}