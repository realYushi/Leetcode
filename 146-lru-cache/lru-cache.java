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
    Map<Integer, Node> map;
    int cap;
    Node dummyTail;
    Node dummyHead;
    public LRUCache(int capacity) {
        this.cap=capacity;
        this.map= new HashMap<>();
        this.dummyHead=new Node();
        this.dummyTail= new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
    }
    private void add(Node node){
        node.next=dummyHead.next;
        node.prev=dummyHead;
        node.next.prev=node;
        node.prev.next=node;
    }
    private void remove(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node= map.get(key);
        remove(node);
        add(node);
        return node.val;
    }
    public void put(int key, int value) {
        Node node=null;
        if(map.containsKey(key)){
            node=map.get(key);
            node.val=value;
            remove(node);
        }else{
            node= new Node(key,value);
        }
        add(node);
        map.put(key,node);
        if(map.size()>this.cap){
            Node lru = dummyTail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */