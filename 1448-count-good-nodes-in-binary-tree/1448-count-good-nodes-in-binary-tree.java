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
    public int goodNodes(TreeNode root) 
    {
        return helper(root,0,Integer.MIN_VALUE);
    }
    private int helper(TreeNode root, int ans, int curmax)
    {
        if(root==null)
        return 0;
        int rootans=0;
        if(root.val>=curmax)
        {
            rootans=1;
            curmax=root.val;
        }
        int lans=helper(root.left, ans,curmax);
        int rans=helper(root.right,ans,curmax);
        return lans+rans+rootans;
    }
}