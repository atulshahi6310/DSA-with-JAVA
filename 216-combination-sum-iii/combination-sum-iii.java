class Solution {
    //rec function 
    static void solve(List<List<Integer>> ans, List<Integer> output, int index, int count, int target,
            int[] cand, int k) {
        if (count > k) {
            return;
        }
        if (count == k && target == 0) {
            // we are able to make the target
            ans.add(new ArrayList<>(output));
            return;
        }
        if (index >= cand.length) {
            return;
        }
        if (target < 0) {
            return;
        }
        output.add(cand[index]);
        // include the index and call the function 

        solve(ans, output, index + 1, count + 1, target - cand[index], cand, k);

        // backtrack the includeed index from the output arraylist 
        output.remove(output.size() - 1);

        // // to genrate the unique combination we need to cheak the index and the upcomming index shoulde not be same
        // while(index+1 <cand.length && cand[index] == cand[index+1]){
        //     index++;
        // }
        solve(ans, output, index + 1, count, target, cand, k);

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] cand = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        int count = 0;
        int target = n;
        solve(ans, output, index, count, target, cand, k);
        return ans;

    }
}