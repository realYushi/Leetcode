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
        List<Integer> res= new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            TreeNode lastOne=null;
            for(int i=0; i<len; i++){
                lastOne=q.remove();
                if(lastOne.left!=null){
                    q.add(lastOne.left);
                }
                if(lastOne.right!=null){
                    q.add(lastOne.right);
                }
            }

            res.add(lastOne.val);
        }
        return res;
        
    }
}