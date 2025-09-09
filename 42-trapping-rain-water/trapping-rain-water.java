class Solution {
    public int trap(int[] height) {
        int lp = 0, rp = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trapped_water = 0;

        while (lp < rp) {
            if (height[lp] < height[rp]) {
                if (height[lp] >= leftMax) {
                    leftMax = height[lp];
                } else {
                    trapped_water += leftMax - height[lp];
                }
                lp++;
            } else {
                if (height[rp] >= rightMax) {
                    rightMax = height[rp];
                } else {
                    trapped_water += rightMax - height[rp];
                }
                rp--;
            }
        }

        return trapped_water;
    }
}
