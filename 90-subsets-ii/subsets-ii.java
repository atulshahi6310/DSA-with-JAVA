class Solution {
    static void solve(Set<List<Integer>> set ,int index,int[] nums,List<Integer> list){
        if(index >=nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        Arrays.sort(nums);
        list.add(nums[index]);
        solve(set,index+1,nums,list);
        list.remove(list.size()-1);
        solve(set,index+1,nums,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int index =0;
        Set<List<Integer>> set  = new HashSet<>();
        solve(set,index,nums,new ArrayList<>());
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}