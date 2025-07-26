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
    Map<Node,Node> map;
    public Node cloneGraph(Node node) {
        map= new HashMap<>();
        return dfs(node);
    }
    private Node dfs(Node node){
        if(node==null){
            return null;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        map.put(node,new Node(node.val));
        for(Node nei:node.neighbors){
            map.get(node).neighbors.add(dfs(nei));
        }
        return map.get(node);
    }

}