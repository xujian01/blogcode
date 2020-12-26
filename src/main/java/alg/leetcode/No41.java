package alg.leetcode;

public class No41 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 由于不知道删除节点之前的节点，常规思路不可行。
     * 所以需要讲被删除节点之后的节点复制到被删除节点位置，然后删除被删除节点之后的节点
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
