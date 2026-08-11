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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
            return null; // this means that out linkedlist only contain the head;;
        int idx = 0;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            idx++;
        }

        ListNode temp = head;

        for (int p = 0; p < idx - 1; p++) {
            temp = temp.next;
        }

        ListNode forw = slow.next;
        temp.next = forw;
        slow.next = null;
        return head;
    }
}