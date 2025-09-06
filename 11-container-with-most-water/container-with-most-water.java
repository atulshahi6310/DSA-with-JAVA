class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length -1;
        int contain_water =0 ;
        while(lp < rp){
            int current_height = Math.min(height[lp] , height[rp]);
            int current_width = rp - lp;
            int currrent_water = current_height * current_width ;
            contain_water = Math.max(contain_water,currrent_water);
            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return contain_water;
    }
}