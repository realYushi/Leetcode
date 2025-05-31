import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Max-Heap: The element with the largest distance will be at the peek.
        // We store {distance_sq, x, y}
        Queue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparingInt(a -> -a[0]));

        for (int[] p : points) {
            int x = p[0];
            int y = p[1];
            int distSq = x * x + y * y; // Use squared distance to avoid sqrt

            // Add the current point's info to the max-heap
            maxHeap.offer(new int[]{distSq, x, y});

            // If the heap size exceeds k, remove the largest element (farthest point)
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Removes the element with the largest distSq (the farthest one)
            }
        }

        // At this point, the maxHeap contains the k closest points
        // (or fewer if total points < k).
        // Now, extract them into the result array.
        int[][] result = new int[maxHeap.size()][2]; // Size might be less than k if points.length < k
        int index = 0;
        while (!maxHeap.isEmpty()) {
            int[] pointInfo = maxHeap.poll(); // Polls them in decreasing order of distance (due to max-heap)
            result[index][0] = pointInfo[1]; // x-coordinate
            result[index][1] = pointInfo[2]; // y-coordinate
            index++;
        }

        return result;
    }
}