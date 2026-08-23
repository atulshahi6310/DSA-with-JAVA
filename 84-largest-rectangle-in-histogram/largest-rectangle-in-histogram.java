class Solution {
    public int largestRectangleArea(int[] heights) {
        int max_area =0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        //next smallest right 
        Stack <Integer> s = new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        // next smaller left 
        s = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // area of the rectangle 
        for(int i=0;i<heights.length;i++){
            int height = heights[i];
            int width = nsr[i]-nsl[i]-1;
            int current_area = height*width;
            max_area = Math.max(current_area,max_area);
        }
        return max_area;
    }
}