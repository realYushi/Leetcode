class Node{
    Node next;
    Node prev;
    int val;
    public Node(int val){
        this.next=null;
        this.prev=null;
        this.val=val;
    }
    public Node(){
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
        if(index<0||index>=size){
            return -1;
        }
        Node curr=this.dummyHead.next;
        for(int i =0; i<index; i++){
            curr=curr.next;
        }
        return curr.val;
        
    }
    
    public void addAtHead(int val) {
        Node curr=new Node(val);
        curr.next=this.dummyHead.next;
        curr.prev=this.dummyHead;
        curr.next.prev=curr;
        curr.prev.next=curr;
        this.size++;
        
    }
    
    public void addAtTail(int val) {
        Node curr=new Node(val);
        curr.next=this.dummyTail;
        curr.prev=this.dummyTail.prev;
        curr.next.prev=curr;
        curr.prev.next=curr;
        this.size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>this.size){
            return;
        }
        if(index==0){
            this.addAtHead(val);
            return;
        }
        if(index==this.size){
            this.addAtTail(val);
            return;
        }
        Node node = new Node(val);
        Node curr=this.dummyHead.next;
        for(int i=0; i<index; i++){
            curr=curr.next;
        }
        node.next=curr;
        node.prev=curr.prev;
        node.next.prev=node;
        node.prev.next=node;
        this.size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=this.size){
            return;
        }
        Node curr=this.dummyHead.next;
        for(int i=0; i<index; i++){
            curr=curr.next;
        }
        curr.next.prev=curr.prev;
        curr.prev.next=curr.next;
        this.size--;
        
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