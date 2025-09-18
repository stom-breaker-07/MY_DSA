package MY_DSA.Leet;

import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Leet3408 {

    static HashMap<Integer,Integer> uid_tid;
    static HashMap<Integer,Integer> tid_pri;
    static PriorityQueue<int[]> pq;

    public void TaskManager(List<List<Integer>> tasks) {
        uid_tid = new HashMap<>();
        tid_pri = new HashMap<>();
        pq = new PriorityQueue<>((a, b) -> {
            if (b[0] != a[0]) return b[0] - a[0];
            return b[1] - a[1];
        });

        for (List<Integer> t : tasks) {
            int userId = t.get(0), taskId = t.get(1), pri = t.get(2);
            uid_tid.put(taskId, userId);
            tid_pri.put(taskId, pri);
            pq.offer(new int[]{pri, taskId});
        }
    }

    public void add(int userId, int taskId, int priority) {
        uid_tid.put(taskId, userId);
        tid_pri.put(taskId, priority);
        pq.offer(new int[]{priority, taskId});
    }

    public void edit(int taskId, int newPriority) {
        tid_pri.put(taskId, newPriority);
        pq.offer(new int[]{newPriority, taskId});
    }

    public void rmv(int taskId) {
        uid_tid.remove(taskId);
        tid_pri.remove(taskId);
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int pri = top[0], tid = top[1];

            if (tid_pri.containsKey(tid) && tid_pri.get(tid) == pri) {
                int userId = uid_tid.get(tid);
                uid_tid.remove(tid);
                tid_pri.remove(tid);
                return userId;
            }
        }
        return -1;
    }
}
