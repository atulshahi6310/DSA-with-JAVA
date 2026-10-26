/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       List<List<Integer>> ll = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> l = new ArrayList<>();
        if(root == null){
            return l;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                ll.add(l);
                l = new ArrayList<>();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                l.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }

            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<ll.size();i++){
            ans.add(ll.get(i).get(ll.get(i).size()-1));
        }
        return ans;
    }
}