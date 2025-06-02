class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int s:students){
            q.add(s);
        }
        int eaten=0;
        for(int s:sandwiches){
            int att=0;
            int len=q.size();
            while(att!=len){
                if(q.peek()==s){
                    q.remove();
                    eaten++;
                    break;
                }
                else{
                    q.add(q.remove());
                    att++;
                }
            }
            if(att==len){
                break;
            }
        }
        return sandwiches.length-eaten;

        
    }
}