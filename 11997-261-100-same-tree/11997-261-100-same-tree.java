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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        
        Queue<TreeNode> node_p = new LinkedList<>();
        Queue<TreeNode> node_q = new LinkedList<>();

        node_p.add(p);
        node_q.add(q);

        while (!node_p.isEmpty() && !node_q.isEmpty()) {
            TreeNode node1 = node_p.poll();
            TreeNode node2 = node_q.poll();

            // Compare values
            if (node1.val != node2.val) return false;

            // Compare left children
            if (node1.left != null && node2.left != null) {
                node_p.add(node1.left);
                node_q.add(node2.left);
            } else if (node1.left != null || node2.left != null) {
                return false;
            }

            // Compare right children
            if (node1.right != null && node2.right != null) {
                node_p.add(node1.right);
                node_q.add(node2.right);
            } else if (node1.right != null || node2.right != null) {
                return false;
            }
        }

        return node_p.isEmpty() && node_q.isEmpty();
    }

}