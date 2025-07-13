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
    Map<Integer, Node> map;
    int cap;
    public LRUCache(int capacity) {
        this.dummyHead= new Node();
        this.dummyTail= new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
        this.cap=capacity;
        this.map= new HashMap<>();
    }
    private void add(Node node){
        node.next=dummyHead.next;
        node.prev=dummyHead;
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
            add(node);
        }else{
            add(node);
        }
        map.put(node.key,node);
        if(map.size()>this.cap){
            Node lru=this.dummyTail.prev;
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