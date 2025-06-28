class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q= new LinkedList<>();
        for(int i:students){
            q.add(i);
        }
        int eaten=0;
        for(int n:sandwiches){
            int att=0;
            int len=q.size();
            while(att!=q.size()){
                if(q.peek()!=n){
                    q.add(q.remove());
                    att++;
                }else{
                    q.remove();
                    eaten++;
                    break;
                }
            }
            if(att==len){
                break;
            }
        }
        return sandwiches.length-eaten;


        
    }
}