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
    public int dfs(TreeNode root,int min,int max){
        if(root == null){
            return Math.abs(max-min);
        }
        min = Math.min(root.val,min);
        max = Math.max(root.val,max);
        int l = dfs(root.left,min,max);
        int r = dfs(root.right,min,max);
        
        return Math.max(l,r);
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root == null) return 0;
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
        return dfs(root,min,max);
    }
}