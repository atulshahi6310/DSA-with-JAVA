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
    int max_sum =Integer.MIN_VALUE;
    public int maxpath(TreeNode root){
        if(root == null){
            return 0;
        }
        int lsub =Math.max(0, maxpath(root.left));
        int rsub =Math.max(0, maxpath(root.right));
        max_sum = Math.max(max_sum,lsub+rsub+root.val);
        return root.val +Math.max(lsub,rsub);
    }
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        maxpath(root);
        return max_sum;
    }
}