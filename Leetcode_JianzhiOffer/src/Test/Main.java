package Test;
import java.util.*;

public class Main {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] first, int[] next) {
                return first[0] - next[0];
            }
        });
        int N_L = matrix.length;
        for (int i = 0; i < N_L; i++) {
            priorityQueue.offer(new int[]{matrix[i][0], i, 0});
        }
        for (int i = 0; i < k - 1; i++) {
            int[] now = priorityQueue.poll();
            if (now[2] != N_L - 1) {
                priorityQueue.offer(new int[]{matrix[now[1]][now[2] + 1], now[1], now[2] + 1});
            }
        }
        return Objects.requireNonNull(priorityQueue.poll())[0];
    }

}
