/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static int size(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size = size + 1;
            temp = temp.next;
        }
        return size;

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = size(head);
        int index = size - n;

        if (index == 0) {
            return head.next;
        }

        ListNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        ListNode cur = temp.next;
        ListNode forw = cur.next;
        temp.next = forw;
        cur.next = null;
        return head;
    }
}