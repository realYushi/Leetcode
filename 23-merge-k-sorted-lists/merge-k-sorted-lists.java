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
    private ListNode mergeKList(ListNode list1, ListNode list2){
        ListNode dummyHead= new ListNode();
        ListNode cur= dummyHead;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                cur.next=list1;
                list1=list1.next;
            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        if(list1==null){
            cur.next=list2;
        }else{
            cur.next=list1;
        }
        return dummyHead.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length<1){
            return null;
        }
        for(int i=1; i<lists.length;i++){
            lists[0]=mergeKList(lists[0],lists[i]);
        }
        return lists[0];
        
    }
}