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
    static ListNode head2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // revesr the linkedlist of the given head 
    static ListNode rev(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        // edge case
        if(head == null  || head.next == null){
            return true;
        }

        // find the mid of the linkedlist 
        ListNode list2 = head2(head);
        // break the linkedlist in two part  
        ListNode temp =head;
        while(temp.next != list2){
            temp = temp.next;
        }
        temp.next = null;

        // reverse the linked list 
        ListNode head2 = rev(list2);

        // now just heak is the both linkedlist is palandrom or not 
        ListNode temp1 = head;
        ListNode temp2 = head2;

        // now cheak for the palaindrome 
        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            }else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        return true;
        
    }
}