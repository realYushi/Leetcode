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
        ListNode r = head;
        ListNode l = null;
        
        while(r!=null){
            ListNode t = r.next;
            r.next = l;
            l=r;
            r=t;
        }
        return l;
    }
}