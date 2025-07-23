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
        this.next= null;
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
    public MyLinkedList(){
        this.dummyHead= new Node();
        this.dummyTail= new Node();
        this.dummyHead.next=this.dummyTail;
        this.size=0;
    }
    public int get(int index){
        if(index<0||index>=size){
            return -1;
        }
        Node cur= this.dummyHead;
        for(int i=0; i<=index; i++){
            cur= cur.next;
        }
        return cur.val;
    }
    public void addAtHead(int val){
        Node node= new Node(val);
        node.next=this.dummyHead.next;
        this.dummyHead.next=node;
        this.size++;
    }
    public void addAtTail(int val){
        Node node= new Node(val);
        Node cur= this.dummyHead;
        while(cur.next!=dummyTail){
            cur=cur.next;
        }
        node.next=dummyTail;
        cur.next=node;
        size++;
    }
    public void addAtIndex(int index, int val){
        if(index<0||index>this.size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==this.size){
            addAtTail(val);
            return;
        }
        Node node = new Node(val);
        Node cur= this.dummyHead;
        for(int i=0; i<index; i++){
            cur=cur.next;
        }
        node.next=cur.next;
        cur.next=node;
        size++;
    }
    public void deleteAtIndex(int index){
        if(index<0||index>=size){
            return;
        }
        Node cur= dummyHead;
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

