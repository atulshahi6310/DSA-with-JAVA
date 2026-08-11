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
        ListNode temp = head;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            temp = temp.next;
            slow = slow.next;
            fast = fast.next.next;
            idx++;
        }
        ListNode forw = slow.next;
        temp.next = forw;
        slow.next = null;
        return head;
    }
}