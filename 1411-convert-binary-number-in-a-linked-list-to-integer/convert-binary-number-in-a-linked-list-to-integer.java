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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        String st ="";
        while(temp != null){
            int data = temp.val;
            st += data;
            temp = temp.next;
        }
        return  Integer.parseInt(st, 2); 
    }
}