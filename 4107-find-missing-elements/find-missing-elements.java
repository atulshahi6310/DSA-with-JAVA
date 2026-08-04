class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        int s= nums[0];
        int e = nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i] == s){
                s++;
            }else{
                l.add(s);
                s++;
                i=i-1;
            }
        }
        return l;
    }
}