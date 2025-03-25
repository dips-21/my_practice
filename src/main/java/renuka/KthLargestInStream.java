package renuka;

import java.util.PriorityQueue;

public class KthLargestInStream {
    PriorityQueue<Integer> heap;
    private int k;

    public KthLargestInStream(int k, int[] nums) {
        heap = new PriorityQueue<>(k);
        this.k = k;

        for (int i : nums)
            heap.add(i);

        while(heap.size()>k)
            heap.remove();
    }

    public int add(int val) {
        this.heap.add(val);
        if (heap.size()>k)
            heap.remove();
        return heap.peek();
    }
}

