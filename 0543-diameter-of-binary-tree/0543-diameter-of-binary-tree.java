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
    public int diameterOfBinaryTree(TreeNode root) 
    {
        int d=0;
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        d=Math.max(d,r+l);
        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        return Math.max(d, Math.max(ld, rd));
        
    }
    public int height(TreeNode root)
    {
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right); return Math.max(l,r)+1;

    }
}