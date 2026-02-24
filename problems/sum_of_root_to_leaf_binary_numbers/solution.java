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
    public int sumRootToLeaf(TreeNode root) {
        return Dfs(root,0);
    }
    int Dfs( TreeNode node, int current){
        if(node == null) return 0;
        current = (current<<1) | node.val;
        if(node.right == null && node.left == null ){
            return current;
        }
        return Dfs(node.left,current) + Dfs(node.right,current);
    }
}