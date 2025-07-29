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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        rec(root,a);
        return a;
    }
    static void rec(TreeNode root,ArrayList<Integer> a){
        if( root != null ){
             rec( root.left,a);
             rec( root.right,a);
             a.add ( root.val);
        }
    }
}