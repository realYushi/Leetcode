class Solution {
    Map<Integer,List<Integer>> map;
    Set<Integer> set;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        map=new HashMap<>();
        set=new HashSet<>();
        for(int i=0; i<numCourses; i++){
            map.put(i, new LinkedList<>());
        }
        for(int[] pair:prerequisites ){
            map.get(pair[0]).add(pair[1]);
        }
        for(int i=0; i<numCourses;i++){
            if(!dfs(i)){
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int i){
        if(set.contains(i)){
            return false;
        }
        if(map.get(i).isEmpty()){
            return true;
        }
        set.add(i);
        for(int pre:map.get(i)){
            if(!dfs(pre)){
                return false;
            }
        }
        map.put(i, new LinkedList<>());
        set.remove(i);
        return true;
    }
}