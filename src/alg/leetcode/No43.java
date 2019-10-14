package alg.leetcode;

public class No43 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 双指针法
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (head!=null) {
            if (head.next==null) {
                cur.next = prev;
                break;
            } else {
                head = head.next;
                cur.next = prev;
                prev = cur;
                cur = head;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new No43.ListNode(1);
        ListNode head2 = new No43.ListNode(2);
        ListNode head3 = new No43.ListNode(3);
        ListNode head4 = new No43.ListNode(4);
        ListNode head5 = new No43.ListNode(5);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        new No43().reverseList(head);
    }
}
