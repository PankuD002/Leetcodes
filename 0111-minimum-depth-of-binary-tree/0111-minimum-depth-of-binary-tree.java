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
    public int minDepth(TreeNode root) {
        int x=0;
        int y=0;
        if(root==null)return 0;
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left==null){
            return 1+minDepth(root.right);
        }
        if(root.right==null){
            return 1+minDepth(root.left);
        }
        x=minDepth(root.left);
        y=minDepth(root.right);
        return 1+Math.min(x,y);
            
    }
}