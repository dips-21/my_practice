package renuka;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue(Comparator.reverseOrder());
        for (int i : stones) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            Integer x = queue.poll();
            Integer y = queue.poll();
            if (x != y) {
                y = x-y;
                queue.add(y);
            }
        }
        return queue.isEmpty() ? 0 : queue.peek();
    }

    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : nums) {
            heap.add(i);
        }
        if (heap.size() >= 2) {
            Integer first = heap.poll();
            Integer second = heap.poll();
            return (first - 1) * (second - 1);
        }
        return 0;
    }

}