class Node {
    int key;
    int value;
    Node next;
    Node prev;
    public Node(int key, int value){
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=null;
    }
    public Node(){
        this.key=0;
        this.value=0;
        this.next=null;
        this.prev=null;
    }
}
class LRUCache {
    int cap;
    Map<Integer, Node> cache;
    Node dummyHead;
    Node dummyTail;
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
        node.next.prev=node.prev;
        node.prev.next=node.next;
        return;
    }
    
    public int get(int key) {
        if(this.cache.containsKey(key)){
            Node node=this.cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(this.cache.containsKey(key)){
            remove(this.cache.get(key));
        }
        Node node =new Node(key,value); 
        insert(node);
        this.cache.put(node.key,node);
        if(this.cache.size()>this.cap){
            Node lru=this.dummyHead.next;
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