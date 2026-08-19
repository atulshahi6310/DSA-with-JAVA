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
    static int size(ListNode  head){
        ListNode temp = head;
        int size =0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public ListNode oddEvenList(ListNode head) {
        ListNode evenNode = new ListNode(0);
        ListNode oddNode = new ListNode(0);
        ListNode temp1 = evenNode;
        ListNode temp2 = oddNode;
        ListNode temp = head;
        int size = size( head);

        for(int i=1;i<=size;i++){
            if(i%2==0){
                temp1.next =temp;
                temp1 =temp;
            }else{
                temp2.next = temp;
                temp2 = temp;
            }
            temp = temp.next;
        }
        temp2.next = evenNode.next;
        temp1.next = null;

        return oddNode.next ; 


        


    }
}