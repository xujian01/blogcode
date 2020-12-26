package alg.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No42 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0,tail=0;
        ListNode temp = head;
        Map<Integer,ListNode> map = new HashMap<>();
        while (temp!=null) {
            map.put(i,temp);
            if (temp.next==null) tail = i;
            i++;
            temp=temp.next;
        }
        if(map.size()==1) return null;
        ListNode node = map.get(tail-n+1);
        if (node.next==null) {
            ListNode prevNode = map.get(tail-n);
            prevNode.next = null;
        } else {
            node.val = node.next.val;
            node.next = node.next.next;
        }
        return head;
    }
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        ListNode second = head;
        //先让first走n步，走到n+1个节点处
        for (int i=0;i<n;i++) {
            first = first.next;
        }
        while (first!=null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new No42.ListNode(1);
//        ListNode head2 = new No42.ListNode(2);
//        ListNode head3 = new No42.ListNode(3);
//        ListNode head4 = new No42.ListNode(4);
//        ListNode head5 = new No42.ListNode(5);
//        head.next = head2;
//        head2.next = head3;
//        head3.next = head4;
//        head4.next = head5;
        new No42().removeNthFromEnd(head,1);
    }
}
