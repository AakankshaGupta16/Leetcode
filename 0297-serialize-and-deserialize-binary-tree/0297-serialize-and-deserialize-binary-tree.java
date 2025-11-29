/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Codec 
{
    // Helper to serialize using preorder
    public String recserialize(TreeNode root, String str) {
        if (root == null) {
            str += "null,";
        } else {
            str += root.val + ",";
            str = recserialize(root.left, str);
            str = recserialize(root.right, str);
        }
        return str;
    }
    // Helper to deserialize using preorder list
    public TreeNode recdeserialize(List<String> list) 
    {
        if (list.get(0).equals("null")) 
        {
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);

        root.left = recdeserialize(list);
        root.right = recdeserialize(list);

        return root;
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
        return recserialize(root, "");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        String[] strarr = data.split(",");
        List<String> strlist = new LinkedList<>();

        // ignore possible empty token at the end
        for (String s : strarr) 
        {
            if (!s.isEmpty()) 
                strlist.add(s);
        }

        return recdeserialize(strlist);
    }
}
