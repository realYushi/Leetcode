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
        this.next=null;
        this.prev=null;
    }
}
class MyLinkedList {
    Node dummyHead;
    Node dummyTail;
    int size;
    

    public MyLinkedList() {
        this.size=0;
        this.dummyHead=new Node();
        this.dummyTail=new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
    }
    
    public int get(int index) {
        if(index<0||index>=this.size){
            return  -1;
        }
        Node c = this.dummyHead.next;
        for(int i=0; i<index; i++){
            c=c.next;
        }
        return c.val;

        
    }
    
    public void addAtHead(int val) {
        Node node=new Node(val);
        node.next=this.dummyHead.next;
        node.prev=this.dummyHead;
        node.next.prev=node;
        node.prev.next=node;
        this.size++;
    }
    
    public void addAtTail(int val) {

        Node node=new Node(val);
        node.next=this.dummyTail;
        node.prev=this.dummyTail.prev;
        node.next.prev=node;
        node.prev.next=node;
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
        Node node=new Node(val);
        Node c=this.dummyHead.next;
        for(int i=0;i<index; i++){
            c=c.next;
        }
        node.next=c;
        node.prev=c.prev;
        node.next.prev=node;
        node.prev.next=node;
        this.size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=this.size){
            return;
        }
        Node c=this.dummyHead.next;
        for(int i=0; i<index; i++){
            c=c.next;
        }
        c.next.prev=c.prev;
        c.prev.next=c.next;
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