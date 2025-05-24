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
    private void bsf(List<List<Integer>> list, TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len= q.size();
            List<Integer> sub = new ArrayList<>();
            for(int i=0; i<len; i++){
                TreeNode node = q.remove();
                sub.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            list.add(new ArrayList<>(sub));
        }
        return;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
        if(root==null){
            return list;
        }
        bsf(list,root);
        return list;
    }
}