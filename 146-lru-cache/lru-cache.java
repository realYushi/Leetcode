class Node{
    int key;
    int val;
    Node prev;
    Node next;
    public Node(int key , int val){
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
    Map<Integer,Node> map;
    Node dummyHead;
    Node dummyTail;
    int cap;
    public LRUCache(int capacity) {
        this.cap=capacity;
        this.map= new HashMap<>();
        this.dummyHead= new Node();
        this.dummyTail= new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
    }
    private void add(Node node){
        node.next=dummyTail;
        node.prev=dummyTail.prev;
        node.next.prev=node;
        node.prev.next=node;
    }
    private void remove(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node= map.get(key);
            remove(node);
            add(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node node = new Node(key,value);
        if(map.containsKey(node.key)){
            remove(map.get(key));
        }else{
            if(map.size()==this.cap){
                Node lru= this.dummyHead.next;
                remove(lru);
                map.remove(lru.key);
            }
        }
        add(node);
        map.put(node.key,node);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */