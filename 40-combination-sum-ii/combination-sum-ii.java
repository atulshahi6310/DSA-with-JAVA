class Solution {
    static void solve(int[] candidates, int target, int index, List<List<Integer>> ans,
            List<Integer> output) {
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            // candidates are sorted, so if current > target, all further ones will be too
            if (candidates[i] > target) break;

            // skip duplicates at the same recursion depth (not the same branch)
            if (i > index && candidates[i] == candidates[i - 1]) continue;

            output.add(candidates[i]);
            solve(candidates, target - candidates[i], i + 1, ans, output);
            output.remove(output.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }
}


// class Solution {
//     static void solve(int[] candidates, int target, int index, HashSet<List<Integer>> ans,
//             List<Integer> output) {
//                 // base casse of the solution 
//                 if(target ==0){
//                     // that means we got a combination to make the target 
//                     ans.add(new ArrayList<>(output));
//                     return;
//                 }
//                 if(index >=candidates.length){
//                     return;
//                 }

//                 if(target <0){
//                     return;
//                 }

//                 // include the given index to the combination and cheak is it make or target or not 
//                 output.add(candidates[index]);
//                 // include the given index in the output list 
//                 solve(candidates, target-candidates[index], index+1, ans, output);

//                 // when we have to eexclude the candinates  then we just need to backtrack

//                 output.remove(output.size()-1);

//                 // exclude the candinate 
//                 solve(candidates, target, index+1, ans, output);

//     }

//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         Arrays.sort(candidates);
//         List<List<Integer>> ans = new HashSet<>();
//         List<Integer> output = new ArrayList<>();
//         int index = 0;
//         solve(candidates, target, index, ans, output);

//         return new ArrayList<>(ans);
//     }
// }