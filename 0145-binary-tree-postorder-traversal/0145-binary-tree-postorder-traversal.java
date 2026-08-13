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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        List<Integer> ans=new ArrayList<>();
        st1.push(root);
        if(root==null) return ans;
        while(!st1.isEmpty())
        {
            TreeNode x=st1.pop();
            st2.push(x);
            if(x.left!=null)
            st1.push(x.left);
            if(x.right!=null)
            st1.push(x.right);
        }
        while(!st2.isEmpty())
        {
            TreeNode a=st2.pop();
            ans.add(a.val);
        }
        
        return ans;
    }
}