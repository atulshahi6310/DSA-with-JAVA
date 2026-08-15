class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode curr = head;

        while (curr != null) {
            // if curr starts a duplicate run, skip all of them
            if (curr.next != null && curr.val == curr.next.val) {
                int dupVal = curr.val;
                while (curr != null && curr.val == dupVal) {
                    curr = curr.next;
                }
            } else {
                temp.next = curr;
                temp = temp.next;
                curr = curr.next;
            }
        }
        temp.next = null; // terminate list, in case last kept node had a stale next
        return dummy.next;
    }
}