class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q= new LinkedList<>();
        for(int n: students){
            q.add(n);
        }
        int eaten=0;
        for(int s:sandwiches){
            int len=q.size();
            int att=0;
            while(att!=len){
                if(q.peek()==s){
                    q.remove();
                    eaten++;
                    break;
                }
                att++;
                q.add(q.remove());


            }

            if(att==len){
                break;
            }
        }
        return sandwiches.length-eaten;
        
    }
}