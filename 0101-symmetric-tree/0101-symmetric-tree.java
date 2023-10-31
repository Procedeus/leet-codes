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
    public boolean isSymmetric(TreeNode root) {
        return confirm(root.left, root.right);
    }

    private boolean confirm(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null || p.val != q.val){
            return false;
        }
        return confirm(p.left, q.right) && confirm(p.right, q.left);
    }
}