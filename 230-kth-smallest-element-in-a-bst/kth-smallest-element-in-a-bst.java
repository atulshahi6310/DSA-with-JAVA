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
    public int ans =0;
    public int count =0;
    public void preorder(TreeNode root,int k){
        if(root == null || count >=k ){
            return;
        }
        preorder(root.left,k);
        count++;
        if(count == k){
            ans = root.val;
            return;
        }
        preorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
       count =0;
      preorder(root,k);
      return ans;

    }
}


/*
 public void preorder(TreeNode root,ArrayList<Integer> l){
        if(root == null){
            return;
        }
        preorder(root.left,l);
        l.add(root.val);
        preorder(root.right,l);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        preorder(root,l);
        Collections.sort(l);
        return l.get(k-1);
    }
*/