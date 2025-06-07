class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>q= new LinkedList<>();
        for(int s:students){
            q.add(s);
        }
        int eatten=0;
        for(int s:sandwiches){
            int att=0;
            int len=q.size();
            while(att!=len){
                if(s==q.peek()){
                    q.remove();
                    eatten++;
                    break;
                }else{
                    q.add(q.remove());
                    att++;
                }
            }
            if(att==len){
                break;
            }
        }
        return sandwiches.length-eatten;

        
    }
}