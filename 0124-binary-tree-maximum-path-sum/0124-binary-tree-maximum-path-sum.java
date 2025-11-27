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
class Solution 
{
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) 
    {
        maxgain(root);
        return maxsum;
    }
    private int maxgain(TreeNode root)
    {
        if(root==null) return 0;
        int leftg=Math.max(maxgain(root.left),0);
        int rightg=Math.max(maxgain(root.right),0);
        int currpath=root.val+leftg+rightg;
        maxsum=Math.max(maxsum,currpath);
        return root.val+Math.max(leftg,rightg);
    }
}