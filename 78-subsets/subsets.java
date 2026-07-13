class Solution {
    static void solve(List<List<Integer>> subset,int index,int[] nums,List<Integer> list){
        // this is the recursion function which is going to make our cases 

        //base case 
        if(index >= nums.length){
            subset.add(new ArrayList<>(list));
            return;
        }
        // this is the list of the subset 
        // List<Integer> list = new ArrayList<>();

        // include the current index
        list.add(nums[index]);
        //include that index
        solve(subset,index+1,nums,list);
        // remove the element inside the l list 
        list.remove(list.size()-1);

        // exclude the index
        solve(subset,index+1,nums,list);

    }
    public List<List<Integer>> subsets(int[] nums) {
        int index =0;// this is the index of travel in the array \
        List<List<Integer>> subset = new ArrayList<>();
        solve(subset,index,nums,new ArrayList<>()); // passing this as a form of the refrences 
        return subset;
    }
}

// this problem contain the time comppplexity of the o(2^n);
// the space complexity is the o(n);