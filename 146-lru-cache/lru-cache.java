class Node{
    int val;
    int key;
    Node next;
    Node prev;
    public Node(){
        this.val=0;
        this.key=0;
        this.next=null;
        this.prev=null;
    }
    public Node(int key, int val){
        this.val=val;
        this.key=key;
        this.next=null;
        this.prev=null;
    }
}
class LRUCache {
    Node dummyHead;
    Node dummyTail;
    Map<Integer,Node> cache;
    int cap;
    public LRUCache(int capacity) {
        this.cap=capacity;
        this.cache= new HashMap<>();
        this.dummyHead= new Node();
        this.dummyTail= new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
    }
    private void insert(Node node){
        node.next=this.dummyTail;
        node.prev=this.dummyTail.prev;
        node.prev.next=node;
        node.next.prev=node;
        return;
    }
    private void remove(Node node){
        Node next=node.next;
        Node prev= node.prev;
        node.prev.next=next;
        node.next.prev=prev;
        return;
    }
    
    public int get(int key) {
        if(this.cache.containsKey(key)){
            Node node = this.cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(this.cache.containsKey(key)){
            Node node=this.cache.get(key);
            remove(node);
        }
        Node node = new Node(key,value);
        this.cache.put(key,node);
        insert(node);
        if(this.cache.size()>this.cap){
            Node lru= this.dummyHead.next;
            this.cache.remove(lru.key);
            remove(lru);
        }
        return;
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */