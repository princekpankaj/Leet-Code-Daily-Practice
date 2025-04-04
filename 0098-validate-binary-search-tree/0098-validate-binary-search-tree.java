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
    public void inorder(List<Integer> res,TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(res,root.left);
        res.add(root.val);
        inorder(res,root.right);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        inorder(res,root);
        for(int i=0;i<res.size()-1;i++)
        {
            if(res.get(i)>=res.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}