class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
      
        
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
      
        Map<Integer, Integer> nextGreaterMap = new HashMap<>(nums2Length);
      
        for (int i = nums2Length - 1; i >= 0; i--) {
            int currentNum = nums2[i];
            while (!stack.isEmpty() && stack.peek() < currentNum) {
                stack.pop();
            }
          
            if (!stack.isEmpty()) {
                nextGreaterMap.put(currentNum, stack.peek());
            }

            stack.push(currentNum);
        }
      

        int[] result = new int[nums1Length];
        for (int i = 0; i < nums1Length; i++) {
           
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }
      
        return result;
    }
}
