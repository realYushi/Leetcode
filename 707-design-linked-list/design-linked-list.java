/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */

// @lc code=start
class Node{
    Node next;
    int val;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
    public Node(){
        this.val=0;
        this.next=null;
    }
}
class MyLinkedList {
    Node dummyHead;
    Node dummyTail;
    int size;
    public MyLinkedList() {
        this.dummyHead=new Node();
        this.dummyTail=new Node();
        dummyHead.next=dummyTail;
        this.size=0;
    }
    
    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }
        Node cur= dummyHead;
        for(int i = 0; i<=index; i++){
            cur=cur.next;
        }
        return cur.val;

        
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next=dummyHead.next;
        dummyHead.next=node;
        size++;
    }
    
    public void addAtTail(int val) {
        Node node= new Node(val);
        Node cur= dummyHead;
        while(cur.next!=dummyTail){
            cur=cur.next;
        }
        node.next=dummyTail;
        cur.next=node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>size){
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        Node cur= dummyHead;
        Node node= new Node(val);
        for(int i=0; i<index; i++){
            cur=cur.next;
        }
        node.next=cur.next;
        cur.next=node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=size){
            return;
        }
        Node cur=dummyHead;
        for(int i=0; i<index; i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

