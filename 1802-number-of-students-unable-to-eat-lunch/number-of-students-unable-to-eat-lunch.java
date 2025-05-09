class Solution {
    Queue<Integer> q;

    public int countStudents(int[] students, int[] sandwiches) {
        this.q = new LinkedList<>();
        for (int s : students) {
            this.q.add(s);
        }
        int eaten = 0;
        for (int s : sandwiches) {
            int len = q.size();
            int att = 0;
            while (len != att) {
                if (s == q.peek()) {
                    q.remove();
                    eaten++;
                    break;
                } else {
                    q.add(q.remove());
                    att++;
                }
            }
            if (att == len) {
                break;
            }
        }
        return sandwiches.length - eaten;

    }
}