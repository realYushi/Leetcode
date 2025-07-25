/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int len = q.size();
            TreeNode temp = null;
            for (int i = 0; i < len; i++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.add(node.left);
                } 
                if (node.right != null) {
                    q.add(node.right);
                }
                temp = node;
            }
            list.add(temp.val);
        }
        return list;

    }
}