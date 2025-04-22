class Node{
    Node prev;
    Node next;
    int val;
    public Node(int val){
        this.val=val;
        this.prev=null;
        this.next=null;
    }
    public Node(){
        this.prev=null;
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
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
        this.size=0;
    }
    
    public int get(int index) {
        if(index<0||this.size<=index){
            return -1;
        }
        Node cur=this.dummyHead.next;
        for(int i=0; i<index;i++){
            cur=cur.next;
        }
        return cur.val;
        
    }
    
    public void addAtHead(int val) {
        Node node=new Node(val);
        node.next=this.dummyHead.next;
        node.prev=this.dummyHead;
        node.prev.next=node;
        node.next.prev=node;
        this.size++;
        

        
    }
    
    public void addAtTail(int val) {
        Node node=new Node(val);
        node.next=this.dummyTail;
        node.prev=this.dummyTail.prev;
        node.prev.next=node;
        node.next.prev=node;
        this.size++ ;
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
        Node cur=this.dummyHead.next;
        for(int i=0; i<index;i++){
            cur=cur.next;
        }
        node.next=cur;
        node.prev=cur.prev;
        node.next.prev=node;
        node.prev.next=node;
        this.size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=this.size){
            return ;
        }
        Node cur=this.dummyHead.next;
        for(int i=0; i<index; i++){
            cur=cur.next;
        }
        cur.prev.next=cur.next;
        cur.next.prev=cur.prev;
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