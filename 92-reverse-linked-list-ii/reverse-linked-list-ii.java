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
    static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }

        ListNode start = head;
        ListNode prev = null;

        for (int i = 1; i < left; i++) {
            prev = start;
            start = start.next;
        }

        ListNode tail = start;

        for (int i = left; i < right; i++) {
            tail = tail.next;
        }

        ListNode forw = tail.next;

        tail.next = null;

        ListNode revhead = reverse(start);

        if (prev != null) {
            prev.next = revhead;
        } else {
            head = revhead;
        }

        start.next = forw;

        return head;
    }
}