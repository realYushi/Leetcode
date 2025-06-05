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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0){
            return null;
        }
        TreeNode node=new TreeNode(preorder[0]);
        int m=0;
        for(int i=0; i<inorder.length; i++){
            if(node.val==inorder[i]){
                m=i;
            }
        }
        int[]Lpreorder=Arrays.copyOfRange(preorder,1,m+1);
        int[]Linorder=Arrays.copyOfRange(inorder,0,m);
        node.left=buildTree(Lpreorder,Linorder);
        int[]Rpreorder=Arrays.copyOfRange(preorder,m+1,preorder.length);
        int[]Rinorder=Arrays.copyOfRange(inorder,m+1,inorder.length);
        node.right=buildTree(Rpreorder,Rinorder);
        return node;
        
    }
}