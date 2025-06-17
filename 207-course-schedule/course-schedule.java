class Solution {
    Map<Integer, List<Integer>> map= new HashMap<>();
    Set<Integer> set = new HashSet();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0; i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] pr:prerequisites){
            map.get(pr[0]).add(pr[1]);
        }
        for(int i=0; i<numCourses;i++){
            if(!dfs(i)){
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int course){
        if(set.contains(course)){
            return false;
        }
        if(map.get(course).isEmpty()){
            return true;
        }
        set.add(course);
        for(int pre:map.get(course)){
            if(!dfs(pre)){
                return false;
            }
        }
        set.remove(course);
        map.put(course,new ArrayList<>());
        return true;

    }
}