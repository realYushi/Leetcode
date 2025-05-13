class Node{
    int key;
    int value;  
    Node prev;
    Node next;
    public Node(int key,int val){
        this.key=key;
        this.value=val;
        this.prev=null;
        this.next=null; 
    }
    public Node(){
        this.key=0;
        this.value=0;
        this.prev=null;
        this.next=null; 
    }
}
class LRUCache {
    private Node dummyHead;
    private Node dummyTail;
    private int cap;
    private HashMap<Integer,Node> catche;
    public LRUCache(int capacity) {
        this.dummyHead=new Node();
        this.dummyTail=new Node();
        this.dummyHead.next=this.dummyTail;
        this.dummyTail.prev=this.dummyHead;
        this.cap=capacity;
        this.catche=new HashMap<>();
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
        if(this.catche.containsKey(key)){
            Node node = this.catche.get(key);
            this.remove(node);
            this.insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(this.catche.containsKey(key)){
            this.remove(this.catche.get(key));
        }
        Node node= new Node(key,value);
        this.catche.put(key,node);
        this.insert(node);
        if(this.catche.size()>this.cap){
            Node least=this.dummyHead.next;
            this.catche.remove(least.key);
            remove(least);
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