class Solution {
    public int trap(int[] height) {
        int n = height.length;
        //edge cases 
        // this is the case where only two pillers we can not stoore the water b/w two piller
        if(n<2){
            return 0;
        }
       // handleing the assendingg and decending order  __ because the left max and right max boundary can handle the case  of the assending and the dessending order case 

        //calculate the left most boundeary 
        
        int left_boundary[] = new int[n];
         left_boundary[0] = height[0];
        for(int i=1;i<n;i++){
            left_boundary[i] =Math.max(left_boundary[i-1], height[i]);
        }
        //calculate the rightmost boundary 
         
        int right_boundary[] = new int[n];
        right_boundary[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
           right_boundary[i] =  Math.max(right_boundary[i+1], height[i]);
           
        }

        int traped_water =0;
        // formula for the traped water is : trapped_water = (water_height - bar_height)*1;
        for(int i=0;i<n;i++){
            int water_height = Math.min(left_boundary[i],right_boundary[i]);
            int temp_store = water_height-height[i];
            if(temp_store>0){
                traped_water += temp_store;
            }
        }
        return traped_water;
    }
}