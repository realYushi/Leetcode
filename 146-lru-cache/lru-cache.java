class Node{
    int val;
    int key;
    Node prev;
    Node next;
    public Node(int key, int val){
        this.key=key;
        this.val=val;
        Node prev=null;
        Node next=null;
    }
    public Node(){
        this.key=0;
        this.val=0;
        Node prev=null;
        Node next=null;
    }
}
class LRUCache {
    int cap;
    List<Node> list;
    Node dummyHead;
    Node dummyTail;
    Map <Integer, Node> cache;

    public LRUCache(int capacity) {
        this.cap=capacity;
        this.list=new LinkedList<>();
        this.cache=new HashMap<>();
        this.dummyHead=new Node();
        this.dummyTail=new Node();
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
        return -1;
    }
    

    public void put(int key, int value) {
        Node node = new Node(key,value);
        if(this.cache.containsKey(node.key)){
            Node temp=this.cache.get(node.key);
            this.cache.put(node.key,node);
            remove(temp);
            insert(node);
        }else{
            this.cache.put(node.key,node);
            insert(node);
        }
        if(this.cache.size()>this.cap){
            Node lru= this.dummyHead.next;
            this.cache.remove(lru.key);
            remove(lru);

        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */