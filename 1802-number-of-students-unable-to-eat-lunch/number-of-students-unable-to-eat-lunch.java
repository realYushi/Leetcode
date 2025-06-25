class Solution {

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int n : students) {
            q.add(n);
        }
        int eaten = 0;
        for (int s : sandwiches) {
                int att = 0;
                int len = q.size();
            while (att != q.size()) {
                if (s == q.peek()) {
                    q.remove();
                    eaten++;
                    break;
                }
                att++;
                q.add(q.remove());


            }
            if (att == len) {
                break;
            }
        }
        return sandwiches.length - eaten;

    }
}