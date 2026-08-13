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
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null ||  head.next == null)
            return head;
        int size = size(head);
        k = k % size;
        if (k == 0)
            return head;

        // now we got a index of the k  from the last 
        int index = size - k;
        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        ListNode newhead = temp.next;
        temp.next = null;
        curr.next = head;
        return newhead;
    }
}