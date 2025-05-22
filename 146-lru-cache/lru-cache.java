class Node{
    public Node prev;
    public Node next;
    public int val;
    public int key;
    public Node(int key, int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }
    public Node(){
        this.key=0;
        this.val=0;
        this.prev=null;
        this.next=null;
    }
}
class LRUCache {
    Node dummyHead;
    Node dummyTail;
    Map<Integer,Node> cache;
    int cap;
    public LRUCache(int capacity) {
        this.cap=capacity;
        this.cache=new HashMap<>();
        this.dummyHead=new Node();
        this.dummyTail=new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
    }
    private void insert(Node node){
        node.next=this.dummyTail;
        node.prev=this.dummyTail.prev;
        node.next.prev=node;
        node.prev.next=node;
        return;
    }
    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        return;
    }
    
    public int get(int key) {
        if(this.cache.containsKey(key)){
            Node node = this.cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return  -1;
    }
    
    public void put(int key, int value) {
        if(this.cache.containsKey(key)){
            remove(this.cache.get(key));
        }
        Node node = new Node(key,value);
        this.cache.put(key,node);
        insert(node);
        if(this.cap<this.cache.size()){
            Node lru= this.dummyHead.next;
            remove(lru);
            this.cache.remove(lru.key);
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