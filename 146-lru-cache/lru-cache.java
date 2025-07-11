class Node{
    Node prev;
    Node next;
    int key;
    int val;
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
    int cap;
    Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.dummyHead=new Node();
        this.dummyTail=new Node();
        this.cap=capacity;
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
        this.map=new HashMap<>();
    }
    private void add(Node node){
        Node cur= dummyTail.prev;
        node.next=dummyTail;
        node.prev=cur;
        node.next.prev=node;
        node.prev.next=node;
    }
    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key); 
        remove(node);
        add(node);
        return node.val;
        
    }
    
    public void put(int key, int value) {
        Node node = new Node(key,value);
        if(map.containsKey(node.key)){
            remove(map.get(node.key));
        }
        map.put(node.key,node);
        add(node);
        if(map.size()>this.cap){
            Node lru= dummyHead.next;
            map.remove(lru.key);
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