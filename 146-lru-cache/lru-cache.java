class Node{
    Node next;
    Node prev;
    int key;
    int val;
    public Node(int key, int val){
        this.key=key;
        this.val=val;
        Node next=null;
        Node prev=null;
    }
    public Node(){
        this.key=0;
        this.val=0;
        Node next=null;
        Node prev=null;
    }
}
class LRUCache {
    Node dummyHead;
    Node dummyTail;
    Map<Integer,Node> map;
    int cap;

    public LRUCache(int capacity) {
        this.cap=capacity;
        this.dummyHead=new Node();
        this.dummyTail=new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
        this.map= new HashMap<>();
    }
    private void add(Node node){
        node.next=this.dummyHead.next;
        node.prev=this.dummyHead;
        node.prev.next=node;
            node.next.prev=node;
    }
    private void remove(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node= this.map.get(key);
        remove(node);
        add(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        Node node= new Node(key,value);
        if(map.containsKey(node.key)){
            remove(map.get(node.key));
        }
        map.put(node.key,node);
        add(node);
        if(map.size()>this.cap){
            Node lru= this.dummyTail.prev;
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