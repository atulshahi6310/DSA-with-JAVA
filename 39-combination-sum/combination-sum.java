class Solution {
    static void solve(int [] candidates,int target,List<Integer> output,List<List<Integer>>  ans,int index ){
        // base case of the recurseve function 
        if(target ==0){
            ans.add(new ArrayList <>(output));
            return ;
        }
        if(index >= candidates.length){
            return ;
        }
        if(target <0){
            return; // this is the condition when the target get negative 
        }

        // solve the one case 
        // include the given ccandinate index in the list 
        output.add(candidates[index]);
        solve(candidates,target-candidates[index],output,ans,index);      
        // backtrack the include cand 
        output.remove(output.size()-1);
        // exclude the candinate from the array 
        solve(candidates, target,output,ans,index+1);

        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>  ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>(); // this is the  combination of the candinate whose sum is equal to the target

        int index =0;
        solve(candidates, target,output,ans,index);
        return ans;
    }
}