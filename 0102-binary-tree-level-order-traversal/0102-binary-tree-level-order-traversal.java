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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> t=new ArrayList<>();
        helper(root,0,t);
        return t;
    }
    private void helper(TreeNode root, int level, List<List<Integer>> t)
    {
        if(root==null) return;
        if(t.size()==level)
        t.add(new ArrayList<>());
        t.get(level).add(root.val);
        helper(root.left,level+1,t);
        helper(root.right,level+1,t);
    }
}