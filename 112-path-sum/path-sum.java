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
    public boolean dfs(TreeNode node, int cur,int targetSum){
        if(node==null){
            return false;
        }
        cur+=node.val;
        if(node.left==null&&node.right==null){
            return cur==targetSum;
        }
        return dfs(node.left,cur,targetSum)||dfs(node.right,cur,targetSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,0,targetSum);
        
    }
}