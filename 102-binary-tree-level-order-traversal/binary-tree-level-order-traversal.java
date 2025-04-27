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
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> inner=new ArrayList<>();
            int size=q.size();
            for(int i=0; i<size;i++){
                TreeNode node=q.remove();
                if(node.left!=null){
                    q.add(node.left);   
                }
                if(node.right!=null){
                    q.add(node.right);   
                }
                inner.add(node.val);
            }
            list.add(inner);
        }
        return list;
        
    }
}