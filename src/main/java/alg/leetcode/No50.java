package alg.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No50 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            res.add(new ArrayList<>());
            int levelLength = queue.size();
            for (int i=0;i<levelLength;i++) {
                TreeNode node = queue.remove();
                res.get(level).add(node.val);
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
            }
            level++;
        }
        return res;
    }
    List<List<Integer>> res = new ArrayList<>();
    public void doLevelOrder(TreeNode node,Integer level) {
        if (level == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        if (node.left!=null) doLevelOrder(node.left,level+1);
        if (node.right!=null) doLevelOrder(node.right,level+1);
    }
    /**
     * 递归
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder1(TreeNode root) {
        if (root==null) return res;
        doLevelOrder(root,0);
        return res;
    }
}
