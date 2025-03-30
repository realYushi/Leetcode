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
    public ListNode reverseList(ListNode head) {
        ListNode l=null;
        ListNode r=head;
        while(r!=null){
            ListNode temp=r.next;
            r.next=l;
            l=r;
            r=temp;
        }
        return l;
        
        
    }
}