package alg.leetcode;

public class No44 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //哑节点
        ListNode dammy = new ListNode(0);
        ListNode tempNode = dammy;
        while (l1!=null||l2!=null) {
            if (l1 == null) {
                tempNode.next = new ListNode(l2.val);
                l2 = l2.next;
                tempNode = tempNode.next;
                continue;
            }
            if (l2 == null) {
                tempNode.next = new ListNode(l1.val);
                l1 = l1.next;
                tempNode = tempNode.next;
                continue;
            }
            if (l1.val<=l2.val) {
                tempNode.next = new ListNode(l1.val);
                l1 = l1.next;
                tempNode = tempNode.next;
            } else if (l1.val>l2.val) {
                tempNode.next = new ListNode(l2.val);
                l2 = l2.next;
                tempNode = tempNode.next;
            }
        }
        return dammy.next;
    }
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
