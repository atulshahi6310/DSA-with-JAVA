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
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {
                ans.add(l.get(l.size() - 1));
                l = new ArrayList<>();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                l.add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }

            }
        }
        return ans;
    }
}