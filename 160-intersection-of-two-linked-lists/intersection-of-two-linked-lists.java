/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1 =0, s2 =0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != null){
            s1++;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            s2++;
            temp2 = temp2.next;
        }
        ListNode first = headA;
        ListNode second =headB;
        if(s1> s2){
            for(int i =1; i<=(s1-s2);i++){
                first = first.next;
            }
            while(first != second){
                first = first.next;
                second = second.next;
            }
            
        }
        else if(s2>s1) {
              for(int i =1; i<=(s2-s1);i++){
                second = second.next;
            }
            while(first != second){
                first = first.next;
                second = second.next;
            }  
        }
        else{
             while(first != second){
                first = first.next;
                second = second.next;
            } 
        }
        return first;
    }
}