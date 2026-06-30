class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lp=0;
        int rp = n-1;
        int max_container = Integer.MIN_VALUE;

        while(lp<=rp){
            int bar_height = Math.min(height[lp],height[rp]);
            int width = rp-lp;
            int contain_water = bar_height * width;
            max_container = Math.max(max_container,contain_water);
            if(height[lp] >height[rp]){
                rp--;
            }else{
                lp++;
            }
        }
        return max_container;
    }
}