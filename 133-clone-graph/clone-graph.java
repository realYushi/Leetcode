/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> old2new=new HashMap<>();
        return dfs(old2new,node);
    }
    private Node dfs(Map<Node,Node> old2new,Node node){
        if(node==null){
            return null;
        }
        if(old2new.containsKey(node)){
            return old2new.get(node);
        }
        old2new.put(node,new Node(node.val));
        for(Node nei:node.neighbors){
            old2new.get(node).neighbors.add(dfs(old2new,nei));
        }
        return old2new.get(node);

    }
        
}