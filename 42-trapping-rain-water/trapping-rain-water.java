class Solution {
    public int trap(int[] height) {
      
        int n = height.length;
       int[] left_max = new int[n];   
        left_max [0] = height[0];
        for(int i =1 ; i<n ; i++){
            left_max[i] = Math.max(height[i],left_max[i -1]);
        }

        int[] right_max = new int [n];
        right_max [n-1] = height[n-1];
        for(int i = n-2 ; i>=0 ;i--){
            right_max[i] = Math.max(height[i],right_max[i + 1]);
        }

        int traped_water = 0;
        for(int i=0; i<n ; i++){
            int water_level = Math.min(left_max[i] , right_max[i]);

            traped_water += water_level - height[i];
        }

        return traped_water;
    }
} 
    