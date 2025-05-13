class Node{
    int val;
    Node next;
    Node prev;
    public Node(int val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
    public Node(){
        this.val=0;
        this.next=null;
        this.prev=null;
    }
}
class MyLinkedList {
    Node dummyHead;
    Node dummyTail;
    int size;

    public MyLinkedList() {
        this.dummyHead=new Node();
        this.dummyTail=new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
        this.size=0;
    }
    
    public int get(int index) {
        if(index>=this.size){
            return -1;
        }
        Node cur=this.dummyHead.next;
        for(int i=0; i<index;i++){
            cur=cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        Node newHead=new Node(val);
        newHead.prev=this.dummyHead;
        newHead.next=this.dummyHead.next;
        newHead.prev.next=newHead;
        newHead.next.prev=newHead;
        this.size++;
    }
    
    public void addAtTail(int val) {
        Node newTail=new Node(val);
        newTail.next=this.dummyTail;
        newTail.prev=this.dummyTail.prev;
        newTail.next.prev=newTail;
        newTail.prev.next=newTail;
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>this.size){
            return;
        }
        if(index==this.size){
            this.addAtTail(val);
            return;
        }
        if(index==0){
            this.addAtHead(val);
            return;
        }
        Node node = new Node(val);
        Node cur= this.dummyHead.next;
        for(int i= 0; i<index; i++){
            cur=cur.next;
        }
        node.next=cur;
        node.prev=cur.prev;
        node.next.prev=node;
        node.prev.next=node;
        this.size++;
        return;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index>=this.size){
            return;
        }
        Node node= this.dummyHead.next;
        for(int i=0; i<index;i++){
            node=node.next;
        }
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
        this.size--;
        return;
        
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