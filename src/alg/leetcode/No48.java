package alg.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class No48 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;
        int val = node.val;
        if (lower!=null&&lower>=val) return false;
        if (upper!=null&&upper<=val) return false;
        if (!helper(node.right,val,upper)) return false;
        if (!helper(node.left,lower,val)) return false;
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    public boolean isValidBST1(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        TreeNode pre = null;
        while (p!=null||!stack.isEmpty()) {
            while (p!=null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (pre!=null&&pre.val>=p.val) return false;
            pre = p;
            p = p.right;
        }
        return true;
    }
}
