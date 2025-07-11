class Node{
    Node prev;
    Node next;
    int key;
    int val;
    public Node(int key, int val){
        this.prev= null;
        this.next=null;
        this.key=key;
        this.val=val;
    }
    public Node(){
        this.prev= null;
        this.next=null;
        this.key=0;
        this.val=0;
    }
}
class LRUCache {
    Node dummyHead;
    Node dummyTail;
    Map<Integer,Node> map;
    int cap;

    public LRUCache(int capacity) {
        this.cap=capacity;
        this.map= new HashMap<>();
        this.dummyHead=new Node();
        this.dummyTail=new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
    }
        
    private void add(Node node){
        node.next=dummyHead.next;
        node.prev=dummyHead;
        node.prev.next=node;
        node.next.prev=node;

    }
    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            add(node);
            return node.val;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        Node node = new Node(key,value);
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        map.put(node.key,node);
        add(node);
        if(map.size()>this.cap){
            Node lru= dummyTail.prev; 
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