class Solution {
    Map<Integer,List<Integer>> map= new HashMap<>();
    Set<Integer> set= new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0; i<numCourses; i++){
            map.put(i,new LinkedList<>());
        }
        for(int[] rule:prerequisites){
            map.get(rule[0]).add(rule[1]);
        }
        for(int i=0; i<numCourses; i++){
            if(!dfs(i)){
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int cousres){
        if(set.contains(cousres)){
            return false;
        }
        if(map.get(cousres).isEmpty()){
            return true;
        }
        set.add(cousres);
        for(int pre:map.get(cousres)){
            if(!dfs(pre)){
                return false;
            }
        }
        set.remove(cousres);
        map.put(cousres,new LinkedList<>());
        return true;

    }
}