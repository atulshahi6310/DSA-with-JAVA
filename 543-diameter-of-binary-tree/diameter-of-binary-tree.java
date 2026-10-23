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
    static int  dia =0 ;
    static int depth(TreeNode root){
        if(root == null) return 0;
        int lefttree = depth(root.left);
        int righttree = depth(root.right);
        dia = Math.max(dia,lefttree+righttree);
        return Math.max(lefttree , righttree)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
       dia = 0;
       depth(root);
       return dia;
    }
}