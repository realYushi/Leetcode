class Node{
    public int val;
    public Node prev;
    public Node next;

    public Node(int val){
        this.val=val;
    }
    public Node(){
    }
}
class MyLinkedList {
    int size;
    Node dummyHead;
    Node dummyTail;
    

    public MyLinkedList() {
        this.dummyHead=new Node();
        this.dummyTail=new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
        this.size=0;
    }
    
    public int get(int index) {
        if(index>=this.size||index<0){
            return -1; 
        }
        Node curr=this.dummyHead.next;
        for(int i=0; i<index; i++){
            curr=curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);

        node.next=this.dummyHead.next;
        node.next.prev =node;
        
        this.dummyHead.next=node;
        node.prev=this.dummyHead;

        this.size++;
    }
    
    public void addAtTail(int val) {
         Node node = new Node(val);

         node.next=this.dummyTail;
         node.prev=this.dummyTail.prev;

         node.next.prev=node;
         node.prev.next=node;
        
         this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>this.size||index<0){
            return ;
        }
        if(index==0){
            this.addAtHead(val);
            return;
        }
        if(this.size==index){
            this.addAtTail(val);
            return;
        }
        Node node = new Node(val);
        Node curr = this.dummyHead.next;
        for(int i=0; i<index; i++){
            curr=curr.next;
        }
        node.prev=curr.prev;
        node.next=curr;

        curr.prev.next=node;
        curr.prev=node;


        
         this.size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index>=this.size||index<0 ){
            return;
        }
        Node curr = this.dummyHead.next;
        for(int i=0; i<index; i++){
            curr=curr.next;
        }
        curr.prev.next=curr.next;
        curr.next.prev=curr.prev;

        
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