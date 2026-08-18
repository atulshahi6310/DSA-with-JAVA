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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode newhead = new ListNode(0);
        ListNode temp = newhead;
        int carry =0;

        while(temp1 != null || temp2 != null || carry != 0){
            int num1 = (temp1 != null) ? temp1.val:0;
            int num2 = (temp2!= null)?temp2.val:0;
            int sum = num1 +num2+carry;

            int num = sum%10;
             carry = sum/10;
            ListNode newNode = new ListNode(num);
            temp.next = newNode;
            temp = temp.next;
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }
        temp.next = null;
        return  newhead.next;
    }
}