package alg.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class No49 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 递归
     * @param left
     * @param right
     * @return
     */
    public boolean fun(TreeNode left,TreeNode right) {
        if (left==null&&right==null) return true;
        if (left==null||right==null) return false;
        if (left.val!=right.val) return false;
        if (!fun(left.left,right.right)) return false;
        if (!fun(right.left,left.right)) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return fun(root.left,root.right);
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public boolean isSymmetric1(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1.val!=t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }
}
