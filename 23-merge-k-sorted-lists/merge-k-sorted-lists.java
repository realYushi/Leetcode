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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        for(int i=1; i<lists.length;i++){
            lists[i]=mergeLists(lists[i-1],lists[i]);
        }
        return lists[lists.length-1];
    }
    public ListNode mergeLists(ListNode l1,ListNode l2){
        ListNode dummyHead=new ListNode();
        ListNode temp=dummyHead;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                dummyHead.next=l1;
                l1=l1.next;
            }else{
                dummyHead.next=l2;
                l2=l2.next;
            }
            dummyHead=dummyHead.next;
        }
        if(l1==null){
            dummyHead.next=l2;
        }else{
            dummyHead.next=l1;
        }
        return temp.next;
    }
}